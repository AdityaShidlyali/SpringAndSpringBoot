package org.example;

public class Doctor implements Staff {
    private String qualification;

    public String yearOfExperience;

    public Doctor(String yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    private Nurse nurse;

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist() {
        System.out.println("Doctor is assisting");
    }
}
