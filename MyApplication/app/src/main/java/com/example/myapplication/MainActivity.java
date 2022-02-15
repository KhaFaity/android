package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edt_a = findViewById(R.id.ed_soA);
        EditText edt_b = findViewById(R.id.ed_soB);
        TextView textv_kq = findViewById(R.id.tv_kq);
        Button btn_tong = findViewById(R.id.tv_tong);
        Button btn_hieu = findViewById(R.id.tv_hieu);
        Button btn_tich = findViewById(R.id.tv_tich);
        Button btn_thuong = findViewById(R.id.tv_thuong);
        Button btn_uoc = findViewById(R.id.tv_uocchung);
        Button btn_thoat = findViewById(R.id.tv_thoat);

        btn_tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sum = 0;
                try {
                    double a = Double.parseDouble(edt_a.getText().toString().trim());
                    double b = Double.parseDouble(edt_b.getText().toString().trim());

                    sum = (a+b)*1.0;
                }catch ( Exception e){

                }
                textv_kq.setText("" + sum);
            }
        });
        btn_tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tich=0;
                try {
                    double a = Double.parseDouble(edt_a.getText().toString().trim());
                    double b = Double.parseDouble(edt_b.getText().toString().trim());
                    tich = a*b*1.0;
                } catch (Exception e){

                }
                textv_kq.setText("" + tich);
            }
        });



    }
}