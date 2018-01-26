package top.linsir.jd_shopping_mall.retrofit

import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.*
import top.linsir.jd_shopping_mall.delegate.LoginResponse

/**
 *  Created by linSir
 *  date at 2018/1/26.
 *  describe:
 */
interface RetrofitService {


    /**
     * 登录
     * @param username username
     * @param password password
     * @return Deferred<LoginResponse>
     */
    @POST("/user/login")
    @FormUrlEncoded
    fun loginWanAndroid(
            @Field("username") username: String,
            @Field("password") password: String
    ): Deferred<LoginResponse>

}