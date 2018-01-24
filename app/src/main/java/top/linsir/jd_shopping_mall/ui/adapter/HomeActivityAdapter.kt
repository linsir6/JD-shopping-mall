package top.linsir.jd_shopping_mall.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.widget.ImageView
import top.linsir.jd_shopping_mall.R
import top.linsir.jd_shopping_mall.ui.fragment.HomeFragment
import top.linsir.jd_shopping_mall.ui.fragment.MeFragment
import top.linsir.jd_shopping_mall.ui.fragment.ShoppingCartFragment
import top.linsir.jd_shopping_mall.ui.fragment.SortFragment

/**
 *  Created by linSir
 *  date at 2018/1/23.
 *  describe:
 */
public class HomeActivityAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var fragments: MutableList<Fragment> = ArrayList()
    private val imgNormal = arrayOf(R.mipmap.icon_home_normal, R.mipmap.icon_sort_normal
            , R.mipmap.icon_shopping_cart_normal, R.mipmap.icon_me_normal)
    private val imgChecked = arrayOf(R.mipmap.icon_home_checked, R.mipmap.icon_sort_checked
            , R.mipmap.icon_shopping_cart_checked, R.mipmap.icon_me_checked)


    init {
        fragments.add(HomeFragment())
        fragments.add(SortFragment())
        fragments.add(ShoppingCartFragment())
        fragments.add(MeFragment())
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int = fragments.size

    fun setupTabLayout(tabLayout: TabLayout, viewPager: ViewPager) {
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                viewPager.setCurrentItem(tabLayout.selectedTabPosition, false)
                tab!!.customView!!.findViewById<ImageView>(R.id.ivItem)
                        .setImageResource(imgNormal[tab.position])
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.setCurrentItem(tabLayout.selectedTabPosition, false)
                tab!!.customView!!.findViewById<ImageView>(R.id.ivItem)
                        .setImageResource(imgChecked[tab.position])
            }

        })

    }

    @SuppressLint("InflateParams")
    fun init(tabLayout: TabLayout, context: Context) {

        var view = LayoutInflater.from(context).inflate(R.layout.custom_tablayout_item, null)
        var ivItem = view.findViewById<ImageView>(R.id.ivItem)
        ivItem.setImageResource(imgChecked[0])
        tabLayout.getTabAt(0)!!.customView = view

        for (i in 1 until imgChecked.size) {
            view = LayoutInflater.from(context).inflate(R.layout.custom_tablayout_item, null)
            ivItem = view.findViewById<ImageView>(R.id.ivItem)
            ivItem.setImageResource(imgNormal[i])
            tabLayout.getTabAt(i)!!.customView = view
        }
    }



}

