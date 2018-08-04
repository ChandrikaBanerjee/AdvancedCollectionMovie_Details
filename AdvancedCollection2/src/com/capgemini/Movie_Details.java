package com.capgemini;

public class Movie_Details {
	private String mov_Name;
	private String lead_actor;
	private String lead_actress;
	private String genre;

	public Movie_Details(String mov_Name, String lead_actor, String lead_actress, String genre) {
		super();
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}

//toString displays the object
	@Override
	public String toString() {
		return "Movie_Details [mov_Name=" + mov_Name + ", lead_actor=" + lead_actor + ", lead_actress=" + lead_actress
				+ ", genre=" + genre + "]";
	}

//Getters
	public String getMov_Name() {
		return mov_Name;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	public String getLead_actress() {
		return lead_actress;
	}

	public String getGenre() {
		return genre;
	}
}
