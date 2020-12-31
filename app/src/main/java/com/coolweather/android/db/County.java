package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by admin on 2020/12/31.
 */
public class County extends DataSupport {
    private int id;
    private String countName;
    private String weatherId;
    private  int cityId;



    public int getId() {
        return id;
    }

    public String getCountName() {
        return countName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
