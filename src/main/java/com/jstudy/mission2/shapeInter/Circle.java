package com.jstudy.mission2.shapeInter;

public class Circle implements Shape {

    private String type;
    private int radius;

    public Circle(String type, int radius) {
        this.type = type;
        this.radius = radius;
    }

    @Override
    public void calArea() {
        System.out.println(this.type + "의 면적: " + radius*2*Math.PI);
    }
}
