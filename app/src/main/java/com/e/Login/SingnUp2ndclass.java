package com.e.Login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class SingnUp2ndclass extends AppCompatActivity {

    //variables
    ImageView backBtn;
    Button next, login;
    RadioGroup radioGroup;
    RadioButton selectedGender;
    DatePicker datePicker;
    TextView titletext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singn_up2ndclass2);
        backBtn = findViewById(R.id.signupback_button);
        next = findViewById(R.id.signup_next_button);
        titletext = findViewById(R.id.signup_title_text);
        radioGroup = findViewById(R.id.radiogroup);
        login = findViewById(R.id.signup_login_button);
        datePicker = findViewById(R.id.age_picker);

    }


    public void callsinupactivity3(View view) {
        if (!validateGender()|!validateAge()){
            return;
        }
        selectedGender=findViewById(radioGroup.getCheckedRadioButtonId());
        String _gender=selectedGender.getText().toString();
        int day=datePicker.getDayOfMonth();
        int month=datePicker.getMonth();
        int year=datePicker.getYear();

        String _date=day+"/"+month+"/"+year;

        Intent intent = new Intent(this, SingnUp3rdclass.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private boolean validateGender() {
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select Gender", Toast.LENGTH_SHORT).show();
            return false;

        } else
            return true;

    }

    private boolean validateAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int userAge = datePicker.getYear();
        int isAgeValid = currentYear - userAge;

        if (isAgeValid < 18) {
            Toast.makeText(this, "You are not eligible to apply", Toast.LENGTH_SHORT).show();
            return false;
        } else
            return true;
    }

}
