package com.jbl;

public class Nurse extends Person {
    private int department;
    private String shift;

    public Nurse(int department, String shift, String personId, String name, int age){
        super(personId, name, age);

        this.department = department;
        this.shift = shift;
    }

    public void assistPatient(Person patient) {
       System.out.printf("Nurse %s is assisting %s", name, patient.name);
    }

    @Override
    public void performDuties() {
        System.out.printf("%s is a nurse", name);
    }
}
