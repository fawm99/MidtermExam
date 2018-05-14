package com.example.liyu.midtermexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.KeyEvent;
import android.content.res.Resources;
import android.support.v4.content.ContextCompat;
import android.content.Context;

import android.content.DialogInterface;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input; //input
    private TextView printout, change; //output
    private android.widget.Toast Toast;
    private Button nextPageBtn, red, green, blue, pink, ygreen, cyan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = (EditText) findViewById(R.id.input);//clear
        Button buttonClear = (Button) findViewById(R.id.clear);
        buttonClear.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                input.setText("");
            }
        });

        //enter後送入output
        final EditText send = (EditText)findViewById(R.id.input);
        final TextView printout = (TextView)findViewById(R.id.output);
        send.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    printout.setText(send.getText().toString());
                }
                printout.setText(send.getText().toString());
                return false;
            }
        });

        //字體
        final Button red = (Button)findViewById(R.id.Red);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printout.setTextColor(getResources().getColor(R.color.red));
            }
        });
        final Button green = (Button)findViewById(R.id.Green);
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printout.setTextColor(getResources().getColor(R.color.green));
            }
        });
        final Button blue = (Button)findViewById(R.id.Blue);
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printout.setTextColor(getResources().getColor(R.color.blue));
            }
        });

        //背景
        final Button pink = (Button)findViewById(R.id.Pink);
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printout.setBackgroundColor(getResources().getColor(R.color.pink));
            }
        });
        final Button ygreen = (Button)findViewById(R.id.YGreen);
        ygreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printout.setBackgroundColor(getResources().getColor(R.color.ygreen));
            }
        });
        final Button cyan = (Button)findViewById(R.id.Cyan);
        cyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printout.setBackgroundColor(getResources().getColor(R.color.cyan));
            }
        });
    }
}
