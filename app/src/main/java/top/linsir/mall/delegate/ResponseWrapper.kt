package top.linsir.mall.delegate

/**
 *  Created by linSir
 *  date at 2018/1/29.
 *  describe:
 */
data class ResponseWrapper<T>(var code: Int, var data: T, var message: String)