package com.example.tugaslatihanintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MvActivity extends AppCompatActivity implements View.OnClickListener {
    Button dalladalla;
    Button icy;
    Button wannabe;
    Button notshy;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mv);
        dalladalla = (Button)findViewById(R.id.dalladalla);
        dalladalla.setOnClickListener(this);
        icy = (Button)findViewById(R.id.icy);
        icy.setOnClickListener(this);
        wannabe = (Button)findViewById(R.id.wannabe);
        wannabe.setOnClickListener(this);
        notshy = (Button)findViewById(R.id.notshy);
        notshy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dalladalla:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/pNfTK39k55U"));
                startActivity(implicit);
                break;
            case R.id.icy:
                Intent implicit2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/zndvqTc4P9I"));
                startActivity(implicit2);
                break;
            case R.id.wannabe:
                Intent implicit3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/fE2h3lGlOsk"));
                startActivity(implicit3);
                break;
            case R.id.notshy:
                Intent implicit4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/wTowEKjDGkU"));
                startActivity(implicit4);
                break;
            default:
                break;
        }
    }
}
