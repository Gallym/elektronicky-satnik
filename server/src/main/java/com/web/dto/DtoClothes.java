package com.web.dto;

import com.domain.model.Clothes;

import java.io.Serializable;
import java.util.ArrayList;

public class DtoClothes implements Clothes, Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    //private ClothesCategory category; // will be entity category
    private String category;
    private String color;
    private String size;
    //private Place place; // will be entity place
    private  String place;
    //private Tag tag; // will be entity Tag
    private ArrayList<String> tags;

    public DtoClothes() {
    }

    public DtoClothes(String name, String category, String color, String size, String place, ArrayList<String> tags) {
        this.name = name;
        this.category = category;
        this.color = color;
        this.size = size;
        this.place = place;
        this.tags = tags;
    }

    public DtoClothes(Clothes clothes) {
        this(clothes.getName(), clothes.getCategory(), clothes.getColor(), clothes.getSize(), clothes.getPlace(), clothes.getTags());
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
}
