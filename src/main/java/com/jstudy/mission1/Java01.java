package com.jstudy.mission1;

import java.util.Scanner;

public class Java01 {
    public static void main(String[] args) {
        //사용자로부터 두 숫자를 입력받고, 더 큰 숫자 출력하기

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int maxNum = Math.max(num1, num2);

        System.out.println("더 큰 숫자 : " + maxNum );
    }


}
