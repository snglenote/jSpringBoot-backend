package dev.snglenote.jSpringBootbackend;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends MongoRepository<Reviews, ObjectId> {

}
