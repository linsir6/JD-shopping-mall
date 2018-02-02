package top.linsir.mall.model

import NetworkScheduler
import android.content.Context
import android.util.Log
import kotlinx.coroutines.experimental.Deferred
import top.linsir.mall.delegate.LoginResponse
import top.linsir.mall.network.ApiClient
import top.linsir.mall.network.ApiErrorModel
import top.linsir.mall.network.ApiResponse
import top.linsir.mall.presenter.HomePresenter

/**
 *  Created by linSir
 *  date at 2018/1/25.
 *  describe:
 */
class HomeModelImpl : HomeModel, CollectArticleModel {

    private var loginAsync: Deferred<LoginResponse>? = null


    override fun loginWanAndroid(onLoginListener: HomePresenter.OnLoginListener, context: Context, username: String, password: String) {

        ApiClient.instance.service.listRepos()
                .compose(NetworkScheduler.compose())
                .subscribe(object : ApiResponse<Repo>(context) {
                    override fun success(data: Repo) {
                        Log.i("lin", "---lin--->  1111111")

                    }

                    override fun failure(statusCode: Int, apiErrorModel: ApiErrorModel) {
                        Log.i("lin", "---lin--->  " + apiErrorModel.status)
                        Log.i("lin", "---lin--->  " + apiErrorModel.message)

                    }
                })

    }


    override fun collectArticle(onCollectArticleListener: HomePresenter.OnLoginListener, id: Int, isAdd: Boolean) {

    }

    override fun cancelCollectRequest() {

    }


}