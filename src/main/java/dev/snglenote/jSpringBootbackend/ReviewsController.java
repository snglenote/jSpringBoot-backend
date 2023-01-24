package dev.snglenote.jSpringBootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewsController {
    @Autowired
    private ReviewsService reviewsService;

    public ResponseEntity<Reviews> createReviews(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Reviews>(reviewsService.createReviews(payload.get("reviewsBody"), payload.get("imdbId")), HttpStatus.CREATED);

    }
}