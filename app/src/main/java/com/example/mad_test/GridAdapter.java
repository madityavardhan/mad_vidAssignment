// app/src/main/java/com/example/mad_test/GridAdapter.java
package com.example.mad_test;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    private Context context;
    private String[] colors = {
            "#FF5733", "#FFC300", "#33FF66",
            "#33CCFF", "#CC33FF", "#FF33CC",
            "#FF6633", "#33FFCC", "#CCFF33",
            "#3366FF", "#9933FF", "#FF3366",
            "#66FF33", "#33CC66", "#66CCFF",
            "#FF66CC", "#CC66FF", "#66FFCC"
    };

    public GridAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        }

        View colorView = convertView.findViewById(R.id.colorView);
        colorView.setBackgroundColor(Color.parseColor(colors[position]));

        return convertView;
    }
}
