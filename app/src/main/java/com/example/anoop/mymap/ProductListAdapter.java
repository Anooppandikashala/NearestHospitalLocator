package com.example.anoop.mymap;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by anoop on 5/19/17.
 */

        import android.content.Context;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;

        import java.util.List;

        import android.content.Context;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;

        import java.util.List;

        import android.content.Context;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;

import java.util.List;


public class ProductListAdapter extends BaseAdapter {


    private Context mContext;
    private List<Product> mProductList;

    //constructor


    public ProductListAdapter(Context mContext, List<Product> mProductList) {
        this.mContext = mContext;
        this.mProductList = mProductList;
    }

    @Override
    public int getCount() {
        return mProductList.size();
    }

    @Override
    public Object getItem(int position) {
        return mProductList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v;
        v = View.inflate(mContext, R.layout.activity_hospital_list,null);
        TextView tvName =(TextView)v.findViewById(R.id.tv_name);
        TextView tvTime =(TextView)v.findViewById(R.id.tv_time);
        //set text view
        tvName.setText(mProductList.get(position).getName());
        tvTime.setText(String.valueOf(mProductList.get(position).getDistance()));

        //save product id to tag

        v.setTag(mProductList.get(position).getDistance());
        return v;
    }
}

