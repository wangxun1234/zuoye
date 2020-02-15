package com.example.zuoye.interfaces.shangcheng;

import com.example.zuoye.interfaces.IBaseView;
import com.example.zuoye.interfaces.IPersenter;
import com.example.zuoye.model.bean.FenLeiBean;

public interface FenLeiContract {
    interface View extends IBaseView {
        void FenLeiDataReturn(FenLeiBean fenLeiBean);
    }

    interface Persenter extends IPersenter<View> {
        void getFenLeiData();
    }
}
