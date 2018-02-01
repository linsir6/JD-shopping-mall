package top.linsir.mall.ui.activity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.trello.rxlifecycle2.android.ActivityEvent
import com.trello.rxlifecycle2.kotlin.bindUntilEvent
import kotlinx.android.synthetic.main.activity_main.*
import top.linsir.mall.R
import top.linsir.mall.base.BaseActivity
import top.linsir.mall.model.Repo
import top.linsir.mall.network.ApiClient
import top.linsir.mall.network.ApiErrorModel
import top.linsir.mall.network.ApiResponse
import top.linsir.mall.ui.adapter.HomeActivityAdapter


/**
 *  Created by linSir
 *  date at 2018/1/23.
 *  describe:
 */
class HomeActivity : BaseActivity() {

    override fun setLayoutId(): Int = R.layout.activity_main


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val adapter = HomeActivityAdapter(supportFragmentManager)
        viewPager.adapter = adapter
        viewPager.offscreenPageLimit = 4
        tabLayout.setupWithViewPager(viewPager)
        adapter.init(tabLayout, this)
        adapter.setupTabLayout(tabLayout, viewPager)

    }

    override fun cancelRequest() {

    }


    private fun fetchRepo() {
        ApiClient.instance.service.listRepos()
                .compose(NetworkScheduler.compose())
                .bindUntilEvent(this, ActivityEvent.DESTROY)
                .subscribe(object : ApiResponse<Repo>(this) {
                    override fun success(data: Repo) {
                        Toast.makeText(this@HomeActivity, "zzzz", Toast.LENGTH_SHORT).show()
                    }

                    override fun failure(statusCode: Int, apiErrorModel: ApiErrorModel) {
                        Log.i("lin", "---lin--->  " + apiErrorModel.status)
                        Log.i("lin", "---lin--->  " + apiErrorModel.message)
                        Toast.makeText(this@HomeActivity, "111111111", Toast.LENGTH_SHORT).show()
                    }
                })
    }

}