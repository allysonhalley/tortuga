package br.com.ahsr.tortuga30;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        new Timer().schedule(new TimerTask() {
//
//            @Override
//            public void run() {
//                finish();
//
//                Intent intent = new Intent();
//                intent.setClass(SplashActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        }, 2000);
    }
}
