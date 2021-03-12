package com.sh1.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton btnImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnImage = findViewById(R.id.btnImage);
    }

    public void toastMsg(View v){
        String texto;
        texto = "Click";
        Toast.makeText(getApplicationContext(),texto, Toast.LENGTH_SHORT);
    }
}