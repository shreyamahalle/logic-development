package com.shreya.job;

import com.shreya.job.service.ReviewService;
import com.shreya.job.service.UserService;

public class App {
    public static void main(String[] args) {
        System.out.println("Job Application System!");

        UserService userService = new UserService();
        userService.acceptUserData();

        ReviewService reviewService = new ReviewService();
        reviewService.reviewData();
    }
}
