package com.jstudy.mission2.lamda;

import java.util.Scanner;

public class Application {

    //사용자로부터 두 개의 숫자와 연산자를 입력받는다
    //람다 표현식을 이용해 계산 기능을 구현한다.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력해주세요: ");
        int num1 = sc.nextInt();

        System.out.println("두 번째 숫자를 입력해주세요: ");
        int num2 = sc.nextInt();

        System.out.println("+,-,*,/ 중 원하는 연산자를 입력해주세요: ");
        char oper = sc.next().charAt(0);

        int result = 0;

        switch (oper){
            case '+': RamdaCalculator.Sum sum = (x, y) -> x + y;
                result = sum.calSum(num1, num2);
                break;

            case '-': RamdaCalculator.Diff diff = (x, y) -> x - y;
                result = diff.calDiff(num1, num2);
                break;

            case '*': RamdaCalculator.Mul mul = (x, y) -> x * y;
                result = mul.calMul(num1, num2);
                break;

            case '/': RamdaCalculator.Div div = (x, y) -> x / y;
                result = div.calDiv(num1, num2);
                break;
        }

        System.out.println("연산 결과 : " + result);

    }
}
