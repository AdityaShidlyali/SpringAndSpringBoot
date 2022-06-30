package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "singleton")// default scope
public class Doctor implements BeanNameAware {

    @Autowired
    private Nurse nurse;

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    public void assist() {
        System.out.println("Doctor is assisting");
        System.out.print("With doctor ");
        nurse.assist();
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean name method is called");
    }

    // Annotation present in javax.annotation api
    // this method will be called immediately after the constructor of this class is called
    @PostConstruct
    public void postConstruct() {
        System.out.println("Post construct method is called");
    }

    // method will be called when the object of this class is destroyed
    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre destroy was called");
    }
}
