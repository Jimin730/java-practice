package com.jstudy.mission;

import java.util.Scanner;

public class Java02 {
    public static void main(String[] args) {
        //사용자로부터 두 숫자를 입력받아 합계 출력하는 Java 프로그램 작성하기

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("합계 : " + sum);
    }
}
