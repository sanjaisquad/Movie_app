package dev.sanjai.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired()
    private MovieRepository movieRepository;

    public List<movie> allmovies(){
        return movieRepository.findAll();
    }

    public Optional<movie> singleMovie(String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }


}
