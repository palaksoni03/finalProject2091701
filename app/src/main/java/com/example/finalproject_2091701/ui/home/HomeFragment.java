package com.example.finalproject_2091701.ui.home;

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
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject_2091701.R;
import com.example.finalproject_2091701.databinding.FragmentHomeBinding;
import com.example.finalproject_2091701.model.Plant;
import com.example.finalproject_2091701.model.PlantModal;

public class HomeFragment extends Fragment implements PlantAdapter.OnClick {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        root = binding.getRoot();


        observeLiveData();
        homeViewModel.getPlants();
        return root;
    }

    public void observeLiveData(){
        homeViewModel.plantLiveData.observe(getViewLifecycleOwner(), new Observer<PlantModal>() {
            @Override
            public void onChanged(PlantModal plantModal) {
                PlantAdapter adapter = new PlantAdapter(plantModal.getPlants(),HomeFragment.this);
                binding.rvPlants.setAdapter(adapter);

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClickPlant(Plant plant) {
        Navigation.findNavController(root).navigate(HomeFragmentDirections.nav(plant));
    }
}