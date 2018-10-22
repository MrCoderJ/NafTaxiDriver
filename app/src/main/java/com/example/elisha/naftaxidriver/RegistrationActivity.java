package com.example.elisha.naftaxidriver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class RegistrationActivity extends AppCompatActivity {
   public RelativeLayout step1;
   public  RelativeLayout step2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        step1 = (RelativeLayout) findViewById(R.id.step_one);

    }

    public void gotoStepOne(){
       // Intent intent = new Intent(this, AcceptRide.class);
        //startActivity(intent);
    }
    public void gotoStepTwo(){
        step1.setVisibility(VISIBLE);
        step2.setVisibility(VISIBLE);

    }
    public void getARide(View view){
        Intent intent = new Intent(this, AcceptRide.class);
        startActivity(intent);
    }
}
