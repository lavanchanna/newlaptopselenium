package javapackage;

import java.util.Arrays;

public class secondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,40,30,50,10};
       System.out.println(secondHighest(a,5));
		
		
	}
	public static int secondHighest(int a[], int total)
	{
		Arrays.sort(a); // 10,20,30,40,50
		return a[total-2];// a[5-2] -> a[3]
		
		
	}

}
