package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View v){

        TextView textView = (TextView) findViewById(R.id.Display);

        EditText editText = (EditText) findViewById(R.id.editText);

        String value = editText.getText().toString();

        textView.setText(value);


        //Button button = (Button) v;
        //EditText editText = (EditText) editText;
        //((Button) v).setText("clicked");
        //((EditText) i).setText("Test");
    }


}
