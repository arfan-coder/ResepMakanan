package com.example.submission2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public TextView tvdetails;
    public ImageView imgFood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvdetails = findViewById(R.id.tv_nasi_goreng);
        imgFood = findViewById(R.id.imgfood1);


        Food extra = getIntent().getParcelableExtra("objek");
        imgFood.setImageResource(extra.getPhoto());
        tvdetails.setText(extra.getDetails());


    }
}
