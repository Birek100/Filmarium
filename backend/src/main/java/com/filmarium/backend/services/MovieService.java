package com.filmarium.backend.services;

import com.filmarium.backend.entities.Movie;
import com.filmarium.backend.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() { return movieRepository.findAll();}

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found with id: " + id));
    }


    public Movie addMovie(String title, String director, LocalDate releaseDate, String description) {
        Movie movie = new Movie(title, director, releaseDate, description);
        return movieRepository.save(movie);
    }

    public Movie updateMovie (Movie movie, Long id) {
        Movie existingMovie = movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found with id: " + id));
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setDirector(movie.getDirector());
        existingMovie.setReleaseDate(movie.getReleaseDate());
        existingMovie.setDescription(movie.getDescription());
        return movieRepository.save(existingMovie);
    }

    public void deleteMovie (Long id) {
        Movie movie = movieRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Movie not found with id: " + id));
        movieRepository.delete(movie);
    }
}
