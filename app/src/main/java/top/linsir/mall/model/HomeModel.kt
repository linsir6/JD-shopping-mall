package top.linsir.mall.model

import android.content.Context
import top.linsir.mall.presenter.HomePresenter

/**
 *  Created by linSir
 *  date at 2018/1/25.
 *  describe:
 */
interface HomeModel {


    fun login(
            onLoginListener: HomePresenter.OnLoginListener,
            context: Context,
            username: String,
            password: String
    )


}