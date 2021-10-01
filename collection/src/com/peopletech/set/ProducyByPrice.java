package com.peopletech.set;

import java.util.Comparator;

public class ProducyByPrice implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		
		return (int)(p1.getPrice()-p2.getPrice());
	}
}
	
