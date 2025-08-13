package com.shreya.healthcare.service;

import com.shreya.healthcare.model.Hospital;

import java.util.Scanner;

public class HospitalService {

    private static final Scanner scanner = new Scanner(System.in);

    public Hospital createHospital() {
        System.out.println("Enter Hospital Id");
        int hospitalId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter hospitalName");
        String hospitalName = scanner.nextLine();
        System.out.println("Enter hospitalAddress");
        String hospitalAddress = scanner.nextLine();
        System.out.println("Enter emailId");
        String emailId = scanner.nextLine();
        System.out.println("Enter contactNo");
        String contactNo = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setContactNo(contactNo);
        hospital.setHospitalAddress(hospitalAddress);
        hospital.setEmailId(emailId);
        return hospital;

    }
}
