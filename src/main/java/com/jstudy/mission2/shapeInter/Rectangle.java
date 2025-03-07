package com.jstudy.mission2.shapeInter;

public class Rectangle implements Shape {

    private String type;
    private int width;
    private int height;

    public Rectangle(String type, int width, int height) {
        this.type = type;
        this.width = width;
        this.height = height;
    }

    @Override
    public void calArea() {
        System.out.println(this.type + "의 면적: " + width*height);
    }
}
