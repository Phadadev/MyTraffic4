package com.pw.paphat.mytraffic4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by paphat on 1/21/2016 AD.
 */
public class MyAdapter extends BaseAdapter {

    //Explicit
    private Context objContext;
    private int[] trafficInts;
    private String[] trafficStrings;

    public MyAdapter(Context objContext, int[] trafficInts, String[] trafficStrings) {
        this.objContext = objContext;
        this.trafficInts = trafficInts;
        this.trafficStrings = trafficStrings;
    }   //Constructor

    @Override
    public int getCount() {
        return trafficStrings.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater =(LayoutInflater)objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.my_listview,parent,false);

        //Show Icon
        ImageView iconImageView = (ImageView)view1.findViewById(R.id.imvShowicon);
        iconImageView.setBackgroundResource(trafficInts[position]);

        //Show Title
        TextView titleTextView = (TextView)view1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(trafficStrings[position]);


        return view1;
    }
}   //Main Class
