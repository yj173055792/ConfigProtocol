package info.xiaomo.app.api;


import info.xiaomo.app.model.base.Result;
import info.xiaomo.app.model.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * @author 小莫 (https://xiaomo.info) (https://github.com/syoubaku)
 * @version : 2016/6/4 0004 14:54
 */
public interface INewsService {
    @GET("adminUser/findAll")
    @Headers("Cache-Control: public, max-age=30")
    Call<Result<News>> userNews();
}
