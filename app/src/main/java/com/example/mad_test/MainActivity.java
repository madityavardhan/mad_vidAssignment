// app/src/main/java/com/example/mad_test/MainActivity.java
package com.example.mad_test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        listView = findViewById(R.id.listView);

        GridAdapter gridAdapter = new GridAdapter(this);
        ListAdapter listAdapter = new ListAdapter(this);

        gridView.setAdapter(gridAdapter);
        listView.setAdapter(listAdapter);

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            listView.setSelection(position);
        });

        listView.setOnItemClickListener((parent, view, position, id) -> {
            gridView.setSelection(position);
        });
    }
}
