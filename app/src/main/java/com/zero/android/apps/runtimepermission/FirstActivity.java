package com.zero.android.apps.runtimepermission;

import android.Manifest;
import android.os.Bundle;
import android.widget.TextView;

public class FirstActivity extends BaseActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mTextView = (TextView) findViewById(R.id.textView);
    }

    @Override
    protected String[] getRequiredPermissions() {
        return new String[] {
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA
        };
    }

    @Override
    protected void onAllRequiredPermissionsGranted() {
        StringBuilder sb = new StringBuilder();

        for (String permission : getRequiredPermissions()) {
            sb.append(permission).append("\n");
        }

        mTextView.setText(sb.toString());
    }
}
