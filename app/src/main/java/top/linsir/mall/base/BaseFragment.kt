package top.linsir.mall.base

import com.trello.rxlifecycle2.components.support.RxFragment


/**
 *  Created by linSir
 *  date at 2018/1/23.
 *  describe:
 */
abstract class BaseFragment : RxFragment(){


    protected var isFirst: Boolean = true;

    protected abstract fun cancelRequest()

    override fun onDestroy() {
        super.onDestroy()
        cancelRequest()
    }
}