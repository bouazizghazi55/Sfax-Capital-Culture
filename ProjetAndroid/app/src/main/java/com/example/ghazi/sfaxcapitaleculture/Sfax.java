package com.example.ghazi.sfaxcapitaleculture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sfax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sfax);
    }

    public void buttonClickedCulture(View view) {
        Intent I=new Intent(getApplicationContext(),SfaxCulture.class);
        startActivity(I);

    }

    public void buttonClickedMuseum(View view) {
        Intent I=new Intent(getApplicationContext(),SfaxMuseum.class);
        startActivity(I);

    }

    public void buttonClickedMonument(View view) {
        Intent I=new Intent(getApplicationContext(),SfaxMonument.class);
        startActivity(I);
    }

    public void buttonClickedPresentation(View view) {
        Intent I=new Intent(getApplicationContext(),PresentationSfax.class);
        startActivity(I);

    }
}
