package com.zero.android.apps.runtimepermission;

import android.Manifest;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected String[] getRequiredPermissions() {
        return new String[] {
                Manifest.permission.ACCESS_FINE_LOCATION
        };
    }

    @Override
    protected void onAllRequiredPermissionsGranted() {
        Toast.makeText(getApplicationContext(), "Location access allowed", Toast.LENGTH_SHORT).show();
    }
}
