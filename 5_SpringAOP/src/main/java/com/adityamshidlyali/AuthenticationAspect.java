package com.adityamshidlyali;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(com..*)")
    public void authenticatingPointCut() {

    }

    @Pointcut("within(com..*)")
    public void authorisationPointCut() {

    }

    @Before("authenticatingPointCut() || authorisationPointCut()")
    public void authenticate() {
        System.out.println("Authenticating the request");
    }
}
