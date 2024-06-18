package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG5 {
	
    @Test(priority = 1) 
	public void signup()
	{
    	Assert.assertTrue(3>10);// condition is false, expected true, assert failed
	System.out.println("This is signup page");	
	}
    @Test (dependsOnMethods = {"signup"})// this method will skip as signup method dependent is failed
	public void login()
	{
	System.out.println("This is login page");	
	}

}
