package com.zet.learnsharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.white.easysp.EasySP;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String int_k1 = "int_k1";
        SharedPreferences sharedPreferences = this.getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(int_k1, 256843).apply();
        int anInt = sharedPreferences.getInt(int_k1, 0x0);
        Log.e(TAG, "onCreate: anInt=" + anInt);


        String int_k2 = "int_k2";
        EasySP.init(this).putInt(int_k2, 87415874);
        int anInt1 = EasySP.init(this).getInt(int_k2, 0x0);
        Log.e(TAG, "onCreate: anInt1=" + anInt1);

    }
}
