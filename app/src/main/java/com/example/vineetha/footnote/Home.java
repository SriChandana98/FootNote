package com.example.vineetha.footnote;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Home extends AppCompatActivity {
    MaterialSearchView searchView;
    android.widget.ListView lstView;
    String[] lstSource={
            "Computer Networks",
            "Android Development"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("FootNote");
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

        searchView = (MaterialSearchView) findViewById(R.id.search_view);

        /*searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener(){
            /*@Override
            public void onSearchViewShown(){

            }
            @Override
            public void onSearchViewClosed(){
                lstView=(ListView)findViewById(R.id.lstView);
                ArrayAdapter adapter=new ArrayAdapter(Home.this,android.R.layout.simple_list_item_1,lstSource);
                lstView.setAdapter(adapter);

            }
        });
        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener(){
            @Override
            public boolean onQueryTextSubmit(String query){
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText){
                if (newText!=null && !newText.isEmpty()){
                    List<String> lstFound=new ArrayList<String>();
                    for(String item:lstSource){
                        if(item.contains(newText))
                            lstFound.add(item);
                    }
                    ArrayAdapter adapter=new ArrayAdapter(Home.this,android.R.layout.simple_list_item_1,lstFound);
                    lstView.setAdapter(adapter);
                }
                else{
                    ArrayAdapter adapter=new ArrayAdapter(Home.this,android.R.layout.simple_list_item_1,lstSource);
                    lstView.setAdapter(adapter);
                }
            return true;
            }

        }
        );*/

    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu){
        getMenuInflater().inflate(R.menu.menu_item,menu);
        MenuItem item=menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;
    }
}
