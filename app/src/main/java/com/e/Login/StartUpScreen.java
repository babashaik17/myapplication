package com.e.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;

public class StartUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_start_up_screen);
    }

    public void callloginscreen(View view) {
        Intent intent=new Intent(getApplicationContext(),Login.class);
        Pair[] pairs=new Pair[1];
        pairs[0]=new Pair<View,String>(findViewById(R.id.login_btn),"transition_login");

        ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(StartUpScreen.this,pairs);
        startActivity(intent,options.toBundle());
    }


    public void callnextSignupscreennew(View view) {
        Intent intent=new Intent(getApplicationContext(),SingnUp.class);
        Pair[] pairs=new Pair[1];
        pairs[0]=new Pair<View,String>(findViewById(R.id.signup_btn),"transition_singnin");

        ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(StartUpScreen.this,pairs);
        startActivity(intent,options.toBundle());
    }


}