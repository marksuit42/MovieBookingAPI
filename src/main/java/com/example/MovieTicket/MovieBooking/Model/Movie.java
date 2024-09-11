package com.example.MovieTicket.MovieBooking.Model;

import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Movie {
	
	@NotNull(message = "Id cannot be null")
    @Size(min = 1, message = "Id should have a minimum value of 1")
     String id;

    @NotBlank(message = "Movie name cannot be blank")
    @Size(min = 3, max = 20, message = "Movie name should be between 3 and 20 characters")
    String movieName;

    @NotBlank(message = "Movie director cannot be blank")
    String movieDirector;
    
    

    @Min(1)
    @Max(10)
     long movieRating;

     String movieLanguage;
    
     List<String> writers;
    
     List<String> actors;
    
     List<String> genre;
     
     public Movie() {
    	 
     }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public long getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(long movieRating) {
		this.movieRating = movieRating;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public List<String> getWriters() {
		return writers;
	}

	public void setWriters(List<String> writers) {
		this.writers = writers;
	}

	public List<String> getActors() {
		return actors;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	public List<String> getGenre() {
		return genre;
	}

	public void setGenre(List<String> genre) {
		this.genre = genre;
	}

	public Movie(String id, String movieName, String movieDirector, long movieRating,
			String movieLanguage, List<String> writers, List<String> actors, List<String> genre) {
		this.id = id;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieRating = movieRating;
		this.movieLanguage = movieLanguage;
		this.writers = writers;
		this.actors = actors;
		this.genre = genre;
	}
    
}