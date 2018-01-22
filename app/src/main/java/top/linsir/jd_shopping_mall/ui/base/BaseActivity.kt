package top.linsir.jd_shopping_mall.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import top.linsir.jd_shopping_mall.interf.BaseViewInterface

/**
 *  Created by linSir
 *  date at 2018/1/22.
 *  describe:
 */
abstract class BaseActivity : AppCompatActivity(), BaseViewInterface.BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun showLoading() {
        Log.i("lin", "---lin--->  showLoading...");
    }

    override fun showSuccess() {

    }

    override fun showError() {

    }

    override fun showNoNet() {

    }

    open fun isHaveTitleBar() {

    }

    override fun onDestroy() {
        super.onDestroy()
    }


}