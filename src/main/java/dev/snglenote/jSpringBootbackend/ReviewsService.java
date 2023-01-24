package dev.snglenote.jSpringBootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewsService {
    @Autowired
    private ReviewsRepository reviewsRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    public Reviews createReviews(String reviewsBody, String imdbId){
        Reviews reviews = reviewsRepository.insert(new Reviews(reviewsBody));

        mongoTemplate.update(Movies.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewsIds").value(reviews))
                .first();

        return reviews;
    }
}
