package com.dadanene.gittrusteeshipproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout ll_wechat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {
        ll_wechat.setOnClickListener(this);
    }

    private void initView() {
        ll_wechat=findViewById(R.id.ll_wechat);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ll_wechat:
                Toast.makeText(this,"您可以加我微信联系我",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
