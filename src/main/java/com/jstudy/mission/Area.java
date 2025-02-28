package com.jstudy.mission;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        //사용자로부터 직사각형의 가로와 세로를 입력받아 넓이 출력하기

        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();

        System.out.println("직사각형의 넓이: " + (width*height));
    }
}
