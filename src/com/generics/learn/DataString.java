package com.generics.learn;

public class DataString {

	private String data;

	public DataString(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data is :" + data;
	}

}
