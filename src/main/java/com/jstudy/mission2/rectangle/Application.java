package com.jstudy.mission2.rectangle;

public class Application {
    //직사각형 객체 생성
    //직사각형 넓이와 둘레 계산하여 출력

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10, 20);

        int area = rec.calArea();
        int round = rec.calRound();

        System.out.println("직사각형의 넓이: " + area);
        System.out.println("직사각형의 둘레: " + round);
    }
}
