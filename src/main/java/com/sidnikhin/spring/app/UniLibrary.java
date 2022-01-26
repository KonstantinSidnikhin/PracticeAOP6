package com.sidnikhin.spring.app;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary {
    public void getBook(){
        System.out.println("a book is taken from UniLibrary");
    }
    public void getMagazine(){
        System.out.println("a Magazine is taken from UniLibrary");
    }
    public void returnMagazine(){
        System.out.println("a Magazine is returned to UniLibrary");
    }
    public void returnBook(){
        System.out.println("a Book is returned to UniLibrary");
    }
}
