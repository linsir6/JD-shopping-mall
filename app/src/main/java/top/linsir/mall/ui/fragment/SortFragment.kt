package top.linsir.mall.ui.fragment

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_sort.*
import top.linsir.mall.R
import top.linsir.mall.base.BaseFragment
import top.linsir.mall.model.GoodsItem
import top.linsir.mall.model.SortItem
import top.linsir.mall.ui.adapter.SortFragmentGoodsAdapter
import top.linsir.mall.ui.adapter.SortFragmentSortAdapter


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

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val sortAdapter = SortFragmentSortAdapter(R.layout.item_sort)
        sort.adapter = sortAdapter
        sort.layoutManager = LinearLayoutManager(activity)
        val list = ArrayList<SortItem>()
        list.add(SortItem("数据", 1));
        list.add(SortItem("数据", 1));
        list.add(SortItem("数据", 1));
        list.add(SortItem("数据", 1));
        list.add(SortItem("数据", 1));
        list.add(SortItem("数据", 1));
        sortAdapter.setNewData(list);
        sortAdapter.setOnItemClickListener { adapter, view, position ->
            view.setBackgroundColor(0x000fff)
            adapter.notifyItemChanged(position)
            Toast.makeText(activity, "aaaaa", Toast.LENGTH_SHORT).show()
        }


        val goodsAdapter = SortFragmentGoodsAdapter(R.layout.item_sort_goods)
        goods.adapter = goodsAdapter;
        goods.layoutManager = GridLayoutManager(activity, 3);
        val list2 = ArrayList<GoodsItem>()
        list2.add(GoodsItem("test", "test"))
        list2.add(GoodsItem("test", "test"))
        list2.add(GoodsItem("test", "test"))
        list2.add(GoodsItem("test", "test"))
        list2.add(GoodsItem("test", "test"))
        list2.add(GoodsItem("test", "test"))
        goodsAdapter.setNewData(list2)
    }



    override fun cancelRequest() {

    }


}