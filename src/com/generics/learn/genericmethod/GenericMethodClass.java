package com.generics.learn.genericmethod;

public class GenericMethodClass {

	public static void main(String[] args) {
		System.out.println(concat(1));
		System.out.println(concat("Aakash"));
	}

	//T data only generic parameter is not sufficient to indicate generic method
	//<T> is needed to indicate it is a generic method
	//The method concat(T) from the type GenericMethodClass refers to the missing type T
	public static <T> String concat(T data) {
		return "Data is : " + data;
	}

}
