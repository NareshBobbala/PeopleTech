package com.peopletech.set;
import java.util.Comparator;

public class MovieByPrice implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		
		return (int)(o1.getPrice()-o2.getPrice());
	}

}
