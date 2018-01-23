package top.linsir.jd_shopping_mall.ui.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import top.linsir.jd_shopping_mall.ui.fragment.HomeFragment
import top.linsir.jd_shopping_mall.ui.fragment.MeFragment
import top.linsir.jd_shopping_mall.ui.fragment.ShoppingCartFragment
import top.linsir.jd_shopping_mall.ui.fragment.SortFragment

/**
 *  Created by linSir
 *  date at 2018/1/23.
 *  describe:
 */
public class HomeAdapter : FragmentPagerAdapter {


    var fragments: MutableList<Fragment> = ArrayList()

    constructor(fm: FragmentManager) : super(fm) {
        fragments.add(HomeFragment())
        fragments.add(SortFragment())
        fragments.add(ShoppingCartFragment())
        fragments.add(MeFragment())
    }


    override fun getItem(position: Int): Fragment {
        return fragments[position];
    }


    override fun getCount(): Int = fragments.size


}

