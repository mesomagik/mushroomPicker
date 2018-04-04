package com.example.bartkowalski.mushroompicker;

import android.app.Activity;
import android.app.FragmentContainer;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.bartkowalski.mushroompicker.Fragments.FragmentFirst;
import com.example.bartkowalski.mushroompicker.Fragments.FragmentSecond;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.buttonFragment1);
        Button button2 = findViewById(R.id.buttonFragment2);


        FragmentFirst fragment = new FragmentFirst();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentFirst fragment = new FragmentFirst();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentSecond fragment = new FragmentSecond();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .commit();
            }
        });
    }
}
