//first REST API controller uwu
package dev.snglenote.jSpringBootbackend;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/movies")
public class MoviesController {
    @Autowired
    private MoviesService moviesService;
    @GetMapping
    public ResponseEntity<List<Movies>> getAllMovies(){
        return new ResponseEntity<List<Movies>>(moviesService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    // lets the framework know that whatever is recieved through pathvariable is to be converted to an objectid called id
    public ResponseEntity<Optional<Movies>> getSingleMovies(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movies>>(moviesService.singleMovies(imdbId), HttpStatus.OK );
    }
}
