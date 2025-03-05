package com.jstudy.mission2.rectangle;

public class Rectangle {

    //직사각형 길이와 너비 저장하는 멤버 변수 선언
    //직사각형의 넓이와 둘레 계산 메서드 구현

    private int width;
    private int height;

    public Rectangle(int width, int height){ //생성자
        this.width = width;
        this.height = height;
    }

    public int calArea(){ //넓이 계산
        return width * height;
    }

    public int calRound(){ //둘레 계산
        return width*2 + height*2;
    }
}
