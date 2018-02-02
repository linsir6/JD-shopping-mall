package top.linsir.mall.network
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST
import top.linsir.mall.been.User
import top.linsir.mall.model.Repo

interface GitHubService {
    @POST("/user/login")
    fun login(@Body user: User): Observable<Repo>


}
