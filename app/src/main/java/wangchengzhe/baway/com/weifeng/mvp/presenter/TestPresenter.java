package wangchengzhe.baway.com.weifeng.mvp.presenter;

import com.exa.framelib_rrm.base.model.http.tag.BaseTag;
import com.exa.framelib_rrm.retrofit.RetrofitHelper;
import com.exa.framelib_rrm.rx.RxBasePresenter;
import com.exa.framelib_rrm.rx.RxCallback;
import com.exa.framelib_rrm.rx.RxHelper;

import io.reactivex.Observable;
import wangchengzhe.baway.com.weifeng.mvp.moudle.http.ClassResponse;
import wangchengzhe.baway.com.weifeng.mvp.moudle.http.TestApi;


/**
 * 功能描述  :
 * 创建时间 : 2017/8/2 21:21
 * 编写人  :  王成哲
 */

public class TestPresenter<T extends RxCallback> extends RxBasePresenter<T> {


    public void testReRxGetString(BaseTag tag){
        if (preCheck(true,tag)){//每个方法必须调用 检查

                //因为createApi之后每个接口需要调用的方法不一样，所以无法再进行更多抽取
                Observable<ClassResponse> test = RetrofitHelper
                        .createApi(TestApi.class)
                        .testGetBean("http://news-at.zhihu.com/");
                RxHelper.asyncGet(test, tag, this);


        }

    }


}
