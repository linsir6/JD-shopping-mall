package top.linsir.mall.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.trello.rxlifecycle2.kotlin.bindToLifecycle
import kotlinx.android.synthetic.main.item_home_fragment.*
import top.linsir.mall.R
import top.linsir.mall.base.BaseFragment
import top.linsir.mall.model.Repo
import top.linsir.mall.network.ApiClient
import top.linsir.mall.network.ApiErrorModel
import top.linsir.mall.network.ApiResponse


/**
 *  Created by linSir
 *  date at 2018/1/23.
 *  describe:
 */
class SortFragment: BaseFragment(){

    private var mainView: View? = null


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mainView ?: let {
            mainView = inflater.inflate(R.layout.fragment_sort, container, false)
        }
        return mainView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        text.setOnClickListener { fetchRepo() }


    }

    private fun fetchRepo() {
        ApiClient.instance.service.listRepos()
                .compose(NetworkScheduler.compose())
                .bindToLifecycle(this)
                .subscribe(object : ApiResponse<Repo>(this.context!!) {
                    override fun success(data: Repo) {
                        Toast.makeText(activity, "aaa", Toast.LENGTH_SHORT).show();

                    }

                    override fun failure(statusCode: Int, apiErrorModel: ApiErrorModel) {
                        Log.i("lin", "---lin--->  " + apiErrorModel.status)
                        Log.i("lin", "---lin--->  " + apiErrorModel.message)
                        Toast.makeText(activity, "bbb", Toast.LENGTH_SHORT).show();

                    }
                })
    }

    override fun cancelRequest() {

    }


}