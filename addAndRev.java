package ArrayListClass;
//Java program to Remove Elements in ArrayList

	// Importing all utility classes
	import java.util.*;
public class addAndRev {

		// Main driver method
		public static void main(String args[])
		{
			// Creating an object of arraylist class
			ArrayList al = new ArrayList();
			System.out.println("Initial size of ArrayList " + al.size());

			// Adding elements to ArrayList
			// Custom addition
			al.add("a");
			al.add("b");
			al.add("c");
			al.add("d");
			al.add("e");

			// Adding element at specific index
			al.add(1, "A");
			System.out.println("Initial size of ArrayList after adding " + al.size());
			// Printing all elements of ArrayList
			System.out.println("Initial ArrayList " + al);

			// Removing element from above ArrayList
			al.remove(1);
// Removing this word element in ArrayList
			  al.remove("d");

			// Now printing updated ArrayList
			System.out.println("After the Object Removal "
							+ al);
		}
	}


