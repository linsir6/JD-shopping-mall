package top.linsir.mall.ui.activity

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import top.linsir.mall.R
import top.linsir.mall.base.BaseActivity

/**
 *  Created by linSir
 *  date at 2018/1/22.
 *  describe:
 */
class LoginActivity : BaseActivity() {


//    private val loginPresenter: LoginPresenterImpl by lazy {
//        //LoginPresenterImpl(this);
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                //loginPresenter.loginWanAndroid("1","1");

            }

        })

    }

    override fun cancelRequest() {

    }

    override fun setLayoutId(): Int {
        return R.layout.activity_main;
    }



}