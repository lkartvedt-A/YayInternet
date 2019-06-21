package com.example.learningble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.post_button).setOnClickListener(this);
        findViewById(R.id.get_button).setOnClickListener(this);
        findViewById(R.id.put_button).setOnClickListener(this);
        findViewById(R.id.patch_button).setOnClickListener(this);
        findViewById(R.id.delete_button).setOnClickListener(this);
        Log.d("BUTTONS:", "onCLickListener Set!");

    }


    @Override
    public void onClick(View v){

        switch(v.getId()) {
            case R.id.post_button:
                Log.d("POST BUTTON:", "Works!");
                break;
            case R.id.get_button:
                Log.d("GET BUTTON:", "Works!");
                break;
            case R.id.put_button:
                Log.d("PUT BUTTON:", "Works!");
                break;
            case R.id.patch_button:
                Log.d("PATCH BUTTON:", "Works!");
                break;
            case R.id.delete_button:
                Log.d("DELETE BUTTON:", "Works!");
                break;
        }

    }

}
