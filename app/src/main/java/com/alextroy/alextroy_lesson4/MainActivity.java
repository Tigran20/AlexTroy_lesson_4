package com.alextroy.alextroy_lesson4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomViewGroup customViewGroup = findViewById(R.id.custom_view_group);
        LayoutInflater layoutInflater = getLayoutInflater();

        String text;

        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                text = "Машина " + i;
            } else if (i % 3 == 0) {
                text = "Какой-то текст  " + i;
            } else {
                text = "Пар " + i;
            }

            View view = layoutInflater.inflate(R.layout.child_view, null, false);

            TextView textView = view.findViewById(R.id.child_view);
            textView.setText(text);

            customViewGroup.addView(view);
        }
    }
}
