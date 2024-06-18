package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
	@AfterTest
	public void lastexecution()
	{
		System.out.println("This will be executed last");
	}
	@AfterSuite
	public void bsuite()
	{
		System.out.println("This After Suite will be excuted at the end");
		
	}
	@Test(groups=("Smoke"))
	public void demo()
	{
		System.out.println("Demo");
		Assert.assertTrue(false);
	}
	
	@Test
	public void demo2()
	{
		System.out.println("Demo2");
	}

}
