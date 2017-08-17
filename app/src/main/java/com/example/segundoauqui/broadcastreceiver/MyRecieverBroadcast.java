package com.example.segundoauqui.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by segundoauqui on 8/16/17.
 */

public class MyRecieverBroadcast extends BroadcastReceiver {

    public MyRecieverBroadcast(TextView tvTest) {
        this.tvTest = tvTest;
    }

    private TextView tvTest;


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "I am Dynamic", Toast.LENGTH_SHORT).show();

        tvTest.setText(intent.getStringExtra("data"));
    }
}
