package com.jstudy.mission1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        //홀수/짝수 판별 프로그램 작성하기

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("짝수");
        }
        else{
            System.out.println("홀수");
        }

    }
}
