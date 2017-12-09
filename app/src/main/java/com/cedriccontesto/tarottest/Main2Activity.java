package com.cedriccontesto.tarottest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    public void clickFunction (View view) {

        EditText dollarAmount = (EditText) findViewById(R.id.dollarAmount);

        Toast.makeText(this, "Dollar amount :" + dollarAmount.getText().toString(), Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
