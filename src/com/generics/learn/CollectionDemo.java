package com.generics.learn;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		
		/*ArrayList list = new ArrayList();
		list.add("Aakash");
		list.add(1);
		
		for(Object object : list) {
			String str = (String) object;
		}*/
		//Gives runtime error, ClassCastException
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Aakash");
//		list.add(1); Throws compile time error
		
		for(String object : list) {
			System.out.println(object);
		}
		
	}
	
}
