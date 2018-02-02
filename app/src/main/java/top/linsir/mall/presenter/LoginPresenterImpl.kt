package top.linsir.mall.presenter

import android.content.Context
import top.linsir.mall.delegate.LoginResponse
import top.linsir.mall.model.HomeModel
import top.linsir.mall.model.HomeModelImpl
import top.linsir.mall.view.LoginView

/**
 *  Created by linSir
 *  date at 2018/1/25.
 *  describe:
 */
class LoginPresenterImpl(private val loginView: LoginView) : HomePresenter.OnLoginListener,HomePresenter.OnRegisterListener{

    private val homeModel: HomeModel = HomeModelImpl()


    override fun registerWanAndroid(username: String, password: String, repassword: String) {

    }

    override fun registerSuccess(result: LoginResponse) {

    }

    override fun registerFailed(errorMessage: String?) {

    }

    override fun login(context: Context, username: String, password: String) {
        homeModel.login(this, context, username, password)
    }

    override fun loginSuccess(result: LoginResponse) {
        if(result.errorCode != 0){
            loginView.loginSuccess(result)
        }



    }

    override fun loginFailed(errorMessage: String?) {

    }


}