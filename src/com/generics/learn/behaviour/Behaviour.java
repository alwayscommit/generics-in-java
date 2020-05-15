package com.generics.learn.behaviour;

import java.util.ArrayList;

//Behaviour of object
public class Behaviour {

	public static void main(String[] args) {

		// parameterized generic
		ArrayList<String> l = new ArrayList<>();
		l.add("Aakash");
		l.add("Ranglani");
		nonGenericMethod(l);
		System.out.println(l);
		
		ArrayList l2 = new ArrayList();
		l2.add("Aakash");
		l2.add(true);
		l2.add(1);
		genericMethod(l2);
		System.out.println(l2);
	}

	// Non-generic method, passing the same list...
	public static void nonGenericMethod(ArrayList l) {
		// Behaviour of an object depends on the location of that object, this is within
		// non-generic method
		l.add(10);
		l.add("aa");
		l.add(true); 
	}
	
	//reverse
	public static void genericMethod(ArrayList<String> l) {
		// Behaviour of an object depends on the location of that object, this is within
		// non-generic method
//		l.add(10); not allowed
		l.add("aakash");
//		l.add(true); not allowed
	}
}
