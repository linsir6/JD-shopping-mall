package top.linsir.mall.view

import top.linsir.mall.delegate.LoginResponse

/**
 *  Created by linSir
 *  date at 2018/1/29.
 *  describe:
 */
interface LoginView {

    /**
     * login success
     * @param result LoginResponse
     */
    fun loginSuccess(result: LoginResponse)

    /**
     * login failed
     * @param errorMessage error message
     */
    fun loginFailed(errorMessage: String?)

    /**
     * register success
     * @param result LoginResponse
     */
    fun registerSuccess(result: LoginResponse)

    /**
     * register failed
     * @param errorMessage error message
     */
    fun registerFailed(errorMessage: String?)

    /**
     * login or register success after operation
     * @param result LoginResponse
     */
    fun loginRegisterAfter(result: LoginResponse)
}