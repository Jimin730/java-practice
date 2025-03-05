package com.jstudy.mission2.diagram;

public class Application {
    //도형 배열에 다양한 도형 객체 생성 후 저장
    //각 도형 객체의 면적 계산하여 출력

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10,20);

        for(int i=0; i<shapes.length; i++){
            System.out.print(shapes[i].getType() + "의 넓이: " + shapes[i].calArea());
            System.out.println();
        }
    }
}
