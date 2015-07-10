package com.example.coreyb.univisionapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by coreyb on 7/10/15.
 */
public class CustomAdapter extends ArrayAdapter {

    private Context mContext;
    private ArrayList<Contacts> mList;

    public CustomAdapter(Context context, ArrayList<Contacts> list) {
        super(context, R.layout.contact_item, list);

        mContext = context;
        mList = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.contact_item, null);
        }
        else {
            view = convertView;
        }

        TextView contactNameView = (TextView) view.findViewById(R.id.contact_name);
        TextView phoneNumberView = (TextView) view.findViewById(R.id.phone_number);

        contactNameView.setText( mList.get(position).getName() );
        phoneNumberView.setText( mList.get(position).getNumber() );

        return view;
    }

}

