package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        Button button6 = (Button) findViewById(R.id.button6);
        View.OnClickListener oclbutton6 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(d.this,MainActivity.class);
                startActivity(intent);
            }
        };
        button6.setOnClickListener(oclbutton6);
    }
}