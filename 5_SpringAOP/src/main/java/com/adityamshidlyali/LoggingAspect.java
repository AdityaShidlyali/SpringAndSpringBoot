package com.adityamshidlyali;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // first star here is for any return type
    @Before("execution(* com.adityamshidlyali.ShoppingCart.checkout(*))")
    public void beforeLogger(JoinPoint jp) {

        // get the signature of the method for which the method is called the logger
        System.out.println(jp.getSignature());

        // get the value of the arguments passed to that method which is logged
        System.out.println("The argument passed was: " + jp.getArgs()[0]);

        System.out.println("Loggers called before Checkout");
    }

    // here start means any return type, any package, any classes the checkout() method
    // two dots means any number of parameters
    @After("execution(* *.*.*.checkout(..))")
    public void afterLogger() {
        System.out.println("Loggers called after Checkout");
    }

    @Pointcut("execution(* *.*.*.quantity(..))")
    public void afterReturningPointCut() {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retValue")
    public void afterReturning(String retValue) {
        System.out.println("Loggers called after returning " + retValue);
    }
}
