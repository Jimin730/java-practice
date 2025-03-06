package com.jstudy.mission2.worker;

public class Manager extends Employee{

    private String name; //이름
    private int salary; //급여
    private String position; //직책

    @Override
    public void printInfo() {
        System.out.println("오버라이딩 된 관리자 메소드");
    }
}
