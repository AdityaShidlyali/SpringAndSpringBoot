package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        // for custom xml based configuring the container and beans
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // constructor injection of Doctor class
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();

        // constructor injection of Nurse class
        Nurse nurse = (Nurse) context.getBean("nurse");
        nurse.assist();

        // decoupled Doctor and Nurse class
        Staff staffDoctor = context.getBean(Doctor.class);
        staffDoctor.assist();
        Staff staffNurse = context.getBean(Nurse.class);
        staffNurse.assist();

        // setter injection
        System.out.println(doctor.getQualification());
        doctor.setQualification("MD"); // property can also be done

        // constructor injection
        System.out.println(doctor.yearOfExperience);
    }
}
