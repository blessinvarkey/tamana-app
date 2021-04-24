package com.example.enablingthedisabled;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

//    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboad);

    }

    public void btn_try(View view) {
        Intent intent = new Intent(this, ThingsToTry.class);
        startActivity(intent);
    }
}