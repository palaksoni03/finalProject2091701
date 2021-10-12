package com.example.finalproject_2091701.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject_2091701.databinding.ItemPlantBinding;
import com.example.finalproject_2091701.model.Plant;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PlantAdapter extends RecyclerView.Adapter<PlantAdapter.ViewHolder> {

    List<Plant> plantList= new ArrayList<>();
    OnClick clickInterface;

    public PlantAdapter(List<Plant> plantList, OnClick clickInterface){
        this.clickInterface=clickInterface;
        this.plantList.clear();
        this.plantList.addAll(plantList);
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPlantBinding binding = ItemPlantBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.tvPname.setText(plantList.get(position).getName());
        Picasso.get().load(plantList.get(position).getImage()).into(holder.binding.ivPlantImg);
    }

    @Override
    public int getItemCount() {
        return plantList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemPlantBinding binding;

        public ViewHolder(ItemPlantBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickInterface.onClickPlant(plantList.get(getAdapterPosition()));
                }
            });
        }
    }

    public interface OnClick{
        void onClickPlant(Plant plant);
    }
}