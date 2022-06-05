package com.alphabetsapp.listviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdaptor extends BaseAdapter {
    Context context;
    String daysList[];
    int flags[];
     LayoutInflater inflter ;

    private class layoutInflator {
    }
    //constructor of custom adapter
    public CustomAdaptor (Context applicationContext , String[] daysList , int[] flags)
    {
        this.context =context;
        this.daysList = daysList;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));

    }
    @Override
    public int getCount()
    {return daysList.length; }
    @Override
    public Object getItem(int i){ return null ;}
    @Override
    public long getItemId(int i ){return 0;}

    @Override
    public View getView (int i , View view , ViewGroup viewgroup)
    {
        view = inflter.inflate(R.layout.activity_listview, null );
        TextView day = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        day.setText(daysList[i]);
        icon.setImageResource(flags[i]);
        return view;

    }



}