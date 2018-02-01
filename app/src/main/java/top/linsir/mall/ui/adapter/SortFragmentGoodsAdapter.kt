package top.linsir.mall.ui.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import top.linsir.mall.R
import top.linsir.mall.model.GoodsItem
import top.linsir.mall.model.SortItem

/**
 *  Created by linSir
 *  date at 2018/2/1.
 *  describe:
 */
class SortFragmentGoodsAdapter(layoutResId: Int) : BaseQuickAdapter<GoodsItem, BaseViewHolder>(layoutResId) {

    override fun convert(helper: BaseViewHolder?, item: GoodsItem?) {
        helper!!.setText(R.id.goods_text, item!!.text)
    }


}