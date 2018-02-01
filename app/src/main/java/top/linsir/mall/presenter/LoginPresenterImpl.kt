package top.linsir.mall.presenter

import top.linsir.mall.delegate.LoginResponse
import top.linsir.mall.view.LoginView

/**
 *  Created by linSir
 *  date at 2018/1/25.
 *  describe:
 */
class LoginPresenterImpl(private val loginView: LoginView) : HomePresenter.OnLoginListener,HomePresenter.OnRegisterListener{



    override fun registerWanAndroid(username: String, password: String, repassword: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerSuccess(result: LoginResponse) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerFailed(errorMessage: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loginWanAndroid(username: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loginSuccess(result: LoginResponse) {
        if(result.errorCode != 0){
            loginView.loginSuccess(result);
        }



    }

    override fun loginFailed(errorMessage: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}