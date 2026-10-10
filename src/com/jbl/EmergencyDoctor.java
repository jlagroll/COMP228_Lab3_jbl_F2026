package com.jbl;

public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable {
    public EmergencyDoctor(String specialization, double consultationFee, String personId, String name, int age) {
       super(specialization, consultationFee, personId, name, age);
    }

    public void handleEmergency(Person patient) {
        System.out.printf("Dr. %s just handle emergency for %s", name, patient.name);
    }

    @Override
    public void prescribeMedication() {
        System.out.printf("Dr. %s prescribed medication for a patient", name);
    }

    @Override
    public void generateBill() {
        System.out.printf("The bill is $%.2f", consultationFee);
    }

    @Override
    public void performDuties() {
        System.out.printf("Dr. %s is an emergency doctor", name);
    }
}
