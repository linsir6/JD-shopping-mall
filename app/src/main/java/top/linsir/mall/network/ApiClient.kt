package top.linsir.mall.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import top.linsir.mall.BuildConfig

class ApiClient private constructor() {
    lateinit var service: GitHubService

    private object Holder {
        val INSTANCE = ApiClient()
    }

    companion object {
        val instance by lazy { Holder.INSTANCE }
    }

    fun init() {
        val okHttpClient = OkHttpClient().newBuilder()
                .addInterceptor(HttpLoggingInterceptor().setLevel(
                        if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
                        else HttpLoggingInterceptor.Level.NONE
                ))
                .build()

        val retrofit = Retrofit.Builder()
                .baseUrl("http://rap2api.taobao.org/app/mock/373/GET/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build()

        service = retrofit.create(GitHubService::class.java)
    }
}
