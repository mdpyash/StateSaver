package com.example.statesaver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String KEY_COUNTER = "COUNTER";
    int mCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCLickCounter (View view){
        TextView textView;
        mCounter++;
        //((TextView) findViewById(R.id.textView)).setText("Counter: " + Integer.toString(mCounter));
        textView = findViewById(R.id.textView);
        textView.setText("Counter: " + Integer.toString(mCounter));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNTER,mCounter);
    }

    //This code would have worked even in the onCreate method.
    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        if(saveInstanceState != null){
            mCounter = saveInstanceState.getInt(KEY_COUNTER);
        }
    }


}
