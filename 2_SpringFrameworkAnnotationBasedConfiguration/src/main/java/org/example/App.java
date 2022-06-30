package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext componentScanContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        ApplicationContext componentScantContext2 = new AnnotationConfigApplicationContext(BeanConfig2.class);

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();

        Nurse nurse = componentScanContext.getBean(Nurse.class);
        nurse.assist();

        MedicalStore medicalStore = componentScantContext2.getBean(MedicalStore.class);
        medicalStore.getMedicines();
    }
}
