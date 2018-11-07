package com.example.randomnumbergenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // TODO: Write code
        setContentView(R.layout.activity_main);
    }


    // onClick functions must be public void, and have View as single argument
    public void toastMe(View view){
        Toast myToast = Toast.makeText(this, "Welcome Toast!", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view){
        TextView countTextView = (TextView) findViewById(R.id.main_textView);
        String countString = countTextView.getText().toString();
        Integer count = Integer.parseInt(countString);
        count++;
        countTextView.setText(count.toString());
    }

    public void randomMe(View view){
        Intent randomIntent = new Intent(this, SecondActivity.class);

        TextView countTextView = (TextView) findViewById(R.id.main_textView);
        Integer count = Integer.parseInt(countTextView.getText().toString());

        randomIntent.putExtra(TOTAL_COUNT, count);
        startActivity(randomIntent);
    }
}
