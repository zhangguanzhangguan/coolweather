package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhangguan on 2018/10/2.
 */

public class HttpUtil {
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient okHttpClient=new OkHttpClient();
        Request request= new Request.Builder().url(address).build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}
