package com.example.MovieTicket.MovieBooking.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.MovieTicket.MovieBooking.Exceptions.IdAlreadyExist;
import com.example.MovieTicket.MovieBooking.Exceptions.IdNotFound;
import com.example.MovieTicket.MovieBooking.Model.Movie;

@Service
public class MovieService implements MovieServiceInterface {
	
	private Map<String, Movie> movies = new HashMap<>();

    @Override
    public List<Movie> getAllMovies() {
        return new ArrayList<>(movies.values());
    }

    @Override
    public void addMovie(Movie movie) {
        if (movies.containsKey(movie.getId())) {
            throw new IdAlreadyExist("Movie with ID " + movie.getId() + " already exists");
        }
        movies.put(movie.getId(), movie);
    }

    @Override
    public Movie getMovieById(String id) {
        if (!movies.containsKey(id)) {
            throw new IdNotFound("Movie with ID " + id + " not found");
        }
        return movies.get(id);
    }

    @Override
    public void deleteMovie(String id) {
        if (!movies.containsKey(id)) {
            throw new IdNotFound("Movie with ID " + id + " not found");
        }
        movies.remove(id);
    }

    @Override
    public void updateMovie(String id, Movie movie) {
        if (!movies.containsKey(id)) {
            throw new IdNotFound("Movie with ID " + id + " not found");
        }
        movies.put(id, movie);
    }

	

}
