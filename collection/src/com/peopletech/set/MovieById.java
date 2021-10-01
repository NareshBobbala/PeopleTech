package com.peopletech.set;

import java.util.Comparator;

public class MovieById implements Comparator<Movie>{

	@Override
	public int compare(Movie i1, Movie i2) {
		
		return i1.getId()-i2.getId();
	}

	
}
