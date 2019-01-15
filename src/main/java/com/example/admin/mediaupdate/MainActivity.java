package com.example.admin.mediaupdate;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scanExternal(this);
        finish();
    }

    private void scanExternal(final Context context) {
        try {
            //сканирует внешнюю память
            MediaScannerConnection.scanFile(context, new String[] { Environment
                            .getExternalStorageDirectory().toString()
                    }, null,
                    new MediaScannerConnection.OnScanCompletedListener() {
                        public void onScanCompleted(String path, Uri uri) {
                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
