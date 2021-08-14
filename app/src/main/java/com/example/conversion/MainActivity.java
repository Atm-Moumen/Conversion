package com.example.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void convMoneymethod(View view) {
        Intent intent = new Intent(this, money.class);
        startActivity(intent);
    }

    public void convTempmethod(View view) {
        Intent intent = new Intent(this, temperateur.class);
        startActivity(intent);
    }
}