package com.generics.learn.wildcards;

import java.util.ArrayList;
import java.util.List;

// Wild Card : ? Unknown type, field, local variable, param, return type

public class WildCardClass {

	public static void main(String[] args) {
//		List<T> list = new ArrayList<Integer>(); List<T> gives error
//		List<?> list = new ArrayList<Integer>(); List<?> no error, gives error later
		List<Integer> list = new ArrayList<Integer>();
		List<Number> list1 = new ArrayList<Number>();
		list.add(1);
		list.add(2);
		list1.add(11L);
		list1.add(11d);
		displayData(list);
		displayData(list1);
	}

	//? super Integer = lower bounded integer, anything int or super of int is fine
	public static void displayData(List<? super Integer> l) {
		for (Object t : l) {
			System.out.println(t);
		}
//		l.add(2d); error
		l.add(1); //allowed
	}
	
	public static void displayDataUnbounded(List<? extends Number> l) {
		for (Object t : l) {
			System.out.println(t);
		}
//		l.add(1); //cannot write to unbounded or upper bounded
//		The method add(int, capture#3-of ? extends Number) in the type List<capture#3-of ? extends Number> is not applicable for the arguments (int)
	}

	// Can't use direct question mark in place of object. Doesn't make sense.
	/*
	 * public static void displayData1(? l) { for (Object t : l) {
	 * System.out.println(t); } }
	 */

}

/*
 * Limitations
 * WildCardClass<?> not allowed
 * ? extends Number & Runnable -> multiple bounds not allowed
 * 
 */
