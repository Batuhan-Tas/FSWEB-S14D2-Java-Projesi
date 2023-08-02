package com.workintech.project.model;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor){
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public void create(){
        System.out.println(height);
        System.out.println(paintedColor);
    }
}
