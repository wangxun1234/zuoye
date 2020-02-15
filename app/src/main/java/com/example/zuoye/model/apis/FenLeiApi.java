package com.example.zuoye.model.apis;

import com.example.zuoye.model.bean.FenLeiBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface FenLeiApi {

    @GET("catalog/index")
    Flowable<FenLeiBean> getFenLeiBean();
}
