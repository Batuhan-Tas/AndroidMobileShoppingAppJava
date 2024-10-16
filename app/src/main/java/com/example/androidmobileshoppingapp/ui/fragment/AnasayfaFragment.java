package com.example.androidmobileshoppingapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.androidmobileshoppingapp.data.entity.Items;
import com.example.androidmobileshoppingapp.databinding.FragmentAnasayfaBinding;
import com.example.androidmobileshoppingapp.ui.adapter.ItemsAdapter;


import java.util.ArrayList;


public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnasayfaBinding.inflate(inflater,container,false);

        binding.itemsRv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL));

        ArrayList<Items> itemsList= new ArrayList<>();
        Items i1 = new Items(1,"Tires","tire",2400);
        Items i2 = new Items(2,"Trading Cards","tradingcards2",100);
        Items i3 = new Items(3,"Pre-Loved Luxury","handbags2",300);
        Items i4 = new Items(4,"Sneakers","sneakers",1000);
        Items i5 = new Items(5,"Watch","watch",5000);
        Items i6 = new Items(6,"Handbags","handbags",1500);


        itemsList.add(i1);
        itemsList.add(i2);
        itemsList.add(i3);
        itemsList.add(i4);
        itemsList.add(i5);
        itemsList.add(i6);

        binding.linearRv.setLayoutManager(new LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false));

        Items i7 = new Items(7,"2021 Apple iPad","ipad",20000);
        Items i8 = new Items(8,"Yu-Gi-Oh Collection","yugioh",50);
        Items i9 = new Items(9,"Guitars","guitar",3000);

        ArrayList<Items> linearItemsList = new ArrayList<>();
        linearItemsList.add(i7);
        linearItemsList.add(i8);
        linearItemsList.add(i9);

        ItemsAdapter itemsAdapter = new ItemsAdapter(itemsList,requireContext());
        binding.itemsRv.setAdapter(itemsAdapter);

        ItemsAdapter itemsAdapter2 = new ItemsAdapter(linearItemsList,requireContext());
        binding.linearRv.setAdapter(itemsAdapter2);

        return binding.getRoot();
    }
}