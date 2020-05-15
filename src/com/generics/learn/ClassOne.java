package com.generics.learn;

interface IInterface<T>{}
interface Dog{}

public class ClassOne implements IInterface<Dog>{
	
	//You need to specify the type of a generic interface
	//if the class implementing it is non-generic.
	//Else it gives T cannot be resolved to a type error

}

class DogCat{}

class ClassTwo<T> extends DogCat implements Dog{
	
	//This is allowed, generic class, non-generic interface, class
	
}

class ClassFour<T> implements IInterface<T>{}

//Can't implement same interface with different type param
//class ClassThree<T> extends ClassFour<T> implements IInterface<Integer>{}
//The interface IInterface cannot be implemented more than once with different arguments: IInterface<T> and IInterface<Integer>