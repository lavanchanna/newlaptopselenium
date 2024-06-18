package javapackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {
    @Test 
	public void a()
	{
	System.out.println("This is a test case method");	
	}
    
    @Test 
	public void z()
	{
	System.out.println("This is z test case method");	
	} 
    
    @Test(enabled = false) 
	public void b()
	{
	System.out.println("This is b test case method");	
	} 
    @Test
	public void d()
	{
    	throw new SkipException("We skip d method");
	} 
}
