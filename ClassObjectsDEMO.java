package objectOrientedProgrammingConcepts;
import java.io.*;
import java.util.*;

public class ClassObjectsDEMO {

//	REFERENCE VARIABLE:
//	used to point to an object
//	stored in heap memory
//	do not define the object
	
//	INSTANCE VARIABLE:
//	variables inside the object 
//	define the state of the object
//	belong to a specific instance
	
//	CLASS:
//	class is a named group of properties and function
//	can be defined as template which has to be followed
//	different cars have different seat count, engines, price, etc.  but same templates
//	class doesn't exist; its a logical construct
//	doesn't occupy memory
	
//	OBJECT:
//	physical instance of class
//	occupies memory in real time
//	they have a state, identity, and behaviour of the object
//	objects are stored in heap memory and references are stored in stack memory
//	. operators are used to access instance variables 
	
//	new KEYWORD
//	dynamically allocates memory and return reference to it
//	the object created is stored in heap memory
//	the reference variable created in the stack has REFERENCE to the object created in the heap
	
	
//	NOTE-1: 
//	Car myCar = new Car();
//	Car myCar -> this part happens at compile-time
//	new Car(); -> this part happens at run-time; dynamic memory allocation
	
//	NOTE-2:
//	Java doesn't allow direct memory location access
//	pointer arithmetic isn't allowed like in C or CPP
//	only references can be used to access members by the '.' operator
//	basically, memory location based access isn't allowed
	
	
	
	
	public static void main(String[] args) {
		// myCar is the REFERENCE variable
		Car myCar = new Car();
		myCar.engine="V12";
		myCar.price=(float)6722222.232;
		myCar.seats=5;
		System.out.println(myCar);
		
		
//		for non-initialized objects values to be printed will be NULL
		Car[] car=new Car[4];
		System.out.println(Arrays.toString(car));
		// OUTPUT: [null, null, null, null]
	}
	
	static class Car{
		// seats, engine and price are INSTANCE variable
		int seats;
		String engine;
		float price;
	}
	
	class Student {
		int roll;
		String name;
		float marks;
		// int[] roll=new int[5];
		// String[] name=new String[5];
		// float[] marks=new float[5];
	}
	
	

	
	
}
