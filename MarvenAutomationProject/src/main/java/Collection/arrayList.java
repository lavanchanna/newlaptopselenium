package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
	//	List<String> list1=new ArrayList<String>();
		// Duplicate elements can be added in the list or Arraylist and it maintain the order
		list.add("Rakesh");
		list.add("Arju");
		list.add("Geeta");
		list.add("Shyam");
		list.add("Geeta");
		System.out.println("Array list" + list);
		
		//We can retrieve data using Iterator
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
