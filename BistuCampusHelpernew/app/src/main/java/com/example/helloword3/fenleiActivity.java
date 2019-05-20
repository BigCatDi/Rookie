package com.example.helloword3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by 64420 on 2019/5/18.
 */

public class fenleiActivity extends Activity {
    private Button kechengbiaobutton;
    private Button qushibutton;
    private Button yundongbutton;
    private Button biaobaibutton;
    private Button tiaozaobutton;
    private Button tucaobutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fenlei);
        kechengbiaobutton=findViewById(R.id.kechengbiao_b);
        kechengbiaobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(fenleiActivity.this,kechengbiaoActivity.class);
                startActivity(intent);
            }
        });

        qushibutton=findViewById(R.id.qushi_b);
        qushibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(fenleiActivity.this,qushiActivity.class);
                startActivity(intent);
            }
        });

        yundongbutton=findViewById(R.id.yundong_b);
        yundongbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fenleiActivity.this, yundongActivity.class);
                startActivity(intent);
            }
        });


        biaobaibutton=findViewById(R.id.biaobai_);
        biaobaibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fenleiActivity.this, biaobaiActivity.class);
                startActivity(intent);
            }
        });

        tiaozaobutton=findViewById(R.id.tiaozao_b);
        tiaozaobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fenleiActivity.this, tiaozaoActivity.class);
                startActivity(intent);
            }
        });

        tucaobutton=findViewById(R.id.tucao_b);
        tucaobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fenleiActivity.this, tucaoActivity.class);
                startActivity(intent);
            }
        });


    }


    }

