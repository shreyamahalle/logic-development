package com.shreya.healthcare.service;

import com.shreya.healthcare.model.Nurse;

import java.util.Scanner;

public class NurseService {

    private static final Scanner scanner = new Scanner(System.in);

    public Nurse createNurse() {

        System.out.println("Enter Nurse Id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Nurse name");
        String name = scanner.nextLine();
        System.out.println("Enter Nurse lName");
        String lName = scanner.nextLine();
        Nurse nurse = new Nurse();
        nurse.setId(id);
        nurse.setlName(lName);
        nurse.setName(name);
        return nurse;
    }

}
