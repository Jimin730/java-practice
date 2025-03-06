package com.jstudy.mission2.shapeInter;

public class Application {

    public static void main(String[] args) {

        ShapeImpl shapeCir = new Circle("원",24);
        ShapeImpl shapeRec = new Rectangle("사각형", 20, 55);

        shapeCir.calArea();
        shapeRec.calArea();
    }
}
