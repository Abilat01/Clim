package com.abilat.svetofor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstraintLayout = (ConstraintLayout) findViewById(R.id.root_layout);
        mInfoTextView = (TextView) findViewById(R.id.textViewInfo);

        Button red_button = (Button) findViewById(R.id.red_button);
        red_button.setOnClickListener(this);
        Button yellow_button = (Button) findViewById(R.id.yellow_button);
        yellow_button.setOnClickListener(this);
        Button green_button = (Button) findViewById(R.id.green_button);
        green_button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.red_button:
                mInfoTextView.setText(R.string.red);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                        R.color.redColor));
                break;

            case R.id.yellow_button:
                mInfoTextView.setText(R.string.yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                        R.color.yellowColor));
                break;

            case R.id.green_button:
                mInfoTextView.setText(R.string.green);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                        R.color.greenColor));
                break;

        }

    }

}
