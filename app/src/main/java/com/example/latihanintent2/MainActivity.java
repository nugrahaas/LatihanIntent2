package com.example.latihanintent2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button explicit;
    Button implicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicit = findViewById(R.id.explixitIntent);
        explicit.setOnClickListener(this);
        implicit = findViewById(R.id.implicitIntent);
        implicit.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.explixitIntent:
                Intent explicitt = new Intent(this, intent.class);
                startActivity(explicitt);
                break;
            case R.id.implicitIntent:
                Intent ixplicitt = new Intent(Intent.ACTION_VIEW, Uri.parse("htttp://www.w3school.com"));
                startActivity(ixplicitt);
                break;

            default:
                break;
        }

    }
}
