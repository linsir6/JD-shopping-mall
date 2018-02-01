package top.linsir.mall.network
import io.reactivex.Observable
import retrofit2.http.GET
import top.linsir.mall.model.Repo

interface GitHubService {
    @GET("test")
    fun listRepos(): Observable<Repo>


}
