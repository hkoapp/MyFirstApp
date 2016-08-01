package com.example.android.main;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;

import com.example.android.autocompleteedittext.AutocompleteText;
import com.example.android.broadcastreceiver.Broadcast_recevier;
import com.example.android.contentprovider.MyContentProvider;
import com.example.android.fragment.FragmentMain;
import com.example.android.fragment.R;
import com.example.android.intent.IntentActivity;
import com.example.android.listDialog.FragmentDialogDemo;
import com.example.android.myactivity.MyActivity;
import com.example.android.service.MainService;
import com.example.android.tab.TabBar;

public class MainActivity extends Activity {
    int ppp = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ppp = ContextCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_CALENDAR);
    }
    public void myActivityClick(View view) {
        Intent intent = new Intent(this, MyActivity.class);
        startActivity(intent);
    }

    public void intentActivityClick(View view) {
        Intent intent = new Intent(this, IntentActivity.class);
        startActivity(intent);
    }

    public void autoCompleteTextClick(View view) {
        Intent intent = new Intent(this, AutocompleteText.class);
        startActivity(intent);
    }

    public void tabBarClick(View view) {
        Intent intent = new Intent(this, TabBar.class);
        startActivity(intent);
    }

    public void changeFragmentCLick(View view) {
        Intent intent = new Intent(this, FragmentMain.class);
        startActivity(intent);
    }

    public void listDialogClick(View view) {
        Intent intent = new Intent(this, FragmentDialogDemo.class);
        startActivity(intent);
    }

    public void serviceClick(View view) {
        Intent intent = new Intent(this, MainService.class);
        startActivity(intent);
    }

    public void boardcaastClick(View view) {
        Intent intent = new Intent(this, Broadcast_recevier.class);
        startActivity(intent);
    }

    public void contentProviderClick(View view) {
        Intent intent = new Intent(this, MyContentProvider.class);
        startActivity(intent);
    }
}