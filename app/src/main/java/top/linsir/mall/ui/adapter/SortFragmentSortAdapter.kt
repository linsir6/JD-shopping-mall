package top.linsir.mall.ui.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import top.linsir.mall.R
import top.linsir.mall.model.SortItem

/**
 *  Created by linSir
 *  date at 2018/2/1.
 *  describe: 分类页面,sortRecyclerView的Adapter
 */
class SortFragmentSortAdapter(layoutResId: Int) : BaseQuickAdapter<SortItem, BaseViewHolder>(layoutResId) {

    override fun convert(helper: BaseViewHolder?, item: SortItem?) {
        helper!!.setText(R.id.sort_item_name, item!!.text)
    }


}