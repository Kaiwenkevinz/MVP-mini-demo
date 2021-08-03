package com.example.minimvp;

/**
 * 此接口类整合了Presenter和View层需要实现的接口
 */
public interface MainContract {

    interface Presenter {
        void LoadData();
        void LoadWeatherData();
    }

    interface View {
        void onDataLoaded(String s);
        void onWeatherLoaded();
    }

}
