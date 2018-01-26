package top.linsir.jd_shopping_mall.ui.activity

import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import top.linsir.jd_shopping_mall.R
import top.linsir.jd_shopping_mall.base.BaseActivity
import top.linsir.jd_shopping_mall.delegate.LoginResponse
import top.linsir.jd_shopping_mall.presenter.LoginPresenterImpl
import top.linsir.jd_shopping_mall.view.LoginView

/**
 *  Created by linSir
 *  date at 2018/1/22.
 *  describe:
 */
class LoginActivity : BaseActivity(), LoginView {
    override fun loginSuccess(result: LoginResponse) {
        Toast.makeText(this, "成功", Toast.LENGTH_SHORT).show();
    }

    override fun loginFailed(errorMessage: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerSuccess(result: LoginResponse) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerFailed(errorMessage: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loginRegisterAfter(result: LoginResponse) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    private val loginPresenter: LoginPresenterImpl by lazy {
        LoginPresenterImpl(this);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                loginPresenter.loginWanAndroid("1","1");

            }

        })

    }

    override fun cancelRequest() {

    }

    override fun setLayoutId(): Int {
        return R.layout.activity_main;
    }



}