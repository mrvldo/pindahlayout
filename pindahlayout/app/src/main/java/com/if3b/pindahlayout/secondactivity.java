package com.if3b.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        getSupportActionBar().setTitle("Layout B");
    }
}