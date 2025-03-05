package com.jstudy.mission2;

import java.util.Scanner;

public class ReverseString {
    // 사용자로부터 문자열 입력받기
    // 입력받은 문자열 뒤집기
    // 입력받은 문자열 대소문자 변환하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("문자열을 입력해주세요: ");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            sb.append(str.charAt(i));
        }

        str = sb.reverse().toString();
        System.out.println("뒤집은 문자열 : " + str);

        sb.setLength(0); //StringBuilder 초기화
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(Character.isUpperCase(c)){ //대문자라면
                sb.append(Character.toLowerCase(c)); //소문자로 변환
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        str = sb.toString();
        System.out.println("대소문자 변환한 문자열: " + str);

    }

}
