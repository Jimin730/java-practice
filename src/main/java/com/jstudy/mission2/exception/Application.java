package com.jstudy.mission2.exception;

import java.util.Scanner;

public class Application {

    //사용자로부터 2개의 숫자와 연산자를 입력 받는 계산기 프로그램 작성
    //사용자 입력 값이 잘못되면 예외 터트리기

    public static void main(String[] args) {
        CheckInput ci = new CheckInput();
        Scanner sc = new Scanner(System.in);

        try{

            System.out.println("첫 번째 숫자를 입력해주세요: ");
            int num1 = sc.nextInt();
            ci.checkUserNumInput(num1);

            System.out.println("두 번째 숫자를 입력해주세요: ");
            int num2 = sc.nextInt();
            ci.checkUserNumInput(num2);

            System.out.println("+,-,*,/ 중 연산자를 입력해주세요: ");
            char oper = sc.next().charAt(0);
            ci.checkUserOperInput(oper);

            Calculator cc = new Calculator(num1, num2, oper);
            int result = 0;

            if(oper == '+') result = cc.calSum(num1, num2);
            else if(oper == '-') result = cc.calDiff(num1, num2);
            else if(oper == '*') result = cc.calMul(num1, num2);
            else result = cc.calDiv(num1, num2);

            System.out.println("결과 값: " + result);

            sc.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
