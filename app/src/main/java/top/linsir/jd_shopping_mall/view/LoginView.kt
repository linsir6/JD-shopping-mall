package top.linsir.jd_shopping_mall.view

import top.linsir.jd_shopping_mall.delegate.LoginResponse

/**
 *  Created by linSir
 *  date at 2018/1/24.
 *  describe:
 */

interface LoginView {

    fun loginSuccess(result: LoginResponse)

    fun loginFailed(errorMessage: String?)

    fun registerSuccess(result: LoginResponse)

    fun registerFailed(errorMessage: String?)

    fun loginRegisterAfter(result: LoginResponse)


}