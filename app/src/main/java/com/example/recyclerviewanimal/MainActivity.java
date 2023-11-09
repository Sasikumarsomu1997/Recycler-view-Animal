package com.example.recyclerviewanimal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewanimal.Adapter.MyCustomAdapter;
import com.example.recyclerviewanimal.Model.AnimalModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<AnimalModel>animalModelList;
    RecyclerView recyclerView;
    MyCustomAdapter myCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        animalModelList = new ArrayList<>();

        AnimalModel a1 = new AnimalModel("Animal 1",R.drawable.Animal,30000);
        AnimalModel a2 = new AnimalModel("Animal 2",R.drawable.Animal1,20000);
        AnimalModel a3 = new AnimalModel("Animal 3",R.drawable.Animal2,10000);
        AnimalModel a4 = new AnimalModel("Animal 4",R.drawable.Animal3,50000);
        AnimalModel a5 = new AnimalModel("Animal 5",R.drawable.Animal4,40000);

        animalModelList.add(a1);
        animalModelList.add(a2);
        animalModelList.add(a3);
        animalModelList.add(a4);
        animalModelList.add(a5);


        myCustomAdapter = new MyCustomAdapter(animalModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myCustomAdapter);



    }
}