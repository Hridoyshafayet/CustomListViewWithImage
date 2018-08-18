package com.example.hridoy.customlistviewwithimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView userImage;
    TextView userName;
    TextView userMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        userImage = findViewById(R.id.user_image);
        userName = findViewById(R.id.user_name_tv);
        userMail = findViewById(R.id.user_mail_tv);


       int image =  getIntent().getIntExtra("IMAGE",0);
       userImage.setImageResource(image);

       String name = getIntent().getStringExtra("USERNAME").toString();

       userName.setText(name);

       String mail = getIntent().getStringExtra("USERMAIL").toString();

       userMail.setText(mail);


    }
}
