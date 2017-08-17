package com.example.segundoauqui.broadcastreceiver;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MyRecieverBroadcast recieverBroadcast ;

    IntentFilter intentFilter;

    TextView tvTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTest = (TextView) findViewById(R.id.tvTest);
        recieverBroadcast = new MyRecieverBroadcast(tvTest);

    }

    @Override
    protected void onStart() {
        super.onStart();
        intentFilter = new IntentFilter();
        intentFilter.addAction("doNewThing");
        registerReceiver(recieverBroadcast, intentFilter);
    }
}
