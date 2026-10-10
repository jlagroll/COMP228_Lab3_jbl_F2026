package com.jbl;

public class Person {
    protected String personId;
    protected String name;
    protected int age;

    public Person(String personid, String name, int age) {
        if (personid.length() != 6) {
            throw new IllegalArgumentException("Person ID must be 6 characters long");
        }

        if (age <= 0) {
            throw new IllegalArgumentException("Age must be a positive number");
        }



       this.personId = personid;
       this.name = name;
       this.age = age;
    }

    public String getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void performDuties() {
        System.out.println("This person doesn't perform any medical duties");
    }
}
