package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Button plov1 = (Button) findViewById(R.id.plov1);
        View.OnClickListener oclplov1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(a.this,MainActivity.class);
                startActivity(intent);
            }
        };
        MediaPlayer sencondss;
        sencondss = MediaPlayer.create(this,R.raw.secc);


        plov1.setOnClickListener(oclplov1);
        TextView secunda = (TextView) findViewById(R.id.secunda);
        Button secunda1 = (Button) findViewById(R.id.secunda1);

        View.OnClickListener oclsecunda1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long seconds = Long.parseLong(secunda.getText().toString());
                CountDownTimer my_timer = new CountDownTimer(seconds*1000,1000) {
                    @Override
                    public void onTick(long l) {
                        secunda.setText(Long.toString(l/1000));
                    }

                    @Override
                    public void onFinish() {
                        secunda.setText("Приятного аппетита");
                        soundplay (sencondss);


                    }
                };
                my_timer.start();
            }
        };
        secunda1.setOnClickListener(oclsecunda1);

    }

    private void soundplay(MediaPlayer sencondss) {
        sencondss.start();
    }
}