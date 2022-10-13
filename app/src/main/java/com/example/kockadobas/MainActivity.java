package com.example.kockadobas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView kocka1, kocka2;
    private Button btn1, btn2, btn3, btn4;
    private TextView szoveg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addListener();
    }

    private void addListener(){

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kocka2.setVisibility(View.GONE);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kocka2.setVisibility(View.VISIBLE);
            }
        });

    }

    private void init(){
        kocka1 = findViewById(R.id.kocka_1);
        kocka2 = findViewById(R.id.kocka_2);
        btn1 = findViewById(R.id.k1Btn);
        btn2 = findViewById(R.id.k2Btn);
        btn3 = findViewById(R.id.k3Btn);
        btn4 = findViewById(R.id.k4Btn);
        szoveg = findViewById(R.id.szoveg);
    }
}