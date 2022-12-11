package ArrayListClass;

//Java program to Iterate the elements
//in an ArrayList

//Importing all utility classes
import java.util.*;

//Main class
public class iteration{

	// Main driver method
	public static void main(String args[])
	{
		// Creating an Arraylist of string type
		ArrayList<String> al = new ArrayList<>();

		// Adding elements to ArrayList
		// using standard add() method
		al.add("ram");
		al.add("sham");
		al.add(1, "jodu");
		al.add("modhu");
		

		// Using the for each loop
		for (String str : al)
			System.out.print(str + " ");
	}
}
