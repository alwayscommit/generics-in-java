package com.generics.learn.boundedtypeparam;

import java.util.List;

//This extends Number indicates that this class can only be typed against sub classes of Number class
public class DataSort<T extends Number> {

	private List<T> list;

	public DataSort(List<T> list) {
		this.list = list;
	}

	public void getSortedData() {
		list.sort(null);
		for (T t : list) {
			System.out.println(t);
		}
	}

}
