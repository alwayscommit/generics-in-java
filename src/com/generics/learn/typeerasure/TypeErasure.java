package com.generics.learn.typeerasure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TypeErasure {

	public static void main(String[] args) {
//		System.out.println(method1(10));
		// Compiler checks only for reference, doesn't throw error
		ArrayList l1 = new ArrayList<String>();
		// Type Erasure feature removed generic syntax
		// ArrayList l1 = new ArrayList();
		l1.add(12);
		l1.add(true);
		l1.add("a");
		System.out.println(l1);

		ArrayList l2 = new ArrayList<Integer>();
		ArrayList l3 = new ArrayList<Double>();
		// All these declarations are equivalent

	}

	public static String method1(Integer i) {
		List<String> a = new LinkedList<String>();
		// List a = new LinkedList; a loses it's type param
		List b = a;
		b.add(i);
		return a.iterator().next();
		// This return line becomes
		// return (String) a.iterator.next(); ClassCastException:
	}

	// Compiler removes the type reference, which is called as type erasure
		// Hence this error
	// Erasure of method method2(ArrayList<Integer>) is the same as another method
	// in type TypeErasure
	/*public static void method2(ArrayList<String> l) {

	}

	public static void method2(ArrayList<Integer> l) {

	}*/
}
