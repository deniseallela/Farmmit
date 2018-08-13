package com.xyz.farmit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.xyz.farmit.Custom;
import com.xyz.farmit.CustomAdapter;
import com.xyz.farmit.R;

import java.util.ArrayList;
import java.util.List;

public class listings extends AppCompatActivity {
    //declare variables to hold the views
    List<Custom> listtems;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listings);
        //find item based on id
        listView=findViewById(R.id.listview);
        listtems=new ArrayList<>();
        listtems.add(new Custom(R.drawable.a,"Allela","DEnashjd"));
        listtems.add(new Custom(R.drawable.b,"DEnise","DEnada"));
        listtems.add(new Custom(R.drawable.c,"POpop","DEnafa"));
        listtems.add(new Custom(R.drawable.d,"Aabfaa","DEnaa"));
        listtems.add(new Custom(R.drawable.th,"bajhab","DEn"));
        listtems.add(new Custom(R.drawable.b,"Allela","DEn"));
        listtems.add(new Custom(R.drawable.c,"Allela","DEn"));
        listtems.add(new Custom(R.drawable.d,"Allela","DEn"));
        listtems.add(new Custom(R.drawable.a,"Allela","DEn"));
        CustomAdapter adapter=new CustomAdapter(listings.this,
                R.layout.deedee,listtems);
        listView.setAdapter(adapter);


    }
}
