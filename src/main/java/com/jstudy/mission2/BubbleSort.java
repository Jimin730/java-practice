package com.jstudy.mission2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BubbleSort {

    //사용자로부터 정수 배열 입력 받기
    //버블 정렬 수행
    //정렬 전과 후 배열 출력

    public static void main(String[] args) throws Exception{
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] numArray = new int[6]; //정수를 저장할 배열

            //사용자로부터 6개의 정수를 입력 받아온다.
            System.out.print("6개의 정수를 띄어쓰기로 구분하여 입력: ");
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0; i<6; i++){ //정수 배열에 저장
                numArray[i] = Integer.parseInt(st.nextToken());
            }

            System.out.print("정렬 전 배열: ");
            for (int num : numArray) {
                System.out.print(num + " ");
            }
            System.out.println();

            boolean isSorted = false;
            while(!isSorted){
                isSorted = true;
                for(int i=0; i<numArray.length-1; i++){
                    if(numArray[i] > numArray[i+1]){
                        int tmp = numArray[i];
                        numArray[i] = numArray[i+1];
                        numArray[i+1] = tmp;
                        isSorted = false;
                    }
                }
            }

            System.out.print("정렬 후 배열: ");
            for (int num : numArray) {
                System.out.print(num + " ");
            }
        } catch (Exception e){
            System.out.println("오류: " + e.getMessage());
        }

    }
}
