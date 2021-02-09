package com.dycode.edu.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    private TextView txtResult;
    private TextView txtResult1;
    private TextView txtResult2;
    private TextView txtResult3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        txtResult = (TextView)findViewById(R.id.textView);
        txtResult1 = (TextView)findViewById(R.id.textView1);
        txtResult2 = (TextView)findViewById(R.id.textView2);
        txtResult3 = (TextView)findViewById(R.id.textView3);

        //get data
        if(getIntent().getExtras() !=null) {
            String data = getIntent().getExtras().getString(MainActivity.EXTRA_DATA);
            txtResult.setText(data);

            String data1 = getIntent().getExtras().getString(MainActivity.EXTRA_DATA1);
            txtResult1.setText(data1);

            String data2 = getIntent().getExtras().getString(MainActivity.EXTRA_DATA2);
            txtResult2.setText(data2);

            String data3 = getIntent().getExtras().getString(MainActivity.EXTRA_DATA3);
            txtResult3.setText(data3);
        }
    }
}