package com.example.paxilpaz.mysunshine;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by paxilpaz on 09/03/16.
 */
public class CityData extends BaseObservable {
    private String cityName;

    public CityData(String cityName) {
        this.cityName = cityName;
    }

    @Bindable
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
        notifyPropertyChanged(com.example.paxilpaz.mysunshine.BR.cityName);
    }
}
