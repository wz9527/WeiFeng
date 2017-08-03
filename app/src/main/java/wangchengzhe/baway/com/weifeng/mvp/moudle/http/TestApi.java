package wangchengzhe.baway.com.weifeng.mvp.moudle.http;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by acer on 2017/7/15.
 * 由于返回值类型可能不同，所以不能写几个通用方法代替所有的
 */
public interface TestApi {

    //Observable<String> test(@FieldMap Map<String, String> map);//可能会报错java.lang.IllegalArgumentException: Field map was null.

    //@POST(Constants.LINK_MOBILE_CLASS)
    //Observable<String> test();

    @GET
    Observable<String> testGetJson(@Url String url);

    @GET
    Observable<ClassResponse> testGetBean(@Url String url);

//    @GET(Constants.LINK_MOBILE_CLASS)
//    Observable<String> getNextGoodsClass(@Query("gc_id") String gcId);

}
