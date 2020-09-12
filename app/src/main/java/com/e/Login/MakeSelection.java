package com.e.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MakeSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_selection);
    }
    public void gototpscreen(View view) {
        Intent intent=new Intent(this,VerifyOTP.class);
        startActivity(intent);
    }

    public void gototpscreenformobile(View view) {
        Intent intent=new Intent(this,VerifyOTP.class);
        startActivity(intent);
    }
}