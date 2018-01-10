package com.example.student.l2018011002;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Log.d("msg", "收到一個訊息");
            String str=msg.getData().getString("HAHA");
            Log.d("msg", "str:"+str);
        }
    };

    public void click1(View v)
    {
        Message msg=new Message();
        Bundle bundle=new Bundle();
        bundle.putString("HAHA","HappyHat");
        msg.setData(bundle);
        handler.sendMessage(msg);
    }
}
