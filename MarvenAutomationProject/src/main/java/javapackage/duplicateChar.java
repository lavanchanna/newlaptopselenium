package javapackage;

public class duplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="automation";
		char [] carry=str.toCharArray();//[a,u,t,o,m,a,t,i,o,n]
		for (int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(carry[i]==carry[j])
				{
					System.out.println(carry[j]);
					break;
				}
			}
		}
	}

}
