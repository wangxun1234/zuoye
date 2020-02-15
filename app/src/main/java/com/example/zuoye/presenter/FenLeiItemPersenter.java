package com.example.zuoye.presenter;

import com.example.zuoye.base.BasePersenter;
import com.example.zuoye.interfaces.shangcheng.FenLeiItemContract;
import com.example.zuoye.model.CommonSubscriber;
import com.example.zuoye.model.bean.FenLei_TabBean;
import com.example.zuoye.model.http.HttpManager;
import com.example.zuoye.utils.RxUtils;

public class FenLeiItemPersenter extends BasePersenter<FenLeiItemContract.View> implements FenLeiItemContract.Persenter {
    @Override
    public void getFenLeiItemData(int id) {
        addSubscribe(HttpManager.getFenLeiItemApi().getFenLeitemBean(id)
                .compose(RxUtils.<FenLei_TabBean> rxScheduler())
                .subscribeWith(new CommonSubscriber<FenLei_TabBean>(mView){
                    @Override
                    public void onNext(FenLei_TabBean fenLei_tabBean) {
                        mView.FenLeiItemDataReturn(fenLei_tabBean);
                    }
                }));
    }
}
