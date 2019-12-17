package com.king.myrecyclerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    String first_name,second_nme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        first_name = getIntent().getStringExtra("fname");
        second_nme = getIntent().getStringExtra("sname");
        Toast.makeText(this, first_name+" "+second_nme, Toast.LENGTH_SHORT).show();
    }
}
