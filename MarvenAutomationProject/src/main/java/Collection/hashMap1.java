package Collection;

import java.util.HashMap;

public class hashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hashmap store the values with the help of key and value pair
		//Insert the element with the help of put method
		// for duplicate values, it will overwritten the old value
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("India", "New Delhi");
		map.put("Usa", "New York");
		map.put("UK", "London");
		map.put("India", "Mumbai");
		System.out.println(map.get("Usa")); //New York
		System.out.println(map.get("UK")); // London
		System.out.println(map.get("India")); //Mumbai
		System.out.println(map.get("aus"));//null
		map.put(null, "Berlin");
		map.put(null, "LA");// we can insert using null key
		System.out.println(map.get(null));// it will display latest one
		map.put("India1", null);// we can insert null value
		map.put("India2", null);//
		
		System.out.println(map.get("India1"));// it will return null value
		System.out.println(map.get("India2"));// it will return null value

}
}

