package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Button button = (Button) findViewById(R.id.button);
        View.OnClickListener oclbutton = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(b.this,MainActivity.class);
                startActivity(intent);
            }
        };
        button.setOnClickListener(oclbutton);
    }
}