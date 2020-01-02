package top.linsir.mall.delegate

/**
 *  Created by linSir
 *  date at 2018/1/25.
 *  describe:
 */
data class LoginResponse(
        var errorCode: Int,
        var errorMsg: String?,
        var data: Data
) {
    data class Data(
            var id: Int,
            var username: String,
            var password: String,
            var icon: String?,
            var type: Int
    )
}