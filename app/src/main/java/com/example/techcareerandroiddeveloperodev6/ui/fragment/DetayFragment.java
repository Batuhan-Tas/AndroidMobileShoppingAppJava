package com.example.techcareerandroiddeveloperodev6.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.techcareerandroiddeveloperodev6.R;
import com.example.techcareerandroiddeveloperodev6.data.entity.Items;
import com.example.techcareerandroiddeveloperodev6.databinding.FragmentDetayBinding;


public class DetayFragment extends Fragment {

    private FragmentDetayBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentDetayBinding.inflate(inflater,container,false);

        DetayFragmentArgs bundle = DetayFragmentArgs.fromBundle(getArguments());
        Items item =bundle.getItem();

        binding.toolbarDetay.setTitle(item.getName());
        binding.ivItem.setImageResource(getResources().getIdentifier(item.getPhoto(),"drawable",requireContext().getPackageName()));




        return binding.getRoot();
    }
}