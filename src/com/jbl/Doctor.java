package com.jbl;

public class Doctor extends Person {
    protected String specialization;
    protected double consultationFee;

    public Doctor(String specialization, double consultationFee, String personId, String name, int age) {
        super(personId, name, age);


        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public void diagnosePatient(Person patient) {
        System.out.printf("Dr. %s has diagnosed %s", name, patient.name);
    }

    @Override
    public void performDuties() {
        System.out.printf("Dr. %s is a doctor", name);
    }
}
