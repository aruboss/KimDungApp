package com.example.aruboss.hieuhaapp.adapter;

import android.app.Activity;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aruboss.hieuhaapp.R;
import com.example.aruboss.hieuhaapp.entry.Story;

import java.util.List;


/**
 * Created by Aru Boss on 29/04/2017.
 */

public class ListStoryAdapter extends ArrayAdapter<Story> {

    Activity context;

    public ListStoryAdapter(Activity context, int resource, List<Story> objects) {
        super(context, resource, objects);
        this.context= context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        if (convertView == null){
            convertView = inflater.inflate(R.layout.item_list_story,null);
        }

        TextView txtName =(TextView)convertView.findViewById(R.id.text_title_item);


        Story item = getItem(position) ;

        txtName.setText(item.getStName());
        ImageView imageView =(ImageView)convertView.findViewById(R.id.image_truyen);

        Resources res = context.getResources();
        String nameImg= item.getStImage().substring(0,item.getStImage().length()-4);
        int resID = res.getIdentifier(nameImg,"drawable",context.getPackageName());

        imageView.setImageResource(resID);




        return convertView;
    }
}
