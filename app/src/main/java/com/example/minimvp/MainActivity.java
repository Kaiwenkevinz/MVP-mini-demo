package com.example.minimvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private TextView mTextView;
    private Button mButton;
    private MainPresenter mPresenter;
    private Button mBtnWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 界面组件绑定
        mTextView = findViewById(R.id.textView);
        mButton = findViewById(R.id.button);
        mBtnWeather = findViewById(R.id.btnWeather);

        mPresenter = new MainPresenter(this);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.LoadData();
            }
        });

        mBtnWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.LoadWeatherData();
            }
        });

    }

    @Override
    public void onDataLoaded(String s) {
        mTextView.setText(s);
    }

    @Override
    public void onWeatherLoaded() {

        String str = "天气数据";
        mTextView.setText(str);

    }

}