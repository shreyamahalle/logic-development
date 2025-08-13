package com.shreya.healthcare.service;

import com.shreya.healthcare.model.Billing;

import java.util.Scanner;

public class BillingService {

    private static final Scanner scanner = new Scanner(System.in);

    public Billing createBilling() {
        System.out.println("Enter Billing Id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter pId");
        int pId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter totalTax");
        int totalTax = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter totalBill");
        int totalBill = Integer.parseInt(scanner.nextLine());

        Billing billing = new Billing();
        billing.setId(id);
        billing.setpId(pId);
        billing.setTotalBill(totalBill);
        billing.setTotalTax(totalTax);
        return billing;
    }
}
