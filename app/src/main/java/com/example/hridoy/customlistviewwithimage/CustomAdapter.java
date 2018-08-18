package com.example.hridoy.customlistviewwithimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] images;
    String[] userName;
    String[] userMail;

    public CustomAdapter(Context context, int[]images, String[]userName, String[] userMail){

        this.context = context;
        this.images = images;
        this.userName = userName;
        this.userMail = userMail;

    }

    @Override
    public int getCount() {
        return userName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater myInflater = LayoutInflater.from(context);

        view = myInflater.inflate(R.layout.custom_list_item,null,false);

        ImageView image = view.findViewById(R.id.user_image);
        TextView name = view.findViewById(R.id.user_name);
        TextView mail = view.findViewById(R.id.user_mail);

        image.setImageResource(images[i]);
        name.setText(userName[i]);
        mail.setText(userMail[i]);



        return view;
    }
}
