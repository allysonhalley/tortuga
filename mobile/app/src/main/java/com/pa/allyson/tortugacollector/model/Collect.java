package com.pa.allyson.tortugacollector.model;

import android.media.Image;

import java.util.Date;

public class Collect {
    private Date date;
    private Material material;
    private Image image;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
