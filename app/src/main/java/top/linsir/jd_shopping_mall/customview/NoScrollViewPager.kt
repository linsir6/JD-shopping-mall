package top.linsir.jd_shopping_mall.customview

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

/**
 *  Created by linSir
 *  date at 2018/1/23.
 *  describe: 继承自viewPager，实现可控的滑动
 */
public class NoScrollViewPager : ViewPager {

    private var isScroll: Boolean = false

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    fun setScroll(scroll: Boolean) {
        isScroll = scroll
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return this.isScroll && super.onTouchEvent(event)
    }

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return this.isScroll && super.onInterceptTouchEvent(event)
    }

}