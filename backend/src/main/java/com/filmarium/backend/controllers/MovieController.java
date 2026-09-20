package com.filmarium.backend.controllers;

import com.filmarium.backend.entities.Movie;
import com.filmarium.backend.services.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController (MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping ("/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }


    @PostMapping("/")
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.addMovie(
                movie.getTitle(),
                movie.getDirector(),
                movie.getReleaseDate(),
                movie.getDescription()
        );
    }

    @PatchMapping("/{id}")
    public Movie updateMovie(@RequestParam Long id,@RequestBody Movie movie) {
       return movieService.updateMovie(movie, id);
    }



    @DeleteMapping("/{id}")
    public void deleteMovie(@RequestParam Long id) {
        movieService.deleteMovie(id);

    }



}
