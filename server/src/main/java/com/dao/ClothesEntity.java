package com.dao;

import com.domain.model.Clothes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "clothes")
public class ClothesEntity implements Clothes, Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    //@Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    //private ClothesCategory category;
    private String category;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "size", nullable = false)
    private String size;

    @Column(name = "place", nullable = false)
    //private Place place;
    private  String place;

    @Column(name = "tag", nullable = false)
    //private Tag tag;
    private ArrayList<String> tags;

    public ClothesEntity(String name, String category, String color, String size, String place, ArrayList<String> tags) {
        this.name = name;
        this.category = category;
        this.color = color;
        this.size = size;
        this.place = place;
        this.tags = tags;
    }

    public ClothesEntity() {
        super();
    }

    public ClothesEntity(final Clothes clothes) {
        this(clothes.getName(), clothes.getCategory(), clothes.getColor(), clothes.getSize(), clothes.getPlace(), clothes.getTags());
    }

    public Long getId() {
        return id;
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
