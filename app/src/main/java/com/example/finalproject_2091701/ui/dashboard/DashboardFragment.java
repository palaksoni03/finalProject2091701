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

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private DashboardFragmentArgs binding;
    private LayoutInflater FragmentDashboardBinding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        @NonNull Plant root = binding.getPlantDetail();

        Plant plant = DashboardFragmentArgs.fromBundle(getArguments()).getPlantDetail();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}