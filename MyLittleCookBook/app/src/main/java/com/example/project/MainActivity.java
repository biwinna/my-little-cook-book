package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button plov = (Button) findViewById(R.id.plov);
        View.OnClickListener oclplov = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,a.class);
                startActivity(intent);
            }
        };
        plov.setOnClickListener(oclplov);
        Button button2 = (Button) findViewById(R.id.button2);
        View.OnClickListener oclbutton2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,b.class);
                startActivity(intent1);
            }
        };
        button2.setOnClickListener(oclbutton2);
        Button button3 = (Button) findViewById(R.id.button3);
        View.OnClickListener oclbutton3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this,d.class);
                startActivity(intent3);
            }
        };
        button3.setOnClickListener(oclbutton3);
        Button button4 = (Button) findViewById(R.id.button4);
        View.OnClickListener oclbutton4 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this,c.class);
                startActivity(intent4);
            }
        };
        button4.setOnClickListener(oclbutton4);
    }
}