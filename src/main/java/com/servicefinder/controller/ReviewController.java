package com.servicefinder.controller;

import com.servicefinder.model.Review;
import com.servicefinder.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public Review addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    @GetMapping
    public List<Review> getReviews(@RequestParam Long workerId) {
        return reviewService.getReviews(workerId);
    }
}