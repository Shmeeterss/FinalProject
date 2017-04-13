package com.example.ishmeet.finalproject.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ishmeet.finalproject.R;

import java.util.ArrayList;

/**
 * Created by Ishmeet on 4/9/2017.
 */

public class ListViewAdapter extends BaseAdapter {

    private final ArrayList<String> listResult;
    private Context mContext;
    private final LayoutInflater mInflater;

    public ListViewAdapter(Context context, ArrayList<String> listResult) {
        mContext = context;
        this.listResult = listResult;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listResult.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        TextView view = new TextView(mContext);
//        view.setText(String.valueOf(position));
//        return view;
        ViewHolder holder;
        if(convertView==null){
            convertView = mInflater.inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.textView = (TextView) convertView.findViewById(R.id.list_view_tv);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textView.setText(listResult.get(position));

//        View rowView= mInflater.inflate(R.layout.list_item, parent, false);
//        TextView textView = (TextView)rowView.findViewById(R.id.list_view_tv);
//        textView.setText(String.valueOf(position));
        return convertView;
    }
}

class ViewHolder{
    TextView textView;
}