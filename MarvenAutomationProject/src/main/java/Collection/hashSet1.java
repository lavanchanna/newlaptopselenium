package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set=new HashSet<String>();
		//Hashset not allowed duplicate elements and it will not maintain order as added the values
		set.add("Rakesh");
		set.add("Arju");
		set.add("Geeta");
		set.add("Shyam");
		set.add("Geeta");
		set.add(null);
		System.out.println("Array list" + set);
		//We can retrieve data using Iterator
		Iterator<String> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		
		}
		
	}

}
