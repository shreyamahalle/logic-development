package com.shreya.job;

import com.shreya.job.model.Review;
import com.shreya.job.model.User;
import com.shreya.job.service.ReviewService;
import com.shreya.job.service.UserService;

public class App {
    public static void main(String[] args) {
        System.out.println("Job Application System!");

        UserService userService = new UserService();
        User user = userService.acceptUserData();

        ReviewService reviewService = new ReviewService();
        Review review = reviewService.reviewData();

        System.out.println("User info is: " + user);
        System.out.println("Review is: " + review);
    }
}
