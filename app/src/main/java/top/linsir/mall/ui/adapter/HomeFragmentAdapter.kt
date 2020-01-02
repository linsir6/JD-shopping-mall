package top.linsir.mall.ui.adapter

import android.util.Log
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import top.linsir.mall.R
import top.linsir.mall.delegate.HomeFragmentItemDelegate

/**
 *  Created by linSir
 *  date at 2018/1/24.
 *  describe:
 */
class HomeFragmentAdapter(data: MutableList<HomeFragmentItemDelegate>?) :
        BaseMultiItemQuickAdapter<HomeFragmentItemDelegate, BaseViewHolder>(data) {

    init {
        addItemType(1, R.layout.item_home_fragment)
    }

    override fun convert(helper: BaseViewHolder?, item: HomeFragmentItemDelegate?) {
        when (helper!!.itemViewType) {
            1 -> helper.setText(R.id.text, "hello world 33")
            2 -> Log.i("lin", "---lin---> ")
            3 -> Log.i("lin", "---lin---> ")
            4 -> Log.i("lin", "---lin---> ")
        }

    }


}