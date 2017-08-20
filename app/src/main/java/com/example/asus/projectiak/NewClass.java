package com.example.asus.projectiak;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Asus on 19/05/2017.
 */

public class NewClass extends ArrayAdapter<String>{
    String [] names;
    int [] pict;
    Context xContext;

    public NewClass(Context context, String[] BakeryNames, int[] BakeryPhoto) {
        super(context, R.layout.listview_item);
        this.names = BakeryNames;
        this.pict = BakeryPhoto;
        this.xContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder xViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater xInflater = (LayoutInflater) xContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = xInflater.inflate(R.layout.listview_item, parent, false);
            xViewHolder.xPhoto = (ImageView) convertView.findViewById(R.id.imageView);
            xViewHolder.xName = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(xViewHolder);
        } else{
            xViewHolder = (ViewHolder)convertView.getTag();
        }

            xViewHolder.xPhoto.setImageResource(pict[position]);
            xViewHolder.xName.setText(names[position]);
        return convertView;
    }

    static class ViewHolder{
        ImageView xPhoto;
        TextView xName;
    }
}
