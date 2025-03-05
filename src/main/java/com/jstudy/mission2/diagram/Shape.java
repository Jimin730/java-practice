package com.jstudy.mission2.diagram;

abstract class Shape {
    //도형의 종류와 면적을 저장하는 멤버 변수
    //도형 객체 면적 계산하기

    private String shapeType;
    private int area;

    public Shape(String shapeType){
        this.shapeType = shapeType;
    }

    public String getType(){
        return shapeType;
    }

    public void setArea(int area){
        this.area = area;
    }

    abstract public double calArea(); //넓이 계산 추상 메소드


}
