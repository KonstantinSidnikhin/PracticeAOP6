package com.sidnikhin.spring.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("Dostoevsky")
    private String author;
    @Value("Prestuplenie i Nakazanie")
    private String nameBook;

    public String getAuthor() {
        return author;
    }


    public String getNameBook() {
        return nameBook;
    }



}
