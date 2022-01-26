package com.sidnikhin.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
        Library library=context.getBean("libraryBean",Library.class);
        UniLibrary uniLibrary=context.getBean("uniLibrary",UniLibrary.class);
        Book book=context.getBean("bookBean",Book.class);
        library.getBook(book,"Tregulov");
        uniLibrary.getMagazine();
        System.out.println(book.getAuthor());
        context.close();
    }
}
