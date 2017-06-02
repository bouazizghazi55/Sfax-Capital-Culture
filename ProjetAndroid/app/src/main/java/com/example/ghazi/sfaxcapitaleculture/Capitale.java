package com.example.ghazi.sfaxcapitaleculture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Capitale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitale);
    }

    public void buttonClickedProgramme(View view) {

        Intent I=new Intent(getApplicationContext(),EventProgram.class);
        startActivity(I);
    }


    public void buttonClickedPresentation(View view) {

        Intent I=new Intent(getApplicationContext(),EventPresentation.class);
        startActivity(I);
    }
}
