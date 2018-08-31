package com.example.stagetwo.proyectomovilesv1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stagetwo.proyectomovilesv1.adapters.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<contact> lstContact;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment2, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new contact("Serenazgo","+511 634 0100",R.drawable.avatar));
        lstContact.add(new contact("Serenazgo San felipe","+511 261 3000",R.drawable.avatar));
        lstContact.add(new contact("Ambulancia Municipal","+511 634 0100",R.drawable.avatar));
        lstContact.add(new contact("Emergencia PNP","105",R.drawable.avatar));
        lstContact.add(new contact("Comisaría Jesús María","+511 332 4413",R.drawable.avatar));
    }
}
