package com.generics.learn;

public class GenericsIntro {

	// Generics are a mechanism for type-checking at compile time

	public static void main(String[] args) {
		DataString d1 = new DataString("This is d1");
		System.out.println(d1.toString());

		//DataObject stringObj = new DataObject("hello");// --> Point 1
		
		DataObject<String> stringObj = new DataObject<String>("hello");
		DataObject<Integer> intObj = new DataObject<Integer>(1);
		//int data = (int) (stringObj.getData());// Doesn't give compile time error when point 1 is there without <T> = String
		//Gives a compile time error when DataObject has a parameterized type
		
		String data = (String) (stringObj.getData());
		System.out.println(data);
		int dataInt = (int) (intObj.getData());
		System.out.println(dataInt);
		
		
		IData<String> d3 = new DataObject<>("Generic Interface Implementation");
		System.out.println(d3.getData());
		
		//generic type : generic class, generic interface
		DataObject<String> d4 = new DataObject<>("Data 4");
		BaseData<String> b1 = d4;
		System.out.println(d4.getData());
		
		//Benefits
		/*
		 * 1. Stronger type checks
		 * 2. type safety
		 * 3. elimination of casts
		 * 4. code re-usability
		 * 
		 *Collection Framework - Type safety - rewritten
		 * 
		 */
		
	}

}
