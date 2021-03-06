package com.example.zuoye.model.apis;

import com.example.zuoye.model.bean.ShouYeBean;
import com.example.zuoye.model.bean.ZhuantiBean;


import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ShouyeApi {
    @GET("index")
    Flowable<ShouYeBean> getShouyeData();

    @GET("api/topic/list")
    Flowable<ZhuantiBean> getZhuantiData(@Query("page") int page,@Query("size") int size);
}
