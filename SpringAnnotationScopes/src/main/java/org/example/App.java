package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        // here both doctor objects will get the qualification as MBBS
        Doctor doctor1 = context.getBean(Doctor.class);
        doctor1.setQualification("MBBS");
        System.out.println(doctor1.getQualification());
        Doctor doctor2 = context.getBean(Doctor.class);
        System.out.println(doctor2.getQualification());

        // here both the nurses are of different objects of Nurse class
        Nurse nurse1 = context.getBean(Nurse.class);
        Nurse nurse2 = context.getBean(Nurse.class);
        if (nurse1.equals(nurse2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}