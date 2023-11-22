package com.example.techcareerandroiddeveloperodev6.data.entity;

import java.io.Serializable;

public class Items implements Serializable {

    private int id;
    private String name;
    private String photo;
    private int price;

    public Items() {
    }

    public Items(int id, String name, String photo, int price) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
