package ru.mirea.slivinskiy.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        String text = "Сообщение из первого activity \n" + intent.getStringExtra("key");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(text);
    }
}