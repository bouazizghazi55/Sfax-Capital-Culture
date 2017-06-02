package com.example.ghazi.sfaxcapitaleculture;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClickedCapitale(View view) {

        Intent I=new Intent(getApplicationContext(),Capitale.class);
        startActivity(I);
    }

    public void buttonClickedSfax(View view) {

       Intent J=new Intent(getApplicationContext(),Sfax.class);
        startActivity(J);
    }

    public void buttonVideo(View view) {

        String url = "https://www.youtube.com/watch?v=jZwd7X0WVkI";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }
}
