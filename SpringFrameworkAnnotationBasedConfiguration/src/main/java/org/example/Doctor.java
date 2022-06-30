package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Doctor {

    @Autowired
    private Nurse nurse;

    public void assist() {
        System.out.println("Doctor is assisting");
        System.out.print("With doctor ");
        nurse.assist();
    }
}
