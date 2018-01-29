package top.linsir.jd_shopping_mall.model

import kotlinx.coroutines.experimental.Deferred
import top.linsir.jd_shopping_mall.delegate.LoginResponse
import top.linsir.jd_shopping_mall.presenter.HomePresenter

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
        TODO("网络请求")
    }

    override fun collectArticle(onCollectArticleListener: HomePresenter.OnLoginListener, id: Int, isAdd: Boolean) {

    }

    override fun cancelCollectRequest() {

    }


}