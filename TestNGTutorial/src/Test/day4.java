package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public void webLoginHomeLoan(String urlname)
	{
		System.out.println("webLoginHomeLoan");
		System.out.println(urlname);
		//selenium
	}
	@Test
	public void mobileLoginHomeLoan()
	{
		System.out.println("mobileLoginHomeLoan");
		//Appium
	}
	@Test
	public void apiLoginHomeLoan()
	{
		System.out.println("apiLoginHomeLoan");
		//Rest API Automation
	}

}
