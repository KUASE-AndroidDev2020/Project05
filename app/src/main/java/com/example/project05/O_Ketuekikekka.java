package com.example.project05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class O_Ketuekikekka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o__ketuekikekka);
    }

    public void goToMainActivity(View view) {
        Intent toUranai=new Intent(this, MainActivity.class);
        startActivity(toUranai);
    }
}
