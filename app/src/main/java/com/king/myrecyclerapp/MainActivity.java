package com.king.myrecyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CustomAdapter.OnItemClickListener{
    CustomAdapter adapter;
    ArrayList<Item> users;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        users = new ArrayList<>();
        adapter = new CustomAdapter(this,users);
        recyclerView = findViewById(R.id.recycler);
        Item p1 = new Item("King","Wanyama",R.mipmap.chakula);
        Item p2 = new Item("Wanyama","Senior",R.mipmap.wanyama);
        Item p3 = new Item("Koi","Mnoma",R.mipmap.chakula);
        Item p4 = new Item("Jack","Mzae",R.mipmap.wanyama);
        Item p5 = new Item("Ando","Mlunje",R.mipmap.chakula);
        Item p6 = new Item("Fracia","Pineapple",R.mipmap.wanyama);
        Item p7 = new Item("Flovy","Kashoti",R.mipmap.chakula);
        Item p8 = new Item("Allan","Mrass",R.mipmap.wanyama);
        Item p9 = new Item("Faolo","Kiongozi",R.mipmap.chakula);

        users.add(p1);
        users.add(p2);
        users.add(p3);
        users.add(p4);
        users.add(p5);
        users.add(p6);
        users.add(p7);
        users.add(p8);
        users.add(p9);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.setOnItemClickListener(this);
        recyclerView.setAdapter(adapter);

    }
    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
        intent.putExtra("fname", users.get(position).getFname());
        intent.putExtra("sname", users.get(position).getSname());
        startActivity(intent);
    }


}
