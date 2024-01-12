package com.example.practicle_81;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.DatePicker;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    DatePicker dt1;
    Button bt1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dt1=findViewById(R.id.d1);
        bt1=findViewById(R.id.b1);
        tv1=findViewById(R.id.t1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("Select date:: "+dt1.getDayOfMonth()+"/"+(dt1.getMonth()+1)+"/"+dt1.getYear());
            }
        });

    }

}