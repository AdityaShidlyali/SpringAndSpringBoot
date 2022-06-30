package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Nurse {
    public void assist() {
        System.out.println("Nurse is assisting");
    }
}
