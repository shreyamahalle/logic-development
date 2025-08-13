package com.shreya.healthcare.service;

import com.shreya.healthcare.model.Address;

import java.util.Scanner;

public class AddressService {

    private static final Scanner scanner = new Scanner(System.in);
    static final Address address = new Address();
    private final Address[] addresses = new Address[5];

    void printCustomer(Address address){
        System.out.println(address);
    }
    public Address createAddress() {
        Address address1 = new Address();
        System.out.println("Enter address");
        String address = scanner.nextLine();
        System.out.println("Enter pinCode");
        int pinCode = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter landMark");
        String landMark = scanner.nextLine();
        System.out.println("Enter buildingName");
        String buildingName = scanner.nextLine();
        System.out.println("Enter wing");
        String wing = scanner.nextLine();
        System.out.println("Enter buildingNo");
        int buildingNo = Integer.parseInt(scanner.nextLine());

        address1.setAddress(address);
        address1.setPinCode(pinCode);
        address1.setLandMark(landMark);
        address1.setWing(wing);
        address1.setBuildingNo(buildingNo);
        address1.setBuildingName(buildingName);
        return address1;
    }
    public void displayAddress(){
        for (Address address1 : addresses){
            System.out.println("Address info: " + address1);
        }
    }
}
