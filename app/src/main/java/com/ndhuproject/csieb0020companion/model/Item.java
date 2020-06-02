package com.ndhuproject.csieb0020companion.model;

import java.io.Serializable;

/**
 * Created by kevin on 5/15/18.
 */

public class Item implements Serializable {

    private int image;
    private String name;


    public Item() {
        this.image = image;
        this.name = name;
    }

    public Item(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}