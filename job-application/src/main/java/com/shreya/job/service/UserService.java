package com.shreya.job.service;

import com.shreya.job.model.User;

import java.util.Scanner;

public class UserService {

    public void acceptUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter user id:");
        //int id = scanner.nextInt();
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("please enter user fName:");
        String fName = scanner.nextLine();
        System.out.println("please enter user lName:");
        String lName = scanner.nextLine();
        System.out.println("please enter user mobileNo:");
        String mobileNo = scanner.nextLine();
        System.out.println("please enter user mailId:");
        String mailId = scanner.nextLine();
        System.out.println("please enter user position:");
        String position = scanner.nextLine();
        System.out.println("please enter user Resume:");
        String resume = scanner.nextLine();

        User user = new User();
        user.id = id;
        user.fName = fName;
        user.lName = lName;
        user.mailId = mailId;
        user.mobileNo = mobileNo;
        user.position = position;
        user.resume = resume;

        System.out.println("User Details are : " + user);


    }
}
