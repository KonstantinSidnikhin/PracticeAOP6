package com.sidnikhin.spring.app;

import org.springframework.stereotype.Component;

@Component("libraryBean")

public class Library {
    public void getBook(Book book,String name){
        System.out.println("a book is taken from Library");
    }
    public void getMagazine(){
        System.out.println("a Magazine is taken from Library");
    }
    public void returnMagazine(){
        System.out.println("a Magazine is returned to Library");
    }
    public void returnBook(){
        System.out.println("a Book is returned to Library");
    }
}
