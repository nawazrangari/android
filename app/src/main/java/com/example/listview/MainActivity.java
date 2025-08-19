package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list1;

    ArrayList<String> arraylocation = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list1 = findViewById(R.id.lv1);

        addlocation();
        ArrayAdapter<String> la = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,arraylocation);

        list1.setAdapter(la);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s1 = arraylocation.get(i);
                Toast.makeText(MainActivity.this,s1, Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void addlocation(){
        arraylocation.add("noida");
        arraylocation.add("bharat");
        arraylocation.add("india");
        arraylocation.add("gujrat");
    }
}