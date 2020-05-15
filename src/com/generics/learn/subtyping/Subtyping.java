package com.generics.learn.subtyping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.generics.learn.Box;

public class Subtyping {

	public static void main(String[] args) {
		Object o = new Object();
		Integer i = Integer.valueOf(11);
		o = i;

		List<Number> list = new ArrayList<>();
		list.add(Integer.valueOf(11));
		list.add(Double.valueOf(11));
//		list.add("String");//Doesn't allow because String is not sub-type of Number

		List<Box<Integer>> boxList = new ArrayList<>();
		boxList.add(new Box<>(Arrays.asList(1, 2, 3)));
		boxList.add(new SquareBox<>(Arrays.asList(1, 2, 3)));
		
		//Type mismatch: cannot convert from ArrayList<Integer> to List<Number>
//		List<Number> l1 = new ArrayList<Integer>();//ArrayList Integer is not subtype of List Number
		List<Integer> l1 = new ArrayList<Integer>();
		
	}

}
