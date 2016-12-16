package com.example.audi_abir.smartcity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListSer extends AppCompatActivity {
    String[] listArray = {"• Road Cutting Permission","• New Holding Number","• Procedure Of Holding Tax Service","• Transfer of Holding Name","• New and Renewal of Trade License","• Birth Certificate","• Burial Ground Booking/ Reservation","• Anti-Tobacco Guideline","• Community Center Booking","• No Objection Certificate for Multistoried Building","• Purchase of GIS Based Map","• Entrepreneurs of   Town information and Service Center(TISC)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listmy);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_main, listArray);

        ListView mlistView = (ListView)findViewById(R.id.mobile_list);
        mlistView.setAdapter(adapter);
    }
}
