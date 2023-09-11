package dev.sanjai.movie;

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


//API controller..............
@RestController
@RequestMapping("/api/v1/movies")

public class MovieController {
    @Autowired()
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<movie>> getAllMovies(){
        return new ResponseEntity<List<movie>>(movieService.allmovies(),HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<movie>> getMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<movie>>(movieService.singleMovie(imdbId),HttpStatus.OK);

    }


}
