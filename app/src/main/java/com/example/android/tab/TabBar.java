package com.example.android.tab;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.TabHost;
import android.app.TabActivity;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.Toast;

import com.example.android.fragment.R;
import com.example.android.main.MainActivity;

public class TabBar extends AppCompatActivity {
    /** Called when the activity is first created. */
    TabHost tabHost;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // 方法2、3使用：
        setContentView(R.layout.tab_bar);
        // 获取该Activity里面的TabHost组件
        // 方法1使用：
        // TabHost tabHost = getTabHost();
        // 方法1使用：
        // LayoutInflater.from(this).inflate(R.layout.main_tab, tabHost.getTabContentView(), true);
        // 方法2、3使用
        tabHost = (TabHost)findViewById(R.id.tabhost);
        tabHost.setup();
        // 方法3使用，动态载入xml，不需要Activity
        LayoutInflater.from(this).inflate(R.layout.tab1, tabHost.getTabContentView());
        LayoutInflater.from(this).inflate(R.layout.tab2, tabHost.getTabContentView());
        LayoutInflater.from(this).inflate(R.layout.tab3, tabHost.getTabContentView());
        // 创建第一个Tab页
        /*TabHost.TabSpec tab1 = tabHost.newTabSpec("tab1")
                .setIndicator("标签页一") // 设置标题
                .setContent(R.id.tab01); //设置内容
        // 添加第一个标签页
        tabHost.addTab(tab1);
        TabHost.TabSpec tab2 = tabHost.newTabSpec("tab2")
                .setIndicator("标签页二")
                .setContent(R.id.tab02);
        // 添加第二个标签页
        tabHost.addTab(tab2);
        TabHost.TabSpec tab3 = tabHost.newTabSpec("tab3")
                .setIndicator("标签页三")
                .setContent(R.id.tab03);
        // 添加第三个标签页
        tabHost.addTab(tab3);*/

        /* 以上创建和添加标签页也可以用如下代码实现 */
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Tab One").setContent(R.id.tab1));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Tab Two").setContent(R.id.tab2));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Tab Three").setContent(R.id.tab3));

        //标签切换事件处理，setOnTabChangedListener
        tabHost.setOnTabChangedListener(new OnTabChangeListener(){
            @Override
            // tabId是newTabSpec第一个参数设置的tab页名，并不是layout里面的标识符id
            public void onTabChanged(String tabId) {
                if (tabId.equals("tab1")) {
                    Toast.makeText(TabBar.this, "Tab One", Toast.LENGTH_SHORT).show();
                }
                if (tabId.equals("tab2")) {
                    Toast.makeText(TabBar.this, "Tap Two", Toast.LENGTH_SHORT).show();
                }
                if (tabId.equals("tab3")) {
                    Toast.makeText(TabBar.this, "Tab Three", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}