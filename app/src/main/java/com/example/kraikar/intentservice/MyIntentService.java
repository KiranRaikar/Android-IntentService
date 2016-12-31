package com.example.kraikar.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by kraikar on 12/31/2016.
 */

public class MyIntentService extends IntentService {

    private static final String TAG = "MyIntentService";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "The Service has now started.");
    }
}
