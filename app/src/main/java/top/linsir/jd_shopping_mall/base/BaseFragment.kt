package top.linsir.jd_shopping_mall.base

import android.support.v4.app.Fragment


/**
 *  Created by linSir
 *  date at 2018/1/23.
 *  describe:
 */
abstract class BaseFragment : Fragment(){


    protected var isFirst: Boolean = true;

    protected abstract fun cancelRequest()

    override fun onDestroy() {
        super.onDestroy()
        cancelRequest()
    }
}