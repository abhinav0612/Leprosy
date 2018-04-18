package com.musikk.tronku.leprosy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    TextView quad;
    TextView squad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        quad = findViewById(R.id.quad);
        squad = findViewById(R.id.squad);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.splashtransition);
        quad.startAnimation(myanim);
        squad.startAnimation(myanim);
        final Intent i = new Intent(this, MainActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                }
            }
        };
        timer.start();
    }
}
