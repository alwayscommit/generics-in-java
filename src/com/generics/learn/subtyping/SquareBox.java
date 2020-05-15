package com.generics.learn.subtyping;

import java.util.List;

import com.generics.learn.Box;

public class SquareBox<T> extends Box<T> {

	public SquareBox(List<T> list) {
		super(list);
	}

}
