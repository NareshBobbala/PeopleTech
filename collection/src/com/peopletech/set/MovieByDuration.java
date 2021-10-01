package com.peopletech.set;

import java.util.Comparator;

public class MovieByDuration  implements Comparator<Movie>{

	@Override
	public int compare(Movie d1, Movie d2) {
		
			return (int)(d1.getDuration()-d2.getDuration());
	}

	
	
}
