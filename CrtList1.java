package ArrayListClass;
import java.util.ArrayList;
public class CrtList1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Facebook");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Microsoft");    
	      list.add("Google ");    
	      //Printing the arraylist object   
	      System.out.println(list); 
	      for(int i=0;i<=list.size();i++) {
	    	 System.out.println(list.get(i));
	    	  
	      }

}
}