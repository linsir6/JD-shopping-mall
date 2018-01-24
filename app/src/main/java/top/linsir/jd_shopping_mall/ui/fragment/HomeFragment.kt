package top.linsir.jd_shopping_mall.ui.fragment

import android.graphics.Color
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.youth.banner.Banner
import kotlinx.android.synthetic.main.fragment_home.*
import top.linsir.jd_shopping_mall.R
import top.linsir.jd_shopping_mall.base.BaseFragment
import top.linsir.jd_shopping_mall.delegate.HomeFragmentItemDelegate
import top.linsir.jd_shopping_mall.ui.adapter.HomeFragmentAdapter
import top.linsir.jd_shopping_mall.util.GlideImageLoader


/**
 *  Created by linSir
 *  date at 2018/1/23.
 *  describe:
 */
class HomeFragment: BaseFragment(){

    private var mainView: View? = null
    private var mDistanceY = 0;

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mainView ?: let {
            mainView = inflater.inflate(R.layout.fragment_home, container, false)
        }

        return mainView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val adapter = HomeFragmentAdapter(null);
        recyclerView.adapter = adapter;
        recyclerView.layoutManager = LinearLayoutManager(activity);

        val delegate = HomeFragmentItemDelegate(1);


        val listBook = listOf<HomeFragmentItemDelegate>(delegate, delegate, delegate, delegate
                , delegate, delegate, delegate, delegate, delegate, delegate, delegate, delegate)
        adapter.setNewData(listBook);


        val banner = Banner(activity);
        //设置图片加载器
        banner.setImageLoader(GlideImageLoader())
        //设置图片集合
        val images = mutableListOf("http://f.hiphotos.baidu.com/image/pic/item/503d269759ee3d6db032f61b48166d224e4ade6e.jpg", "http://f.hiphotos.baidu.com/image/pic/item/503d269759ee3d6db032f61b48166d224e4ade6e.jpg")

        val layout = LinearLayout(activity);
        layout.addView(banner, 1080, 400)

        banner.setImages(images)
        //banner设置方法全部调用完毕时最后调用

        adapter.addHeaderView(layout)
        banner.start()
        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {

            override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                mDistanceY += dy
                //toolbar的高度
                val toolbarHeight = 56 * 3;

                //当滑动的距离 <= toolbar高度的时候，改变Toolbar背景色的透明度，达到渐变的效果
                if (mDistanceY <= toolbarHeight) {
                    val scale = mDistanceY.toFloat() / toolbarHeight
                    val alpha = scale * 255
                    relativeLayout.setBackgroundColor(Color.argb(alpha.toInt(), 255, 255, 255))
                } else {
                    //上述虽然判断了滑动距离与toolbar高度相等的情况，但是实际测试时发现，标题栏的背景色
                    //很少能达到完全不透明的情况，所以这里又判断了滑动距离大于toolbar高度的情况，
                    //将标题栏的颜色设置为完全不透明状态
                    relativeLayout.setBackgroundResource(R.color.colorWhite)
                }

            }
        })

    }




    override fun cancelRequest() {

    }


}