package com.generics.learn.boundedtypeparam;

import java.util.Arrays;
import java.util.List;

public class BoundedClass {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(new Integer[] { 11, 2, 1, 4 });
		List<String> stringList = Arrays.asList(new String[] { "x", "b", "a", "d" });

		List<Double> doubleList = Arrays.asList(new Double[] { 1.2, 0.5, 2.3, 0.0 });

		DataSort<Integer> sortedInt = new DataSort<>(intList);
//		DataSort<String> sortedString = new DataSort<>(stringList);
		// can't use DataSort with String because it is bounded by Number class subtypes

		sortedInt.getSortedData();
//		sortedString.getSortedData();

		DataSort<Double> sortedDouble = new DataSort<>(doubleList);
		sortedDouble.getSortedData();

//		IBound bound = new CBound(); Multiple type interfaces, have to pass the class type itself
		// Which implements both the interfaces
		CBound bound = new CBound();
		getDataBoundedInterface(bound);
	}

	// For generic method, this is how you achieve bounding
	public static <T extends Number> void getSortedData(List<T> list) {
		list.sort(null);
		for (T t : list) {
			System.out.println(t);
		}
	}

	public static <T extends IBound & IBound1> void getDataBoundedInterface(T data) {

	}

}

interface IBound {
}

interface IBound1 {
}

class CBound implements IBound, IBound1 {
}
