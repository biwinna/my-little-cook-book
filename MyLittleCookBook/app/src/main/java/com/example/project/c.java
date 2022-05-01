package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class c extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Button button5 = (Button) findViewById(R.id.button5);
        View.OnClickListener oclbutton5 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(c.this,MainActivity.class);
                startActivity(intent);
            }
        };
        button5.setOnClickListener(oclbutton5);
    }
}