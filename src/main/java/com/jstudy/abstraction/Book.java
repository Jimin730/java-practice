package com.jstudy.abstraction;

public class Book {

    private String title;
    private String author;
    private boolean isRent; //대여 현황. 기본 값 false

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isRent() {
        return isRent;
    }

    public void rentBook(){ //책 대여 시 상태 변경
        if(!isRent){
            isRent = true;
            System.out.println(title + "가 대여되었습니다.");
        }else {
            System.out.println(title + "는 현재 대여중입니다.");
        }
    }

    public void returnBook(){ //책 반납 시 상태 변경
        isRent = false;
        System.out.println(title + "가 반납되었습니다.");
    }
}
