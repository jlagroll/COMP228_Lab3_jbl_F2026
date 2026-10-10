import com.jbl.Person;
import com.jbl.Doctor;
import com.jbl.Nurse;
import com.jbl.Surgeon;
import com.jbl.EmergencyDoctor;
import java.util.Scanner;

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Person jack = new Person("100000", "Jack Parsons", 45 );
    Person amy = new Person("100002", "Amy Perez", 34);
    Person tamie = new Person("100003", "Tammy Richards", 50);

    Doctor bill = new Doctor("Cardiology", 50000.00, "945123", "Bill Thompson", 55);
    Nurse malcolm = new Nurse(1001, "0800-1200", "672389", "Malcolm Price", 30);
    Surgeon mary = new Surgeon("Neurosurgery", 89, "Neurology", 400000.50, "449200", "Mary Magelene", 45);
    EmergencyDoctor sue = new EmergencyDoctor("Pediatrician", 45000.95, "100457", "Sue Storm", 35);

    System.out.println("Welcome to General Hospital!");

    // Single Inheritance
    System.out.println("--- Doctor Bill ---");

    System.out.println(bill.getPersonId());
    System.out.println(bill.getName());
    System.out.println(bill.getAge());

    bill.performDuties();
    System.out.println();
    bill.diagnosePatient(jack);

    System.out.println("\n");

    // Hierarchical Inheritance
    System.out.println("--- Nurse Malcolm ---");

    malcolm.performDuties();
    System.out.println();
    malcolm.assistPatient(amy);

    System.out.println("\n");

    // Multilevel Inheritance
    System.out.println("--- Surgeon Mary ---");

    mary.performSurgery();
    System.out.println();
    mary.performDuties();

    System.out.println("\n");

    // Multilevel + Interface
    System.out.println("--- Doctor Sue ---");

    sue.handleEmergency(tamie);
    System.out.println();
    sue.generateBill();
    System.out.println();
    sue.prescribeMedication();
    System.out.println();
    sue.performDuties();

    System.out.println("\n");

    // Polymorphism
    Person staff1 = bill;
    Person staff2 = malcolm;
    Person staff3 = mary;
    Person staff4 = sue;

    System.out.println("Introducing our staff:");
    staff1.performDuties();
    System.out.println();
    staff2.performDuties();
    System.out.println();
    staff3.performDuties();
    System.out.println();
    staff4.performDuties();

}