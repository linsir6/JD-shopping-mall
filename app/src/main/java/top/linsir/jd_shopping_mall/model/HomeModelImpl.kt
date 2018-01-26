package top.linsir.jd_shopping_mall.model

import android.provider.Contacts
import kotlinx.coroutines.experimental.Deferred
import kotlinx.coroutines.experimental.android.UI
import top.linsir.jd_shopping_mall.presenter.HomePresenter
import kotlinx.coroutines.experimental.async
import top.linsir.jd_shopping_mall.cancelByActive
import top.linsir.jd_shopping_mall.delegate.LoginResponse
import top.linsir.jd_shopping_mall.tryCatch
/**
 *  Created by linSir
 *  date at 2018/1/25.
 *  describe:
 */
class HomeModelImpl : HomeModel, CollectArticleModel {

    private var loginAsync: Deferred<LoginResponse>? = null


    override fun loginWanAndroid(
            onLoginListener: HomePresenter.OnLoginListener,
            username: String, password: String
    ) {
        async(UI) {
            tryCatch({
                it.printStackTrace()
                onLoginListener.loginFailed(it.toString())
            }) {
                loginAsync?.cancelByActive()
                loginAsync = RetrofitHelper.retrofitService.loginWanAndroid(username, password)
                val result = loginAsync?.await()
                result ?: let {
                    onLoginListener.loginFailed(Constant.RESULT_NULL)
                    return@async
                }
                onLoginListener.loginSuccess(result)
            }
        }
    }

    override fun collectArticle(onCollectArticleListener: HomePresenter.OnLoginListener, id: Int, isAdd: Boolean) {

    }

    override fun cancelCollectRequest() {

    }


}