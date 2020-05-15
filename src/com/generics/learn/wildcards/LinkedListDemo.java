package com.generics.learn.wildcards;

public class LinkedListDemo {

	public static void main(String[] args) {
		DataNode<Integer> node2 = new DataNode<Integer>(20, null);
		DataNode<Integer> node1 = new DataNode<Integer>(10, node2);
	
		//DataNode(Integer, DataNode(Integer))
		
		System.out.println(node1.toString());
		System.out.println(node2.toString());
		
		DataNode<Double> node22 = new DataNode<Double>(20.2, null);
		DataNode<Double> node11 = new DataNode<Double>(10.1, node22);
		
		DataNode<Number> node111 = new DataNode<>(Double.valueOf(10.1), null);
		//node111.setNextNode(node2);// this fails with type param E
		//DataNode<Number> cannot be parent of DataNode<Integer>
		//Instantiation of same generic type with different type params doesn't happen
//		The method setData(Number) in the type DataNode<Number> is not applicable for the arguments (DataNode<Integer>)
		
		//After replacing type param E with wildcard ?
		node111.setNextNode(node2); //works
		
		
		
		System.out.println(node22.toString());
		System.out.println(node11.toString());
		
		//Map<Integer,String> cannot be the subtype of Map<Number,String>
		
	}
	
}
