package com.example.hridoy.customlistviewwithimage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView myCustomListView;

    String[] userName = {"Nazrin","Atik","Kabila","Shaown","Anika"} ;

    String[] userMail = {"Nazrin@gmail.com","Nazrin@gmail.com","Nazrin@gmail.com","Nazrin@gmail.com","Nazrin@gmail.com"};

    int[] userImage = {R.drawable.pick_camera_icon,R.drawable.ic_launcher_background,R.mipmap.ic_launcher,R.drawable.pick_camera_icon,R.drawable.pick_camera_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCustomListView = findViewById(R.id.my_custom_list_view);

        final CustomAdapter myAdapter = new CustomAdapter(MainActivity.this,userImage,userName,userMail);

        myCustomListView.setAdapter(myAdapter);



        myCustomListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Toast.makeText(MainActivity.this, "" + i, Toast.LENGTH_SHORT).show();

                Intent myIntent = new Intent(MainActivity.this,DetailsActivity.class);

                myIntent.putExtra("IMAGE",userImage[i]);
                myIntent.putExtra("USERNAME",userName[i]);
                myIntent.putExtra("USERMAIL",userMail[i]);
                startActivity(myIntent);

            }

        });




    }

}
