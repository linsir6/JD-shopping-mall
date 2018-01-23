package top.linsir.jd_shopping_mall.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import top.linsir.jd_shopping_mall.R
import top.linsir.jd_shopping_mall.base.BaseFragment

/**
 *  Created by linSir
 *  date at 2018/1/23.
 *  describe:
 */
class SortFragment: BaseFragment(){

    private var mainView: View? = null


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mainView ?: let {
            mainView = inflater.inflate(R.layout.fragment_sort, container, false)
        }
        return mainView
    }


    override fun cancelRequest() {

    }


}