package com.example.tugaslatihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button explicititzy;
    Button implicititzy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicititzy = (Button)findViewById(R.id.explicititzy);
        explicititzy.setOnClickListener(this);
        implicititzy = (Button)findViewById(R.id.explicititzy2);
        implicititzy.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.explicititzy:
                Intent explicit = new Intent(MainActivity.this,IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.explicititzy2:
                Intent explicit2 = new Intent (MainActivity.this,MvActivity.class);
                startActivity(explicit2);
                break;
            default:
                break;
        }
    }
}
