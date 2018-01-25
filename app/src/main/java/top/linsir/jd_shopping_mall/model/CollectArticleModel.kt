package top.linsir.jd_shopping_mall.model

import top.linsir.jd_shopping_mall.presenter.HomePresenter

/**
 *  Created by linSir
 *  date at 2018/1/25.
 *  describe:
 */
interface CollectArticleModel {


    fun collectArticle(
            onCollectArticleListener: HomePresenter.OnLoginListener,
            id: Int,
            isAdd: Boolean
    )

    fun cancelCollectRequest()


}