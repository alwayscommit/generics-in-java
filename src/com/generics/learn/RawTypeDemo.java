package com.generics.learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RawTypeDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3);
		Box<Integer> genBox = new Box<Integer>(list);

		for (Integer intObj : genBox.getList()) {
			System.out.println(intObj);
		}

		Box rawBox = new Box(Arrays.asList(1, 2, "aa")); // No error, only warning
		// retained to maintain compatibility with older versions of java.
		// not to be used, not type safe

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// K,V Key Value generics

		// Any number of type parameters

		Bin<String, Integer> bin = new Bin<>();
		bin.setDryTrash("Dry Trash");
		bin.setWetTrash(12312);

		System.out.println("Dry trash: " + bin.getDryTrash() + "! Wet Trash: " + bin.getWetTrash());

	}

}
