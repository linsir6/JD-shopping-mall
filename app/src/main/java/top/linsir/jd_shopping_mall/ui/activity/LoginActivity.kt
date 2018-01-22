package top.linsir.jd_shopping_mall.ui.activity

import android.os.Bundle
import top.linsir.jd_shopping_mall.R
import top.linsir.jd_shopping_mall.ui.base.BaseActivity

/**
 *  Created by linSir
 *  date at 2018/1/22.
 *  describe:
 */
class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showLoading();

    }

    override fun isHaveTitleBar() {

    }


}