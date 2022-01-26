package com.sidnikhin.spring.app.Aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut ("execution(public void com.sidnikhin.spring.app.Library.get*(..))")
    public void libraryGetMethods(){}
}
