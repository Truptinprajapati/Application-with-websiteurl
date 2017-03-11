package com.example.lenovo.applicationwithwebsiteurl;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView google=(TextView)findViewById(R.id.google);
        TextView facebook=(TextView)findViewById(R.id.facebook);
        TextView filpkart=(TextView)findViewById(R.id.filpkart);
        TextView github=(TextView)findViewById(R.id.github);
        TextView mygithub=(TextView)findViewById(R.id.mygithub);
        TextView amazon=(TextView)findViewById(R.id.amazon);
        TextView gmail=(TextView)findViewById(R.id.gmail);
        TextView voot=(TextView)findViewById(R.id.voot);




        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent("android.intent.action.VIEW");
                   i.setData(Uri.parse("http://www.google.co.in/"));
                startActivity(i);
            }
        });



        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i= new Intent("android.intent.action.VIEW");
                i.setData(Uri.parse("http://m.facebook.com/"));
                startActivity(i);
            }
        });

        filpkart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i= new Intent("android.intent.action.VIEW");
                i.setData(Uri.parse("https://www.flipkart.com/"));
                startActivity(i);
            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent("android.intent.action.VIEW");
                i.setData(Uri.parse("http://www.github.com/"));
                startActivity(i);
            }
        });

        mygithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent("android.intent.action.VIEW");
                i.setData(Uri.parse("http://www.github.com/truptinprajapati"));
                startActivity(i);
            }
        });

        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent("android.intent.action.VIEW");
                i.setData(Uri.parse("http://www.amazon.co.in/"));
                startActivity(i);
            }
        });

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent("android.intent.action.VIEW");
                i.setData(Uri.parse("http://www.gmail.com/"));
                startActivity(i);

            }
        });

        voot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent("android.intent.action.VIEW");
                i.setData(Uri.parse("http://www.voot.com/"));
                startActivity(i);
            }
        });




    }
}


