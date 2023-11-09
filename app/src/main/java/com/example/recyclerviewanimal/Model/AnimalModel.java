package com.example.recyclerviewanimal.Model;

public class AnimalModel {
    String AnimalName;
    int AnimalImage, Price;

    public AnimalModel(String animalName, int animalImage, int price) {
        AnimalName = animalName;
        AnimalImage = animalImage;
        Price = price;
    }

    public String getAnimalName() {
        return AnimalName;
    }

    public void setAnimalName(String animalName) {
        AnimalName = animalName;
    }

    public int getAnimalImage() {
        return AnimalImage;
    }

    public void setAnimalImage(int animalImage) {
        AnimalImage = animalImage;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
