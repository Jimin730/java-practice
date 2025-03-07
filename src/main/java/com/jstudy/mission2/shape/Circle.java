package com.jstudy.mission2.shape;

public class Circle extends ShapeAbstract implements Shape {

    private String type;
    private int radius;

    public Circle(String type, int radius) {
        this.type = type;
        this.radius = radius;
    }

    @Override
    public void abstractCalArea() {
        System.out.println(this.type + "의 abstractCalArea: " + radius*2*Math.PI);
    }

    @Override
    public void interCalArea() {
        System.out.println(this.type + "의 interCalArea: " + radius*2*Math.PI);
    }
}
