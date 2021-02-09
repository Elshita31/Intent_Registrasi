package com.dycode.edu.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_DATA="EXTRA_DATA";
    public static final String EXTRA_DATA1="EXTRA_DATA1";
    public static final String EXTRA_DATA2="EXTRA_DATA2";
    public static final String EXTRA_DATA3="EXTRA_DATA3";
    private EditText editText;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;

    private Button btnSenData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText);
        editText1 =(EditText)findViewById(R.id.editText1);
        editText2 =(EditText)findViewById(R.id.editText2);
        editText3 =(EditText)findViewById(R.id.editText3);
        btnSenData = (Button)findViewById(R.id.button);


        btnSenData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String data = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, TargetActivity.class);
                intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);

                String data1 = editText1.getText().toString();
                Intent intent1 = new Intent(MainActivity.this, TargetActivity.class);
                intent1.putExtra(EXTRA_DATA1, data1);
                startActivity(intent1);

                String data2 = editText2.getText().toString();
                Intent intent2 = new Intent(MainActivity.this, TargetActivity.class);
                intent2.putExtra(EXTRA_DATA2, data2);
                startActivity(intent2);

                String data3 = editText3.getText().toString();
                Intent intent3 = new Intent(MainActivity.this, TargetActivity.class);
                intent3.putExtra(EXTRA_DATA3, data3);
                startActivity(intent3);

            }
        });
    }
}