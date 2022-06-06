package com.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class RonyAdapter extends ArrayAdapter<String> {
    private Context context;
    private String [] arr;
    public RonyAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.context= context;
        this.arr= arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_rony_layout, parent, false);
        TextView t= convertView.findViewById(R.id.textView);
        t.setText(getItem(position));
        //making onclickListener in custom layout
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You clicked on " + position, Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}

