package top.linsir.jd_shopping_mall.ui.activity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import top.linsir.jd_shopping_mall.R
import top.linsir.jd_shopping_mall.base.BaseActivity
import top.linsir.jd_shopping_mall.ui.adapter.HomeAdapter

/**
 *  Created by linSir
 *  date at 2018/1/23.
 *  describe:
 */
class HomeActivity : BaseActivity() {

    override fun setLayoutId(): Int = R.layout.activity_main


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val adapter = HomeAdapter(supportFragmentManager)
        viewPager.setScroll(true)
        viewPager.adapter = adapter



    }

    override fun cancelRequest() {
    }

}