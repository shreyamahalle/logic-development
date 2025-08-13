package com.shreya.healthcare.service;

import com.shreya.healthcare.model.Doctor;

import java.util.Scanner;

public class DoctorService {
    private static final Scanner scanner = new Scanner(System.in);

    public Doctor createDoctor() {
        System.out.println("Enter Doctor Id");
        int doctorId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Doctor Name");
        String docName = scanner.nextLine();
        System.out.println("Enter Doctor lName");
        String docLName = scanner.nextLine();
        System.out.println("Enter Doctor Mobile Number");
        String docMobileNo = (scanner.nextLine());
        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorId);
        doctor.setDocName(docName);
        doctor.setDocLName(docLName);
        doctor.setDocMobileNo(docMobileNo);
        return doctor;
    }

}
