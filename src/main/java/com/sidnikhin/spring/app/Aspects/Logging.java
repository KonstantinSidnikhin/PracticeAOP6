package com.sidnikhin.spring.app.Aspects;

import com.sidnikhin.spring.app.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@Order(1)
public class Logging {
    @Before("com.sidnikhin.spring.app.Aspects.MyPointCuts.libraryGetMethods()")
    public void libraryGetLogging(){
        System.out.println("log: LibraryGet Method!");
    }
    @Before("com.sidnikhin.spring.app.Aspects.MyPointCuts.libraryGetMethods()")
            public void getSignature(JoinPoint joinPoint){
        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature.getReturnType());

        if(methodSignature.getName().equals("getBook")){
            Object[]arguments=joinPoint.getArgs();
            for(Object obj:arguments){
                if (obj instanceof Book){
                    Book myBook=(Book)obj;
                    System.out.println("Информация о книге: название -"+ myBook.getNameBook()+
                            " автор -"+myBook.getAuthor());
                }
                else if(obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет: "+obj);
                }
            }
        }

    }




}
