package dev.snglenote.jSpringBootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewsController {
    @Autowired
    private ReviewsService service;

    @PostMapping()
    public ResponseEntity<Reviews> createReview(@RequestBody Map<String, String> payload) {

        return new ResponseEntity<Reviews>(service.createReviews(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.OK);
    }
}