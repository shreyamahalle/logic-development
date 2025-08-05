package com.shreya.job.service;

import com.shreya.job.model.Review;
import java.util.Scanner;

public class ReviewService {

    public void reviewData() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter review");

        System.out.println("please enter user id:");
        //int id = scanner.nextInt();
        int id = Integer.parseInt(scanner.nextLine());
        //scanner.nextLine();
        System.out.println("please enter Heading:");
        String heading = scanner.nextLine();
        System.out.println("please enter Star:");
        int star = scanner.nextInt();

        Review review = new Review();
        review.id = id;
        review.heading = heading;
        review.star = star;
        System.out.println("Review is " + review);
    }
}
