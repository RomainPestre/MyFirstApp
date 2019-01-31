package com.example.myfirstapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view){
        //Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT);
        myToast.show();
    }

    @SuppressLint("SetTextI18n")
    public void countMe(View view){
        //Get the text view
        TextView showCountTextView = findViewById(R.id.textView2);

        //Get the value of the text view
        String countString = showCountTextView.getText().toString();

        //Convert value to a number and increment it
        int count = Integer.parseInt(countString);
        count++;

        //Display the new value in the text view
        showCountTextView.setText(Integer.toString(count));
    }

    public void randomMe(View view){
        //Create an Intent to start the second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);

        //Get the text view that shows the count
        TextView showCountTextView = findViewById(R.id.textView2);

        //Get the value of the text view
        String countString = showCountTextView.getText().toString();

        //Convert the count to an int
        int count = Integer.parseInt(countString);

        //Add the count to the extras for the Intent
        randomIntent.putExtra(TOTAL_COUNT, count);

        //Start the new activity
        startActivity(randomIntent);
    }

    private static final String TOTAL_COUNT = "total_count";
}
