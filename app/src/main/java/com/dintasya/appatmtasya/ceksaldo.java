package com.dintasya.appatmtasya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ceksaldo extends AppCompatActivity {
    int tab = 100000;
    TextView editcek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceksaldo);
        editcek = (TextView) findViewById(R.id.textcek);
        editcek.setText("Saldo Anda Rp. " + String.valueOf(tab));
    }
}

