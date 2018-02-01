package top.linsir.mall.presenter

import top.linsir.mall.delegate.LoginResponse

/**
 *  Created by linSir
 *  date at 2018/1/25.
 *  describe:
 */
interface HomePresenter {


    interface OnHomeListListener {

        fun getHomeList(page: Int = 0)

        fun getHomeListSuccess()

        fun getHomeListFailed(errorMessage: String?)

    }


    interface OnTypeTreeListListener {

        fun getTypeTreeList()

        fun getTypeTreeListSuccess()

        fun getTypeTreeListFailed(errorMessage: String?)

    }

    interface OnRegisterListener {

        fun registerWanAndroid(username: String, password: String, repassword: String)

        fun registerSuccess(result: LoginResponse)

        fun registerFailed(errorMessage: String?)

    }


    interface OnLoginListener {

        fun loginWanAndroid(username: String, password: String)

        fun loginSuccess(result: LoginResponse)

        fun loginFailed(errorMessage: String?)
    }


    interface OnFriendListListener {


    }


}