/*
 Singleton class is a class where you can create only one instance of a class
 */

import java.util.*;
public class Singleton {

	public static void main(String[] args) {
		Abc obj1 = Abc.getInstance();
		//Abc obj2 = new Abc(); -> this will give an error as another instance is being created
		
		Abc obj2 = Abc.getInstance();
		

	}

}
class Abc{
	static Abc obj = new Abc(); //static instance of the class
	
	//defining private constructor
	private Abc() {
		
	}
	
	public static Abc getInstance()
	{
		return obj;
	}
	
}
