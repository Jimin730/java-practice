package com.jstudy.mission2.exception;

public class Calculator {

    private int num1;
    private int num2;
    private char operator;

    public Calculator(int num1, int num2, char operator){
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public int calSum(int a, int b){
        return a + b;
    }

    public int calDiff(int a, int b){
        return a - b;
    }

    public int calMul(int a, int b){
        return a * b;
    }

    public int calDiv(int a, int b){
        return a / b;
    }

}
