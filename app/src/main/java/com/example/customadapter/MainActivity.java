package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
 ListView listView;
 String [] arr={"This is", "item", "item 2", "Another item", "another", "nau", "Mail3", "Mail4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.listView);
//        ArrayAdapter ad= new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
//        listView.setAdapter(ad);
        RonyAdapter ad= new RonyAdapter(this, R.layout.my_rony_layout, arr );
        listView.setAdapter(ad);
    }
}