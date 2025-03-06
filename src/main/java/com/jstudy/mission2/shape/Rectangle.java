package com.jstudy.mission2.shape;

public class Rectangle extends ShapeAbstract implements ShapeImpl{

    private String type;
    private int width;
    private int height;

    public Rectangle(String type, int width, int height) {
        this.type = type;
        this.width = width;
        this.height = height;
    }


    @Override
    public void abstractCalArea() {
        System.out.println(this.type + "의 abstractCalArea: " + width*height);
    }

    @Override
    public void interCalArea() {
        System.out.println(this.type + "의 interCalArea: " + width*height);
    }
}
