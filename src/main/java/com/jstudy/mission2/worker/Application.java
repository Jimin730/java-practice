package com.jstudy.mission2.worker;

public class Application {

    public static void main(String[] args) {
        Employee employee = new Employee(); //직원 클래스
        Manager manager = new Manager(); //관리자 클래스

        System.out.println("===직원 클래스 메소드 호출===");
        employee.printInfo();
        System.out.println("========================");

        System.out.println("===관리자 클래스 메소드 호출===");
        manager.printInfo();
        System.out.println("=========================");
    }
}
