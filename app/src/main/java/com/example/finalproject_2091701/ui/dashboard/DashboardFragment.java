package com.example.finalproject_2091701.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.finalproject_2091701.R;
import com.example.finalproject_2091701.databinding.FragmentDashboardBinding;
import com.example.finalproject_2091701.model.Plant;
import com.squareup.picasso.Picasso;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Plant plant = DashboardFragmentArgs.fromBundle(getArguments()).getPlantDetail();
        Picasso.get().load(plant.getImage()).into(binding.pkdImgv);
        binding.pkdTxtpname.setText(plant.getName());

        binding.habitTxt.setText("Habit: "+plant.getHabit());
        binding.lifespanTxt.setText("Lifespan: "+plant.getLifespan());
        binding.exposureTxt.setText("Exposure: "+plant.getExposure());
        binding.waterTxt.setText("Water: "+plant.getWater());
        binding.featureTxt.setText("Feature: "+plant.getFeatures());
        binding.specieTxt.setText("Species: "+(CharSequence) plant.getSpecies());


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}