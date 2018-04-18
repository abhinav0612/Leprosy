package com.musikk.tronku.leprosy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView about;
    CardView know;
    CardView check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about = findViewById(R.id.about);
        know = findViewById(R.id.know);
        check = findViewById(R.id.check);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(MainActivity.this, About.class);
                startActivity(about);
            }
        });

        know.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent know = new Intent(MainActivity.this, KnowSym.class);
                startActivity(know);
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent check = new Intent(MainActivity.this, Check.class);
                startActivity(check);
            }
        });
    }
}
