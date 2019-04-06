package com.example.myapplication_json_practice.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication_json_practice.Modal.Student;
import com.example.myapplication_json_practice.R;

import java.util.ArrayList;

public class List_Adapter extends BaseAdapter {
    private Context context;
    Student s=new Student();
    private ArrayList<Student> studentsArrayList;
    @Override
    public int getCount() {
        return studentsArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return studentsArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.customlistview,parent, false);
        }

        TextView txtEid = convertView.findViewById(R.id.lblid);
        TextView txtEnm = convertView.findViewById(R.id.lblname);
        TextView txtECountry = convertView.findViewById(R.id.lblgender);

        Student mEmployee = (Student) getItem(position);

        txtEid.setText(String.valueOf(mEmployee.getSid()));
        txtEnm.setText(mEmployee.getSname());
        txtECountry.setText(mEmployee.getGender());


        return convertView;
    }
}
