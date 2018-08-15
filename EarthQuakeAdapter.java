package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {
    public EarthQuakeAdapter(Context context, List<EarthQuake> earthquakes) {
        super(context,0,earthquakes);
    }

    @Override
    public View getView(int Position, View convertView, ViewGroup parent){
        View ListItemView=convertView;
        if(ListItemView==null){
            ListItemView= LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item,parent,false);
        }
        EarthQuake currentEarthQuake=getItem(Position);
        TextView magnitudeView=(TextView)ListItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthQuake.getmMagnitude());
        TextView locationView=(TextView)ListItemView.findViewById(R.id.location);
        locationView.setText(currentEarthQuake.getmLocation());
           TextView dateView=(TextView)ListItemView.findViewById(R.id.date);
        dateView.setText(currentEarthQuake.getmDate());
        return ListItemView;
    }
}
