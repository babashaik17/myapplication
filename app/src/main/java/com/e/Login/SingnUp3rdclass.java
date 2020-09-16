package com.e.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.hbb20.CountryCodePicker;

public class SingnUp3rdclass extends AppCompatActivity {

    TextInputLayout phonenumber;
    ImageView backBtn;
    CountryCodePicker countryCodePicker;
    //variables
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singn_up3rdclass);
        //hooks
        scrollView = findViewById(R.id.singnup3rd_screen_scrollview);
        countryCodePicker=findViewById(R.id.country_code_picker);
        phonenumber = findViewById(R.id.singnup_phonenumber);



    }

    private boolean validatePhoneNumber() {
        String val = phonenumber.getEditText().getText().toString().trim();
        String checkspaces = "Aw{1,10}z";
        if (val.isEmpty()) {
            phonenumber.setError("Enter valid phone number");
            return false;
        } else if (val.length()!=10) {
            phonenumber.setError("No White spaces are allowed!");
            return false;
        } else {
            phonenumber.setError(null);
            phonenumber.setErrorEnabled(false);
            return true;
        }
    }


    public void callnextOTPscreen(View view) {
        //validate fields
        if (!validatePhoneNumber()){
            return;
        }
        //validation succeeded and move to next screen to verify phone number and save data
        //get all values passed from previous screens using intent
        String _fullname = getIntent().getStringExtra("fullName");
        String _email= getIntent().getStringExtra("email");
        String _username = getIntent().getStringExtra("username");
        String _password = getIntent().getStringExtra("password");
        String _date= getIntent().getStringExtra("date");
        String _gender = getIntent().getStringExtra("gender");
        String _getUserEnteredPhoneNumber= phonenumber.getEditText().getText().toString().trim(); //get phone number
        String _phoneNoo = "+"+countryCodePicker.getFullNumber() +_getUserEnteredPhoneNumber;

        Intent intent = new Intent(getApplicationContext(),VerifyOTP.class);

        intent.putExtra("fullName", _fullname);
        intent.putExtra("email", _email);
        intent.putExtra("username", _username);
        intent.putExtra("password", _password);
        intent.putExtra("date", _date);
        intent.putExtra("gender", _gender);
        intent.putExtra("phoneNo", _phoneNoo);
        // This is to identify that which action should OTP perform after verification.
        startActivity(intent);



    }
}