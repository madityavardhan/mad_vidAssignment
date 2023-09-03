// app/src/main/java/com/example/mad_test/ListAdapter.java
package com.example.mad_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    private Context context;
    private String[] colorNames = {
            "Orange", "Yellow", "Green", "Cyan", "Purple", "Pink", "Orange",
            "Cyan", "Lime", "Magenta", "Lime", "Teal", "Indigo", "Maroon",
            "Navy", "Olive", "Silver", "Gray", "Black", "White",

    };

    public ListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return colorNames.length;
    }

    @Override
    public Object getItem(int position) {
        return colorNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.listTextView);
        textView.setText(colorNames[position]);

        return convertView;
    }
}
