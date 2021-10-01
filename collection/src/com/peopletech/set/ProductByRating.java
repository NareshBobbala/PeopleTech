package com.peopletech.set;

import java.util.Comparator;

public class ProductByRating implements Comparator<Product>{

	@Override
	public int compare(Product r1, Product r2) {

		return r1.getRating()-r2.getRating() ;
	}

}
