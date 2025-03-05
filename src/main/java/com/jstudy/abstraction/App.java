package com.jstudy.abstraction;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Library lb = new Library();
        Scanner sc = new Scanner(System.in);

        //-- 초기 데이터 여기서 추가 --//
        //회원 추가
        Member member1 = new Member(1, "홍길동");
        lb.addMember(member1);

        //책 추가
        Book book1 = new Book("자바 정복기", "000");
        Book book2 = new Book("스프링 정복기", "ㅁㅁㅁ");
        lb.addBook(book1);
        lb.addBook(book2);


        //--프로그램 실행 부---//
        while (true){
            System.out.println("=====옵션을 선택하세요.=====");
            System.out.println("1. 책 대여");
            System.out.println("2. 책 반납");
            System.out.println("3. 대여 중인 책 확인");
            System.out.println("9. 종료");
            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.print("회원 id 입력: ");
                    int memberId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("대여할 책 제목 입력: ");
                    String bookTitle = sc.nextLine();
                    lb.rentBook(memberId, bookTitle); //책 대여
                    break;

                case 2:
                    System.out.print("회원 id 입력: ");
                    memberId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("반납할 책 제목 입력: ");
                    bookTitle = sc.nextLine();
                    lb.returnBook(memberId, bookTitle); //책 반납
                    break;

                case 3:
                    System.out.print("회원 id 입력: ");
                    memberId = sc.nextInt();
                    lb.printRentBooks(memberId); //대여 내역 출력
                    break;

                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    break;

                default:
                    System.out.println("올바른 숫자를 입력해주세요.");
            }
        }


    }
}
