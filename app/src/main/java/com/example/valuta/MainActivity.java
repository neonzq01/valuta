package com.example.valuta;

import android.os.Bundle;

import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView) this.findViewById(R.id.listViews);

        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();


        list.add(new DataFlags(R.drawable.jp, R.string.japanese, R.string.japaneseYEN, R.string.tokyo));
        list.add(new DataFlags(R.drawable.ru, R.string.russian, R.string.russianRUB, R.string.moscow));
        list.add(new DataFlags(R.drawable.us, R.string.american, R.string.usaUSD, R.string.washington));
        list.add(new DataFlags(R.drawable.tr, R.string.turkish, R.string.turskishLRA, R.string.ankara));


        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }}


