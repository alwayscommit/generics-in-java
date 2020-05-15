package com.generics.learn;

public class Bin<D, W> {
	// D dry W wet trash

	private D dryTrash;
	private W wetTrash;

	public D getDryTrash() {
		return dryTrash;
	}

	public void setDryTrash(D dryTrash) {
		this.dryTrash = dryTrash;
	}

	public W getWetTrash() {
		return wetTrash;
	}

	public void setWetTrash(W wetTrash) {
		this.wetTrash = wetTrash;
	}

}
