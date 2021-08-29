package com.pradeep.springboot.basics.springbootbasics;

public class MovieInfo {

	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public MovieInfo(String movieName, String yearOfRelease) {
		super();
		this.movieName = movieName;
		this.yearOfRelease = yearOfRelease;
	}
	public String getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	String movieName;
	String yearOfRelease;
}
