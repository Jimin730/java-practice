package com.jstudy.mission;

public class ArrayAvg {
    public static void main(String[] args) {
        //배열의 평균을 계산하고 배열 요소를 변경하는 메서드 작성하기

        int[] array = {5, 9, 2, 1, 7};

        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        double avg = sum / array.length;

        System.out.println("배열의 평균 값: " + avg);


        System.out.println("변경 전 배열의 첫 번째 요소: " + array[0]);
        array[0] = 8;
        System.out.println("변경 후 배열의 첫 번째 요소: " + array[0]);





    }
}
