package com.test.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;

import com.example.activitylifecycletest.R;

/**
 * Created by momo_lichen on 15/8/26.
 */
public class DialogActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_layout);
    }
}
