package com.example.MovieTicket.MovieBooking.service;

import java.util.List;

import com.example.MovieTicket.MovieBooking.Model.Movie;

public interface MovieServiceInterface {
	
	List<Movie> getAllMovies();

    void addMovie(Movie movie);

    Movie getMovieById(String id);

    void deleteMovie(String id);

    void updateMovie(String id, Movie movie);

}
