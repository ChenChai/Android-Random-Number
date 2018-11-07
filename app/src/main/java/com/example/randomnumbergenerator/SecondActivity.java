package com.example.randomnumbergenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    public void showRandomNumber(){
        Intent randomIntent = this.getIntent();

        TextView randomTextView = (TextView) findViewById(R.id.random_textView);
        TextView headerTextView = (TextView) findViewById(R.id.random_header_textView);

        int count = randomIntent.getIntExtra(TOTAL_COUNT, 0);

        Random random = new Random();

        int randomInt = 0;
        if(count > 0){
            randomInt = random.nextInt(count);
        }

        randomTextView.setText(Integer.toString(randomInt));
        headerTextView.setText(getString(R.string.random_heading,count));

    }

}
