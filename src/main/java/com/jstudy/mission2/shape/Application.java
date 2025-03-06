package com.jstudy.mission2.shape;

public class Application {

    public static void main(String[] args) {


        //인터페이스로 도형 인스턴스 생성
        ShapeImpl circleInter = new Circle("원",43);
        ShapeImpl rectangleInter = new Rectangle("사각형", 20, 34);

        //추상 클래스로는 인스턴스 생성 불가
        Circle circle = new Circle("원", 23);
        Rectangle rectangle = new Rectangle("사각형", 10, 12);

        circleInter.interCalArea(); //인터페이스로 인스턴스를 생성한 객체는 인터페이스에서 오버라이딩한 메소드만 이용 가능
        rectangleInter.interCalArea();

        System.out.println("==================================");

        //각 도형의 클래스로 인스턴스 생성해서 추상클래스와 인터페이스 메소드를 오버라이딩한 메소드는 둘 다 사용 가능
        circle.interCalArea();
        circle.abstractCalArea();

        rectangle.interCalArea();
        rectangle.abstractCalArea();



    }
}
