package com.example.rough01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView01, textView02;
    Button button01, button02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView01 = findViewById(R.id.textView01);
        textView02 = findViewById(R.id.textView02);

        button01 = findViewById(R.id.button01);
        button02 = findViewById(R.id.button02);

        //second button method
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //change second text view on clicking 2nd button
                textView02.setText("Button Second is clicked");

            }
        });


    }

    //first button method
    public void buttonFirstMethod(View view) {
        textView01.setText("Button One is clicked");
    }


}