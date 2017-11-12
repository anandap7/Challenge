package com.project.ndondot.challenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    KontenAdapter adapter;
    ArrayList<KontenModel> konten = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        adapter = new KontenAdapter(getApplicationContext(), konten);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        konten.add(new KontenModel(R.drawable.download, R.mipmap.pp, "33:07", "Video saya", "AYODEV"));
        konten.add(new KontenModel(R.drawable.download2, R.mipmap.pp2, "12:11", "Video Dua", "AYODEV Juga"));

        adapter.notifyDataSetChanged();
    }
}
