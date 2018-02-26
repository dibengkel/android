package com.dibengkel.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        intent = new Intent(this, LoginActivity.class);
        finish();


    }
}
