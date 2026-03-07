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
	
//	NOTE-3:
//	for non-initialized primitives, values to be printed will be their default values; 0 for int, 0.0f for float,etc.
//	for non-initialized objects values to be printed will be NULL
	
//	. OPERATOR:
//	when we try to access instance variable using reference variable, like myCar.price -> it checks if there is any value associated with the variable
//	if yes -> that value is printed
//	else -> default value for the variable based on primitive or object is printed
//	when we assign a value, like myCar.price=9.7f, it assigns or overwrites the value at that location
//	by using '.', we can only add values that are present in the template as Java is a statically typed language
	
//	CONSTRUCTOR:
//	defines what happens when object is created
//	defines how to instantiate values in an object
//	internally it is special type of method inside class that allows to pass values to parameters during object creation
//	default constructor doesn't have any values
//	TYPES:
//	Default Constructor: Java compiler automatically inserts a default constructor during compilation to provide default values to the object
//	No-Argument Constructor: This is a constructor explicitly written by the programmer that accepts no parameters; used to set initial values
//	Parameterized Constructor :A constructor that has a specific list of parameter; To initialize different objects with different values at the time of creation
 	
	
//	'this' KEYWORD:
//	refers to the current object—the instance of the class whose method or constructor is being called.
//	used for prevent shadowing: happens when the parameter and instance have same name
//	used to call another constructor from a constructor in the same class
//	Method chaining -LOOK UP ON THIS
	
//	DIFFERENT PARTS OF DECLARATION
//	Car myCar = new Car();
//	Car -> variable type
//	myCar -> reference variable
//	new -> to create new object
//	Car() -> constructor
	 
	
	
	
	public static void main(String[] args) {
		// myCar is the REFERENCE variable
		Car myCar = new Car();
		myCar.engine="V12";
		myCar.price=6777434523.325f;
		myCar.seats=5;
		System.out.println(myCar);
		
		
		Car[] car=new Car[4];
		System.out.println(Arrays.toString(car));
		// OUTPUT: [null, null, null, null]
	}
	
	static class Car{
		
		// seats, engine and price are INSTANCE variable
		int seats;
		String engine;
		float price;
		
		// No-Argument Constructor-1
		/*
		 Car(){
			this.seats=4;
			this.engine="V6";
			this.price=1000000.04f;
		 }
		 */
		
		// No-Argument Constructor-2
		Car(){
			this(10,"V5",78.6f);
		}
		
		// parameterized constructor
		Car(int s, String e, float p){
			this.seats=s;
			this.engine=e;
			this.price=p;
		}
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
