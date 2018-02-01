package top.linsir.mall.application

import android.app.Application
import top.linsir.mall.network.ApiClient

/**
 *  Created by linSir
 *  date at 2018/1/29.
 *  describe:
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        ApiClient.instance.init()
    }
}
