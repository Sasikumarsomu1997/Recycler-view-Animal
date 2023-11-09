package com.example.recyclerviewanimal.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewanimal.Model.AnimalModel;
import com.example.recyclerviewanimal.R;

import java.util.List;

public class MyCustomAdapter  extends RecyclerView.Adapter<MyCustomAdapter.AnimalViewHolder> {
    List<AnimalModel> animalModelList;

    public MyCustomAdapter(List<AnimalModel> animalModelList) {
        this.animalModelList = animalModelList;
    }

    @NonNull
    @Override
    public MyCustomAdapter.AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomAdapter.AnimalViewHolder holder, int position) {
        AnimalModel animalModel = animalModelList.get(position);

        holder.animalName.setText(animalModel.getAnimalName());
        holder.animalPrice.setText(animalModel.getPrice());
        holder.animalImage.setImageResource(animalModel.getAnimalImage());



    }

    @Override
    public int getItemCount() {
        return animalModelList.size();
    }
    public static class AnimalViewHolder extends RecyclerView.ViewHolder {
        TextView animalName , animalPrice;
        ImageView animalImage;
        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);

            animalName = itemView.findViewById(R.id.animalName);
            animalPrice = itemView.findViewById(R.id.animalPrice);
            animalImage = itemView.findViewById(R.id.animalImage);

        }
    }
}
