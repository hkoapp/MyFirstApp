package com.example.android.broadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.fragment.R;

public class Broadcast_recevier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_recevier);
    }

    // broadcast a custom intent.
    public void broadcastIntent(View view){
        Intent intent = new Intent();
//        there "CUSTOM_INTENT" is created by myself
//        there are many official intent event can be design to broadcast
//        such as below
//        android.intent.action.BATTERY_CHANGED
//        android.intent.action.BATTERY_LOW
//        android.intent.action.BATTERY_OKAY
//        android.intent.action.BATTERY_OKAY
//        android.intent.action.BUG_REPORT
//        android.intent.action.CALL
//        android.intent.action.CALL_BUTTON
//        android.intent.action.DATE_CHANGED
//        android.intent.action.REBOOT
        intent.setAction("com.example.android.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
