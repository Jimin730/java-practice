package com.jstudy.mission1;

import java.util.Arrays;

public class FiveNumSort {
    public static void main(String[] args) {
        //5개의 정수 오름차순 정렬하기

        int[] array = {5, 9, 2, 1, 7};

        Arrays.sort(array);

        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
