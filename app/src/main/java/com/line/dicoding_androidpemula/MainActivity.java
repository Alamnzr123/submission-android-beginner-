package com.line.dicoding_androidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread Thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // System.err.println(e.toString());
                //System.err.println(e.getMessage());
                finally {
                    Intent welcomeIntent = new Intent(MainActivity.this, go.class);
                    startActivity(welcomeIntent);
                }
            }
        };
        Thread.start();
    }
}
