package com.example.newton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class services extends AppCompatActivity {

    ListView listView;
    ArrayList<String>array;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);


        array = new ArrayList<>();

        array.add("timothy");
        array.add("jimmy");
        array.add("frank");
        array.add("molly");
        array.add("earnerst");
        array.add("musimeta");
        array.add("derrick");
        array.add("manina");
        array.add("aryatuha");
        array.add("waigolo");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),""+array.get(position),Toast.LENGTH_SHORT).show();
            }
        });




    }
}
