package com.jstudy.mission2.diagram;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int width, int height){
        super("사각형");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calArea() { //사각형 넓이 계산
        return width * height;
    }
}
