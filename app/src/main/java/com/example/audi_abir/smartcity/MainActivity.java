package com.example.audi_abir.smartcity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button navigate;
    Button navigate2;
    Button navigate3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.row);
        navigate=(Button)findViewById(R.id.button1);
        navigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Role.class);
                startActivity(intent);
            }
        });
        navigate2=(Button)findViewById(R.id.button2);
        navigate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, job.class);
                startActivity(intent);
            }
        });
        navigate3=(Button)findViewById(R.id.button3);
        navigate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, project.class);
                startActivity(intent);
            }
        });

    }
}
