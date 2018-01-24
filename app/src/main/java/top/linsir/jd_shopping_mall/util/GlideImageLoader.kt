package top.linsir.jd_shopping_mall.util

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.youth.banner.loader.ImageLoader

/**
 *  Created by linSir
 *  date at 2018/1/24.
 *  describe: 轮播图框架需要用到的图片loader
 */

class GlideImageLoader : ImageLoader() {

    override fun displayImage(context: Context, path: Any?, imageView: ImageView) {

        Glide.with(context)
                .load(path)
                .into(imageView);

    }


}