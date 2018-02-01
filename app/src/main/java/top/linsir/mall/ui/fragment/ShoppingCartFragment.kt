package top.linsir.mall.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import top.linsir.mall.R
import top.linsir.mall.base.BaseFragment

/**
 *  Created by linSir
 *  date at 2018/1/23.
 *  describe:
 */
class ShoppingCartFragment: BaseFragment(){

    private var mainView: View? = null


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mainView ?: let {
            mainView = inflater.inflate(R.layout.fragment_shooping_cart, container, false)
        }
        return mainView
    }


    override fun cancelRequest() {

    }


}