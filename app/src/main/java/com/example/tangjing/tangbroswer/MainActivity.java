package com.example.tangjing.tangbroswer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.utils.Log;
public class MainActivity extends AppCompatActivity {
    private final static String TAG = "main";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"tangjing");
    }
}
