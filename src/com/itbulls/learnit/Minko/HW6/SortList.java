package com.itbulls.learnit.Minko.HW6;

import java.util.Comparator;

public class SortList implements Comparator<Candy>{
	public int compare(Candy a, Candy b) {
		return a.getWeight() - b.getWeight();
	}

}
