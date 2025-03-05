package com.jstudy.abstraction;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books; //도서관에 있는 책
    private ArrayList<Member> members; //도서관 회원

    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book){ //도서관에 책 추가
        books.add(book);
    }

    public void addMember(Member member){ //도서관에 회원 추가
        members.add(member);
    }

    public void rentBook(int memberId, String bookTitle){
        Member member = null;
        for(Member m : members){
            if(m.getMemberId() == memberId) { //회원이 존재하면
                member = m;
                break;
            }
        }

        if(member == null){ //회원이 존재하지 않으면
            System.out.println("회원이 존재하지 않습니다.");
            return;
        }

        for (Book book : books) {
            if(book.getTitle().equals(bookTitle)){ //책이 있는지 확인
                if(!book.isRented()) { //책이 대여 중이 아니라면
                    book.rentBook(); //책의 대여 상태 변경
                    member.addRentBook(book); //회원 대여 목록에 추가
                    return;
                } else { //이미 대여중이면
                    System.out.println(bookTitle + "은 현재 대여 중입니다.");
                    return;
                }
            }
        }
        System.out.println("책을 찾을 수 없습니다.");
    }

    public void returnBook(int memberId, String bookTitle){
        Member member = null;
        for (Member m : members) {
            if(m.getMemberId() == memberId) { //회원이 존재하면
                member = m;
                break;
            }
        }

        if(member == null){ //회원이 존재하지 않으면
            System.out.println("회원이 존재하지 않습니다.");
            return;
        }

        for (Book book : books) {
            if(book.getTitle().equals(bookTitle)){ //책이 존재하고
                if(book.isRented()){ //현재 대여중이면
                    book.returnBook();
                    member.returnBook(book); //회원의 대여 목록에서 책 제거
                    return;
                } else {
                    System.out.println(member.getName() + "님은 " + bookTitle + "을 대여하지 않으셨습니다.");
                    return;
                }
            }
        }

        System.out.println("책을 찾을 수 없습니다.");
    }

    public void printRentBooks(int memberId){
        Member member = null;
        for (Member m : members) {
            if(m.getMemberId() == memberId) { //회원이 존재하면
                member = m;
                break;
            }
        }

        if(member == null){ //회원이 존재하지 않으면
            System.out.println("회원이 존재하지 않습니다.");
            return;
        } else {
            ArrayList<Book> rentBooks = member.getRentBooks();
            System.out.println(member.getName() + "님이 대여 중인 책: ");

            for (Book rentBook : rentBooks) {
                System.out.println(rentBook.getTitle());
            }
        }
    }


}
