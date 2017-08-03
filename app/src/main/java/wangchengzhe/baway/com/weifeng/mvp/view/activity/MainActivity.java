package wangchengzhe.baway.com.weifeng.mvp.view.activity;


import android.util.Log;

import com.exa.framelib_rrm.base.model.http.tag.BaseTag;
import com.exa.framelib_rrm.retrofit.RetrofitHelper;

import wangchengzhe.baway.com.weifeng.R;
import wangchengzhe.baway.com.weifeng.mvp.moudle.http.Constants;
import wangchengzhe.baway.com.weifeng.mvp.presenter.TestPresenter;
import wangchengzhe.baway.com.weifeng.mvp.view.iview.BaseReRxCallback;

public class MainActivity extends BaseActivity <TestPresenter,BaseReRxCallback<Object,Object,MainActivity,BaseTag>> {




    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {

    }
    @Override
    protected void initDatas() {
       bindPresenter(new TestPresenter<BaseReRxCallback>(),

               new BaseReRxCallback<Object,Object,MainActivity,BaseTag>(this, getApplicationContext()) {
                   @Override
                   public String onCheckParamsLegality(BaseTag tag, Object... params) {
                       return null;
                   }
                   @Override
                   public void onRequestStart(BaseTag tag) {

                   }
                   @Override
                   public void onRequestEnd(BaseTag tag) {

                   }
                   @Override
                   protected boolean onDealNextResponse(Object response, BaseTag tag) {
                       Log.e("MainActivity", "onDealNextResponse: "+response);
                       return super.onDealNextResponse(response, tag);
                   }
               });
        RetrofitHelper.init(Constants.LINK_MAIN);//初始化Retrofit默认的BaseUrl，只需要初始化一次
        mPresenter.testReRxGetString(new BaseTag());
    }
}