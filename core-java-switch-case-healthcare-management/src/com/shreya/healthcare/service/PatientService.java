package com.shreya.healthcare.service;
import com.shreya.healthcare.model.Patient;

import java.util.Scanner;

public class PatientService {
    private static final Scanner scanner = new Scanner(System.in);
    public static final Patient patient = new Patient();
    private final Patient[] patients = new Patient[5];

    public Patient createPatient() {
        System.out.println("Enter id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter fName");
        String fName = (scanner.nextLine());
        System.out.println("Enter lName");
        String lName = scanner.nextLine();
        System.out.println("Enter mobileNo");
        String mobileNo = (scanner.nextLine());
        System.out.println("Enter alternativeMobileNo");
        String alternativeMobileNo = (scanner.nextLine());
        System.out.println("Enter address");
        String address = (scanner.nextLine());
        System.out.println("Enter paymentDetails");
        String paymentDetails = (scanner.nextLine());
        System.out.println("Enter age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter gender");
        String gender = (scanner.nextLine());
        patient.setId(id);
        patient.setfName(fName);
        patient.setlName(lName);
        patient.setMobileNo(mobileNo);
        patient.setAlternativeMobileNo(alternativeMobileNo);
        patient.setAddress(address);
        patient.setPaymentDetails(paymentDetails);
        patient.setAge(age);
        patient.setGender(gender);
        return patient;
    }
    public void displayPatient(){
        for (Patient patient : patients){
            System.out.println("Patient Info " + patient);
        }
    }
}
