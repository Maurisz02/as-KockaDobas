package com.example.kockadobas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView kocka1, kocka2;
    private Button btn1, btn2, btn3, btn4;
    private TextView szoveg;
    private Random rnd;
    private int dobas1;
    private int dobas2;
    private AlertDialog.Builder ad;

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

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rnd = new Random();
                dobas1 = rnd.nextInt(6)+1;
                dobas2 = rnd.nextInt(6)+1;

                if (kocka2.getVisibility() == View.GONE){
                    szoveg.append(String.valueOf(dobas1)+"\n");
                    switch (dobas1)
                    {
                        case 1:
                            kocka1.setImageResource(R.drawable.kocka1);
                            break;
                        case 2:
                            kocka1.setImageResource(R.drawable.kocka2);
                            break;
                        case 3:
                            kocka1.setImageResource(R.drawable.kocka3);
                            break;
                        case 4:
                            kocka1.setImageResource(R.drawable.kocka4);
                            break;
                        case 5:
                            kocka1.setImageResource(R.drawable.kocka5);
                            break;
                        case 6:
                            kocka1.setImageResource(R.drawable.kocka6);
                            break;
                    }
                }else{
                    int ossz = dobas1+dobas2;
                    szoveg.append(String.format("%d (%d + %d)",ossz, dobas1, dobas2)+"\n");

                    switch (dobas1)
                    {
                        case 1:
                            kocka1.setImageResource(R.drawable.kocka1);
                            break;
                        case 2:
                            kocka1.setImageResource(R.drawable.kocka2);
                            break;
                        case 3:
                            kocka1.setImageResource(R.drawable.kocka3);
                            break;
                        case 4:
                            kocka1.setImageResource(R.drawable.kocka4);
                            break;
                        case 5:
                            kocka1.setImageResource(R.drawable.kocka5);
                            break;
                        case 6:
                            kocka1.setImageResource(R.drawable.kocka6);
                            break;
                    }

                    switch (dobas2)
                    {
                        case 1:
                            kocka2.setImageResource(R.drawable.kocka1);
                            break;
                        case 2:
                            kocka2.setImageResource(R.drawable.kocka2);
                            break;
                        case 3:
                            kocka2.setImageResource(R.drawable.kocka3);
                            break;
                        case 4:
                            kocka2.setImageResource(R.drawable.kocka4);
                            break;
                        case 5:
                            kocka2.setImageResource(R.drawable.kocka5);
                            break;
                        case 6:
                            kocka2.setImageResource(R.drawable.kocka6);
                            break;
                    }
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ad.setMessage("Biztos, hogy törölni szeretnéd az eddigi dobásokat?").setTitle("Reset").setCancelable(false).setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }).setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        szoveg.setText("");
                        kocka1.setImageResource(R.drawable.kocka1);
                        kocka2.setImageResource(R.drawable.kocka1);
                    }
                });
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
        ad =  new AlertDialog.Builder(MainActivity.this);
    }
}