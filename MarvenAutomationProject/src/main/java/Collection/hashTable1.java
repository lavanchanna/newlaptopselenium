package Collection;

import java.util.Hashtable;

public class hashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String , Integer> ht=new Hashtable<String , Integer>();
		ht.put("Ajay", 50);
		ht.put("Sachin", 77);
		ht.put("Sunil", 44);
		ht.put("Dhoni", 52);
		ht.put("Virat", 54);
		System.out.println(ht.get("Dhoni"));
		
		System.out.println(ht.get("Gopi"));
	//	ht.put(null, 60); //HashTable will not allow to add null key
		
	//	System.out.println(ht.get(null)); it will through null pointer exception
	//	ht.put("Kapil", null);//HashTable will not allow to add null value
		// System.out.println(ht.get("Kapil")); it will through null pointer exception
		for(String keys:ht.keySet())
		{
			System.out.println(keys);
			System.out.println(ht.get(keys));
		}

		
	}

}
