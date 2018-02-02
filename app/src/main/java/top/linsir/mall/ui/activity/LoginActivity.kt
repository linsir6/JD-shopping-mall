package top.linsir.mall.ui.activity

import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import top.linsir.mall.R
import top.linsir.mall.base.BaseActivity
import top.linsir.mall.delegate.LoginResponse
import top.linsir.mall.presenter.LoginPresenterImpl
import top.linsir.mall.view.LoginView

/**
 *  Created by linSir
 *  date at 2018/1/22.
 *  describe:
 */
class LoginActivity : BaseActivity(), LoginView {


    private val loginPresenter: LoginPresenterImpl by lazy {
        LoginPresenterImpl(this);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login.setOnClickListener(onClickListener)
        visible_password.setOnClickListener(onClickListener)
        back.setOnClickListener(onClickListener)
        register.setOnClickListener(onClickListener)
        login_wechat.setOnClickListener(onClickListener)
        login_qq.setOnClickListener(onClickListener)




    }

    override fun cancelRequest() {

    }

    override fun setLayoutId(): Int {
        return R.layout.activity_login;
    }

    override fun loginSuccess(result: LoginResponse) {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    override fun loginFailed(errorMessage: String?) {
        Toast.makeText(this, "登录失败 ", Toast.LENGTH_SHORT).show();
    }

    override fun registerSuccess(result: LoginResponse) {

    }

    override fun registerFailed(errorMessage: String?) {

    }

    override fun loginRegisterAfter(result: LoginResponse) {

    }


    private val onClickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.login -> {
                loginPresenter.loginWanAndroid(this, input_username.text.toString(), input_password.text.toString())
            }

            R.id.visible_password -> {

            }

            R.id.back -> {

            }

            R.id.register -> {

            }

            R.id.login_wechat -> {

            }

            R.id.login_qq -> {

            }

        }
    }










}