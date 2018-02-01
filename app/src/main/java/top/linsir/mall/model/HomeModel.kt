package top.linsir.mall.model

import top.linsir.mall.presenter.HomePresenter

/**
 *  Created by linSir
 *  date at 2018/1/25.
 *  describe:
 */
interface HomeModel {


    fun loginWanAndroid(
            onLoginListener: HomePresenter.OnLoginListener,
            username: String,
            password: String
    )


}