package com.jbl;

public class Surgeon extends Doctor {
    private String surgeryType;
    private int operatingRoom;

    public Surgeon(String surgeryType, int operatingRoom, String specialization, double consultationFee, String personId, String name, int age) {
        super(specialization, consultationFee, personId, name, age);

        this.surgeryType = surgeryType;
        this.operatingRoom = operatingRoom;
    }

    public void performSurgery() {
        System.out.printf("Dr. %s is performing %s on room number %d", name, surgeryType, operatingRoom);
    }

    @Override
    public void performDuties() {
        System.out.printf("Dr. %s is a surgeon", name);
    }
}
