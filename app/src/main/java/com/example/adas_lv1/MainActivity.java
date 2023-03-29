package com.example.adas_lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.textView1);

        Button bt = (Button) findViewById(R.id.button1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doBtClick();
            }
        });

        System.out.println(">>>>>>> konsolenausgabe");
    }

    public void doBtClick() {
        //System.out.println(" >>>>> Click");
        count++;
        String countStr = String.valueOf(count);
        text1.setText(countStr);
    }
}