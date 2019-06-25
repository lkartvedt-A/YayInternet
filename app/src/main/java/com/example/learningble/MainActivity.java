package com.example.learningble;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.net.URL;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.net.HttpURLConnection;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        findViewById(R.id.plus_button).setOnClickListener(this);

        listview = findViewById(R.id.list_view);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("My");
        arrayList.add("Name");
        arrayList.add("Is");
        arrayList.add("Lindsey");
        arrayList.add("Marie");
        arrayList.add("Kartvedt");
        arrayList.add("My");
        arrayList.add("Name");
        arrayList.add("Is");
        arrayList.add("Lindsey");
        arrayList.add("Marie");
        arrayList.add("Kartvedt");
        arrayList.add("My");
        arrayList.add("Name");
        arrayList.add("Is");
        arrayList.add("Lindsey");
        arrayList.add("Marie");
        arrayList.add("Kartvedt");
        arrayList.add("My");
        arrayList.add("Name");
        arrayList.add("Is");
        arrayList.add("Lindsey");
        arrayList.add("Marie");
        arrayList.add("Kartvedt");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listview.setAdapter(arrayAdapter);

    }

//    public static void getPostsList() {
//
//        try {
//            getPostStartup(new URL(baseURL));
//        } catch (Exception ex) {
//            System.out.println("Error occured");
//        }
//    }
//
//    public static void getPostStartup(URL url) {
//
//        try {
//            conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//
//            conn.setDoOutput(true);
//            conn.connect();
//            printData(conn);
//        } catch(Exception ex) {
//            System.out.println("Error occured");
//        }
//    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.plus_button:
                intent = new Intent(this, CreatePost.class);
                startActivity(intent);
                break;

        }
    }

}
