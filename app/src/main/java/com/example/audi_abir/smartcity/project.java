package com.example.audi_abir.smartcity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class project extends AppCompatActivity {


    String[] listArray = {"# Tk 1,379.19cr NID project underway: Anisul Huq","# Emergency repair and maintenance works of damage roads, drain, cross drain, manhole, footpath, median, grilll and other infrastructure of Engineering Division","# Invitation for Tenders for Pick -UP and Microbus","# Supply of Specialize Search and Rescue Equipment","# renovation street light/compound light pole fitting, bracket, switch box cables and HT cable,","# Intentional Competitive Bids (ICB) for Supply of Specialize Search","• Anti-Tobacco Guideline","• Community Center Booking","• No Objection Certificate for Multistoried Building","• Purchase of GIS Based Map","• Entrepreneurs of   Town information and Service Center(TISC)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listmy);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_main, listArray);
        ListView mlistView = (ListView)findViewById(R.id.mobile_list);
        mlistView.setAdapter(adapter);
    }
}
