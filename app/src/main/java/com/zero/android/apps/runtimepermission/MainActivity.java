package com.zero.android.apps.runtimepermission;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartActivity1(View v) {
        startActivity(FirstActivity.class);
    }

    public void onStartActivity2(View v) {
        startActivity(SecondActivity.class);
    }

    private void startActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
