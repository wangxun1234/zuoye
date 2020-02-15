package com.example.zuoye.presenter;

import com.example.zuoye.base.BasePersenter;
import com.example.zuoye.interfaces.shangcheng.FenLeiContract;
import com.example.zuoye.model.CommonSubscriber;
import com.example.zuoye.model.bean.FenLeiBean;
import com.example.zuoye.model.http.HttpManager;
import com.example.zuoye.utils.RxUtils;

public class FenLeiPersenter extends BasePersenter<FenLeiContract.View> implements FenLeiContract.Persenter{

    @Override
    public void getFenLeiData() {
        addSubscribe(HttpManager.getFenLeiApi().getFenLeiBean()
                .compose(RxUtils.<FenLeiBean> rxScheduler())
                .subscribeWith(new CommonSubscriber<FenLeiBean>(mView){
                    @Override
                    public void onNext(FenLeiBean fenLeiBean) {
                        mView.FenLeiDataReturn(fenLeiBean);
                    }
                }));
    }
}
