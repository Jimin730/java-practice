package com.jstudy.abstraction;

public class Book {

    private String title;
    private String author;
    private boolean isRented; //대여 현황. 기본 값 false

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentBook(){ //책 대여 시 상태 변경
        if(!isRented){
            isRented = true;
            System.out.println(title + "가 대여되었습니다.");
        }else {
            System.out.println(title + "는 현재 대여중입니다.");
        }
    }

    public void returnBook(){ //책 반납 시 상태 변경
        isRented = false;
        System.out.println(title + "가 반납되었습니다.");
    }
}
