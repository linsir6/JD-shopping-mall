package top.linsir.jd_shopping_mall.delegate

import com.chad.library.adapter.base.entity.MultiItemEntity

/**
 *  Created by linSir
 *  date at 2018/1/24.
 *  describe: HomeFragment RecyclerView item
 */
class HomeFragmentItemDelegate : MultiItemEntity {

    private var itemType = 0;

    constructor(itemType: Int) {
        this.itemType = itemType;
    }

    override fun getItemType(): Int {
        return itemType;
    }


}

