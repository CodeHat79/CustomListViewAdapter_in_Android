package com.example.codehat79.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflter;
    String []Cust;
    String []Bal;
    String []Dues;



public CustomAdapter(Context c,String [] C,String [] B,String [] D)
    {
        this.context=c;
        this.Cust=C;
        this.Bal = B;
        this.Dues=D;
        inflter = (LayoutInflater.from(c));
    }
    @Override

    public int getCount() {
        return Cust.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflter.inflate(R.layout.listitems_layout, null);
        TextView cname=view.findViewById(R.id.textViewCustomer);
        TextView cbal=view.findViewById(R.id.textViewBalance);
        TextView cdue=view.findViewById(R.id.textViewDue);
        cname.setText(Cust[position]);
        cbal.setText(Bal[position]);
        cdue.setText(Dues[position]);

        return view;
    }
}
