package com.example.lapena5.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createNote(View view) {
        Intent intent = new Intent(MainActivity.this, NotePadActivity.class);
        startActivity(intent);
    }
}
