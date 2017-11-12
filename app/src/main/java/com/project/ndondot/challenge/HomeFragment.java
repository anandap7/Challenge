package com.project.ndondot.challenge;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    KontenAdapter adapter;
    ArrayList<KontenModel> konten = new ArrayList<>();
    RecyclerView recyclerView;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler);
        adapter = new KontenAdapter(getActivity(), konten);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        konten.add(new KontenModel(R.drawable.download, R.mipmap.pp, "33:07", "Video saya", "AYODEV"));
        konten.add(new KontenModel(R.drawable.download2, R.mipmap.pp2, "12:11", "Video Dua", "AYODEV Juga"));

        adapter.notifyDataSetChanged();
        return v;
    }

}
