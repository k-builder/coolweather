package com.example.john.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by builder on 17-2-21.
 */

public class Basic {
    @SerializedName("city")
    public String cityName ;
    @SerializedName("id")
    public String weatherId ;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime ;
    }
}
