package ArrayListClass;
import java.util.Collections;
import java.util.ArrayList;
public class sort {
	public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        System.out.println("Before sorting list:");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("after sorting list:");
        System.out.println(list);
    }
}
