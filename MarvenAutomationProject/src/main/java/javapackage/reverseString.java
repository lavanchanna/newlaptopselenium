package javapackage;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Selenium";
		String rev="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
	ch=str.charAt(i); // i= 0 1 2 3 .. 
	rev= ch+rev; // rev> S eS leS eleS ..... muineles
	
			
		}
		System.out.println(rev);
		
	}

}
