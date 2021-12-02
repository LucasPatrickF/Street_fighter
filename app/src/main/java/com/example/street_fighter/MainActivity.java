package com.example.street_fighter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String idpersonagem []={"Vega","Akuma","Zangief","Dhalsim","E. Honda", "Blanka","Ken","Ryu", "Sagat","Chun-Li"};

    int idimgpersonagem[]={R.drawable.Vega, R.drawable.Akuma, R.drawable.Zangief, R.drawable.Dhalsim, R.drawable.EHonda, R.drawable.Blanka, R.drawable.Ken,R.drawable.Ryu, R.drawable.Sagat,R.drawable.ChunLi}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}