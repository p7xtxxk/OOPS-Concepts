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
//	same name as class name
//	doesn't return anything 
//	defines what happens when object is created
//	defines how to instantiate values in an object
//	internally it is special type of method inside class that allows to pass values to parameters during object creation
//	default constructor doesn't have any values
//	TYPES:
//	Default Constructor: Java compiler automatically inserts a default constructor during compilation to provide default values to the object
//	No-Argument Constructor: This is a constructor explicitly written by the programmer that accepts no parameters; used to set initial values
//	Parameterized Constructor :A constructor that has a specific list of parameter; To initialize different objects with different values at the time of creation

//	CONSTRUCTOR OVERLOADING:
//	multiple constructors having same name; they are differentiated by parameters
	
//	NOTE-4:
//	constructors can be overloaded like methods but they cannot be overridden like methods
	
//	'this' KEYWORD:
//	refers to the current object—the instance of the class whose method or constructor is being called.
//	used for prevent shadowing: happens when the parameter and instance have same name
//	used to call another constructor from a constructor in the same class
//	Method chaining -LOOK UP ON THIS
	
//	NOTE-5:
//	if we use this keyword to call a parameterized constructor from default constructor inside a class.
//	this(10,"V10",10.0f) is same as new Car(10,"V10",10.0f)
//	this process happens internally
	
//	DIFFERENT PARTS OF DECLARATION
//	Car myCar = new Car();
//	Car -> variable type
//	myCar -> reference variable
//	new -> to create new object
//	Car() -> constructor
	 
//	NOTE-6:
//	primitives aren't stored as objects by default; so they are stored in stack memory unlike objects
	
//	NOTE-7
//	all classes in Java extend object class
//	primitives don't extend object class
//	So, even though Java has OOPs concept, it isn't purely Object oriented language
	
//	WRAPPER CLASS:
//	provide a way to use primitive data types (like int, boolean, etc.) as objects.
//	important as many Java features, such as Collections (ArrayList, HashMap), only work with objects.
//	byte->Byte
//	short->Short
//	int->Integer
//	long->Long
//	float->Float
//	double->Double
//	char->Character
//	boolean->Boolean

//	BOXING:
//	The process of converting a primitive value into an object of the corresponding wrapper class.
//	done prior to Java 5
//	deprecated now
	
//	UNBOXING:
//	The process of converting an object of a wrapper class back to its corresponding primitive type.
//	done prior to Java 5
//	deprecated now
	
//	AUTO-BOXING:
//	The automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
	
//	AUTO-UNBOXING:
//	The automatic conversion of a wrapper class object back into a primitive type.
	
//	GETTER AND SETTER:
//	Getters and setters are methods used to retrieve and update the value of a private variable in a class.
//	used in encapsulation
	
//	PASS BY VALUE:
//	Java is always pass-by-value never pass-by-reference.
//	When you pass a primitive type (like int, double, boolean) to a method, Java creates a copy of the variable's value and passes it to the method. Any changes made to that variable inside the method do not affect the original variable.
//	When you pass an object to a method, Java copies the reference (the address of the object in Heap memory) and passes that copy to the method.
//	
	
//	NOTE-8:
//	when we pass integers as wrapper classes, even then, their valu is not swapped becuase Integer is a 'final' class
	
//	'final' KEYWORD:
//	its value cannot be changed once it has been initialized. It becomes a constant.
//	method declared as final cannot be overridden by subclasses
//	class declared as final cannot be extended or inherited
//	Ex: Integer
	
	
	
	
	
	
	
	
	
	
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
		
		
		Car car3= new Car();
		System.out.println(car3.seats);
		System.out.println(car3.price);
		System.out.println(car3.engine);
		
		// any changes the variables of car3 will be reflected in car4 too
		Car car4=car3;
		
		// Boxing
		System.out.println("-----------------------------------");
		Integer n1=new Integer(7);
		System.out.println(n1);
		
		// Unboxing
		int n2=n1.intValue();
		System.out.println(n2);
		
		// Auto boxing
		int n3=12;
		Integer n4=n3;
		System.out.println(n4);
		
		// Auto unboxing
		int n5=n4;
		System.out.println(n5);
		System.out.println("-----------------------------------");	
		
		int x=1,y=3;
		Integer z=x,w=y;
		System.out.println("Pass by value - primitive");	
		swap1(x, y);
		System.out.println("x:"+x+"y:"+y);
		System.out.println("Pass by value - objects");	
		swap2(z, w);
		System.out.println("z:"+z+"w:"+w);
		/*
		 * Pass by value - primitive
		 * x:1y:3
		 * Pass by value - objects
		 * z:1w:3
		 */
		
		System.out.println("-----------------------------------");	
		// final variable
		Calc2 c=new Calc2();
		System.out.println(c.PI);
		c.show1();
		c.show2();
		c.add(x, y);
		
		
	}
	
	public static void swap1(int a, int b) {
		a+=b;
		b=a-b;
		a=a=b;
	}
	public static void swap2(Integer a, Integer b) {
		a+=b;
		b=a-b;
		a=a=b;
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
			this(10,"V10",10.0f);
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
	
	static class Calc{
		// final variable - no value changes
		final float PI=3.4f;
		
		// final method - cannot be overridden
		final void show1() {
			System.out.println("By Prateek");
		}
		// can be overridden
		void show2() {
			System.out.println("Modified by Prateek");
		}
		int add(int a, int b) {
			System.out.println(a+b);
			return a+b;
		}
	}
	
	// class cannot be extended or inherited
	static class Calc2 extends Calc{
		void show2() {
			System.out.println("Modified by Priyanshu");
		}
	}
	
	
}
