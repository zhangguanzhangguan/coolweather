package com.coolweather.android.gson;

/**
 * Created by zhangguan on 2018/10/3.
 */

public class Aqi {
    public AqiCity city;
    public class AqiCity{
        public String aqi;
        public String pm25;
    }
}
