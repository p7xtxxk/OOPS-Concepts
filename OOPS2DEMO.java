


package objectOrientedProgrammingConcepts;
	// importing packages - '*' means all the files are imported but not the folders
import trial1.*;
import trial2.greeting;
import trial2.*;
	//  OOPS2DEMO class cannot be static as it is the top class; it can be private, public or protected
public class OOPS2DEMO {
//	PACKAGE:
//	mechanism used to encapsulate a group of classes, sub-packages, and interface
//	Think of it as a folder system on your computer that keeps your code organized and prevents naming conflicts.
//	allows 2 classes to have same file names in different folders
//	convention for naming is: URL in opposite direction
	
//	NOTE-1:
//	when using the 'import' statement, all the files are imported but folders are not
	
//	NOTE-2:
//	when having same class names inside different packages, write the fully qualified name
	
//	NOTE-3
//	the only way to use both classes with same name in the same piece of code is to use Fully Qualified Names
	
//	NOTE-4
//	to write directly without a prefix, the import statement must be made static like import static x.x.x.x.x;
//	if you make 2 packages import as static which have classes with different names but both class have method with same name then direct calling as discusses earlier will cause compilation errors
//	If you have a method with that same name locally in your current class, the local method takes priority, and the compiler will not throw an error—it will simply ignore the static imports in favor of your local code. 
//	Ex: if we had eat() method in this code, then it would had priority over them imported methods be static or not.
	
//	NOTE-5:
//	packages and sub-packages are treated as entirely separate entities. You must import each one explicitly if you need its classes.
//	java.lang.* is imported by default in all codes
	
//	NOTE-6:
//	If you don't specify ACCESS MODIFIER for a class or method, it is package-private.
//	The class or method is visible to all other classes in the same package.
//	It is completely invisible to classes in different packages, even if you try to import it.
	
//	STATIC VARIABLES:
//	A static variable is initialized only once, at the start of the execution. It acts as a global variable for all instances of that class.
//	Commonly used for constants or counters that track information across all objects.
//	even if no objects are created, static variables can be accessed
	
//	NOTE-7:
//	always use classname.x to access static variables; even though this.x will work avoid it	
	
//	STATIC METHOD:
//	can be called without creating an instance of the class
//	cannot use the this or super keywords because they are not associated with a specific instance.
//	A static method can only call other static methods and access static variables directly.
//	To use a non-static (instance) variable inside a static method, we must create an object of that class first which is exactly why we create an instance of a class
//	we can access static method inside non-static method
	
//	NOTE-8:
//	The main method is static so the JVM (Java Virtual Machine) can call it directly without creating an instance of the class.
//	this is an example of non-static members inside a static member
	
//	NOTE-9:
//	The this keyword is a reference to the current object instance. Since static methods belong to the class itself and not to any specific instance, there is no "current object" for this to point to.
//	this is DEPENDENT on the method and IRRELEVANT of the class
	
//	STATIC INITIALIZATION BLOCK:
//	primary purpose is to initialize static variables of the class
//	executes before the main method and before any objects of that class are created.
//	called only once when the class is loaded
	
//  NOTE-10
//	In Java, static members belong to the class itself rather than any specific object instance.
//	so they can be accessed with their class name instead of object name
//	static members (variables and methods) can be used without ever creating an object of that class, but you can still create instances of the class if you wish.
	
//	INNER CLASS:
//	static nested class is a class defined inside another class using the static keyword,
//	the top class in the .java file can be private, public or protected- NEVER STATIC
//	to refer to the outer class object, you must use OuterClassName.this
//	A non-static inner class cannot have its own static methods or static variables (unless they are constant final variables) in Java 16 and newer.
	
//	NOTE-11:
//	'out' is of PrintStream type
	
	
	
	
	// we can make this static and it wont show any error because the top class is OOPS2DEMO
	static class A {
		void showa() {
			System.out.println("in A class");
		}
		class B {
			static void showb() {
				System.out.println("in B class");
			}
		}
		static class C {
			void showc() {
				System.out.println("in C class");
			} 
		}
	}
	static class Human {
		int age;
		String name;
		boolean married;
		// counter 
		static long population;
		
		Human(int a, String n, boolean m) {
			this.age=a;
			this.name=n;
			this.married=m;
			Human.population++;
		}
	}
	
	static void fun() {
		// calling the helu method throws an error as it is non-static and fun() is static
		/*
		 * helu();
		 */
		System.out.println("Static - Fun method");
	}
	
	void helu() {
		// calling fun doesn't throw any error as it is static and helu() is non-static
		fun();
		System.out.println("Non-static - Helu method");
	}
	
	static class H{
		static int a=5;
		static int b;
		
		// static initialization block
		static {
			System.out.println("accessed static initialize block");
			b=5*a;
		}
	}
	public static void main(String[] args) {
		// using the trial1 package
		trial1.greeting.main();
		
		// using the trial2 package
		trial2.greeting.main();
		
		Chicken.eat();
		Mutton.eat();
		// OUTPUT:
		// I want to eat chicken biryani
		// I want to eat mutton biryani
		
		
		Human h1=new Human(12,"H1",false);
		Human h2=new Human(12,"H2",true);
		System.out.println(Human.population);
		Human h3=new Human(12,"H3",true);
		Human h4=new Human(12,"H4",false);
		System.out.println(Human.population);
		
		
		// calling fun doesn't throw any error as it is static and main is static
		fun();
		// calling the helu method throws an error as it is non-static and main is static
		/*
		 * helu();
		 */
		
		System.out.println("----------------------------------------");
		H hu1=new H();
		System.out.printf("%d, %d", H.a, H.b);
		H.a+=1;
		H.b+=3;
		System.out.println();
		H hu2=new H();
		System.out.printf("%d, %d", H.a, H.b);
		System.out.println("----------------------------------------");
		
		// instance of class A
		A obj1=new A();
		obj1.showa();
		// instance of class B
		A.B obj2=obj1.new B();
		obj2.showb();
		// instance of class C
		A.C obj3=new A.C();
		obj3.showc();
		/*
		 * OUPTUT:
		 * in A class
		 * in B class
		 * in C class
		 */
		
		// Standard way to call the static method in your non-static inner class
		A.B.showb();
		
	}
}
