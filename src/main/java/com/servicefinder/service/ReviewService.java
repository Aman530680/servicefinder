package com.servicefinder.service;

import com.servicefinder.model.Review;
import com.servicefinder.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> getReviews(Long workerId) {
        return reviewRepository.findByWorkerId(workerId);
    }
}