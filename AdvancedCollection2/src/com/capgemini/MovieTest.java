package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MovieTest {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		Movie_Details mv1 = new Movie_Details("DDLJ", "Shahrukh", "Kajol", "Romantic");
		Movie_Details mv2 = new Movie_Details("K3G", "Shahrukh", "Kajol", "Movie");
		Movie_Details mv3 = new Movie_Details("ABCD", "Varun", "Shraddhya", "Passion");

		Movie_DetailsList md = new Movie_DetailsList();

		Set tl;

		// Dipalying all the movies
		md.add_movie(mv1);
		md.add_movie(mv2);
		md.add_movie(mv3);
		tl = md.getAllMovies();
		tl.stream().forEach((Movie_Details) -> System.out.println(Movie_Details));

		// Removing a movie
		md.remove_movie(mv3);
		tl.stream().forEach((Movie_Details) -> System.out.println(Movie_Details));

		for (Object o : tl) { // Printing the movie list
			System.out.println(o + "\n");
		}
//Removing all movies
		md.remove_AllMovies(tl);
		tl = md.getAllMovies();
		System.out.println("All Movies Removed");
		for (Object o : tl) { // Printing the movie list
			System.out.println(o + "\n");

		}
//finds a movie by its name and genre
		Movie_Details alm;
		alm = md.find_movie_By_mov_Name("K3G");
		System.out.println("Movie:" + alm);
		alm = md.find_movie_By_Genre("Romantic");

		System.out.println(alm);

	}

}
