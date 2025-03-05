package com.jstudy.mission2.diagram;

public class Circle extends Shape{//원

    int radius; //반지름

    public Circle(int radius){
        super("원");
        this.radius = radius;
    }

    @Override
    public double calArea() { //원 넓이 계산
        return radius * radius * Math.PI;
    }
}
