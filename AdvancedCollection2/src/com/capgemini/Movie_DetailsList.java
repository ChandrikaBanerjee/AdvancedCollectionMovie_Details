package com.capgemini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Movie_DetailsList {
	List arrayList ;
//Comparator is used here
	Set<Movie_Details> treeset = new TreeSet<>((arg0, arg1) -> arg0.getMov_Name().compareTo(arg1.getMov_Name()));

	// Method to add a movie in the treeset
	public void add_movie(Movie_Details movie_Name) {
		treeset.add(movie_Name);

	}

	// Method to display all the movies
	public Set<Movie_Details> getAllMovies() {

		return treeset;
	}
	// Method to remove a movie

	public void remove_movie(Movie_Details movie_Name) {

		treeset.remove(movie_Name);
	}

//method to find a movie by its name
	public Movie_Details find_movie_By_mov_Name(String movie_Name) {

		for (Movie_Details mov : treeset) {
			if ((mov.getMov_Name()).equals(movie_Name))
				return mov;

		}
		return null;

	}

	// Method to find a movie by its genre
	public Movie_Details find_movie_By_Genre(String genre) {
		for (Movie_Details mov : treeset) {
			if ((mov.getGenre()).equals(genre))
				return mov;

		}
		return null;
	}

	public void remove_AllMovies(Set<Movie_Details> al) {
		// TODO Auto-generated method stub
		treeset.removeAll(treeset);
	}
	
	
}
