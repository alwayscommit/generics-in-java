package com.generics.learn;



class BaseData<T>{}
//Type parameter - T
//Parameterized class can't be static
//Illegal modifier for the class DataObject; only public, abstract & final are permitted
public class DataObject<T> extends BaseData<T> implements IData<T> {

	// Even class members can't be static, because static means only a single
	// instance,
	// whereas generic allows multiple instances of the same class with different
	// data types
	private T data;

	public DataObject(T data) {
		this.data = data;
	}

	@Override
	public T getData() {
		return data;
	}

	@Override
	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data is :" + data;
	}

}
