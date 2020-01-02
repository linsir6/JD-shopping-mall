package top.linsir.mall.application

import android.app.Application
import android.content.Context
import top.linsir.mall.network.ApiClient

/**
 *  Created by linSir
 *  date at 2018/1/29.
 *  describe:
 */
public class App : Application() {



    init {
        instance = this;
    }

    companion object {
        private var instance: Application? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        ApiClient.instance.init()
        val context: Context = App.applicationContext()
    }

    public fun getContext(): Context {
        return applicationContext;
    }

}
