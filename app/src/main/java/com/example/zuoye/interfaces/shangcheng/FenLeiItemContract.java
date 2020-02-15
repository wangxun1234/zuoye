package com.example.zuoye.interfaces.shangcheng;

import com.example.zuoye.interfaces.IBaseView;
import com.example.zuoye.interfaces.IPersenter;
import com.example.zuoye.model.bean.FenLei_TabBean;

public interface FenLeiItemContract {
    interface View extends IBaseView {
        void FenLeiItemDataReturn(FenLei_TabBean fenLei_tabBean);
    }

    interface Persenter extends IPersenter<View> {
        void getFenLeiItemData(int id);
    }
}
