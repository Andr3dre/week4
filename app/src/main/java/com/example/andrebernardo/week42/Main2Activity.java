package com.example.andrebernardo.week42;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=(TextView)findViewById(R.id.tv1_ma2);

        String incomingMsg=getIntent().getStringExtra(AGE_MSG_KEY);
        textView1.setText(incomingMsg);

    }
}
