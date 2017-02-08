package com.example.andrebernardo.week42;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText editText1;
    private ListView lsView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsView+(ListView)findViewById(R.id.ls_view1_ma1);

       String[] myItems=getResources().getStringArray(R.array.my_int_lst);
        ArrayAdapter<String>

        editText1



        btn1=(Button)findViewById(R.id.btn1_mal);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this , Main2Activity.class)
                        startActivity(intent);

            }
    }

