package com.example.minimvp;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View mView;

    public MainPresenter(MainContract.View v) {
        this.mView = v;
    }

    @Override
    public void LoadData() {

        String str = "假装我是服务端传来的数据";
        mView.onDataLoaded(str);

    }

    @Override
    public void LoadWeatherData() {

        // 进行一番业务操作。。。。
        // 通知view要更新数据了
        mView.onWeatherLoaded();

    }
}
