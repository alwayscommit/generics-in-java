package com.generics.learn.wildcards;

public class DataNode<E> {

	private E data;
	private DataNode<? extends Number> nextNode; // can be anything but should be Number Type
	//"? extends A" any class/interface = Upper bounded type card
	//"?" unbounded wild card
	//"? super B" Lower bounded Wildcard
	
	public DataNode(E data, DataNode<? extends Number> nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public DataNode<? extends Number> getNextNode() {
		return nextNode;
	}

	public void setNextNode(DataNode<? extends Number> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "DataNode [data = " + data + " next = " + nextNode + " ]";
	}
}
