package com.example.randomnumbergenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // TODO: Write code
        setContentView(R.layout.activity_main);
    }


    // onClick functions must be public void, and have View as single argument
    public void toastMe(View view){
        Toast myToast = Toast.makeText(this, "Welcome Toast!", Toast.LENGTH_SHORT);
        myToast.show();
        return;
    }

    public void countMe(View view){
        TextView countTextView = (TextView) findViewById(R.id.textView);
        String countString = countTextView.getText().toString();
        Integer count = Integer.parseInt(countString);
        count++;
        countTextView.setText(count.toString());
        return;
    }

}
