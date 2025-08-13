package com.shreya.healthcare.service;

import com.shreya.healthcare.model.Prescription;

import java.util.Scanner;

public class PrescriptionService {

    private static final Scanner scanner = new Scanner(System.in);

    public Prescription createPrescription() {
        System.out.println("Enter prescriptionId");
        int prescriptionId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter prescriptionDetails");
        String prescriptionDetails = scanner.nextLine();
        System.out.println("Enter mobileNo");
        String mobileNo = scanner.nextLine();
        Prescription prescription = new Prescription();
        prescription.setPrescriptionId(prescriptionId);
        prescription.setPrescriptionDetails(prescriptionDetails);
        prescription.setMobileNo(mobileNo);
        return prescription;
    }
}
