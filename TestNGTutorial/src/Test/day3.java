package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class day3 {
	
	@Parameters({"URL"})
	@Test
	public void webLoginCarLoan(String urlname)
	{
		System.out.println("webLoginCarLoan");
		System.out.println(urlname);
	
		//selenium
	}
	@Test(enabled=false)
	public void mobileLoginCarLoan()
	{
		System.out.println("mobileLoginCarLoan");
		//Appium
	}
	
	@Test(groups=("Smoke"))
	public void mobileSiginCarLoan()
	{
		System.out.println("mobileSigninCarLoan");
		//Appium
	}
	@Test(groups=("Smoke"))
	public void mobileLogoutCarLoan()
	{
		System.out.println("mobileLogoutCarLoan");
		//Appium
	}

	@Test(dependsOnMethods = {"webLoginCarLoan"})
	public void apiLoginCarLoan()
	{
		System.out.println("apiLoginCarLoan");
		//Rest API Automation
	}
	@Test(timeOut=4000)  // This timeOUt will wait for 4 sec till it through out error
		public void apiLogoutCarLoan()
	{
		System.out.println("apiLoginCarLoan");
		//Rest API Automation
	}
	@Test(dataProvider="getData")  // This timeOUt will wait for 4 sec till it through out error
	public void apiLogoutCarLoan1(String uname,String pwd)
{
	System.out.println("apiLoginCarLoan1");
	System.out.println(uname);
	System.out.println(pwd);
	//Rest API Automation
}
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("This Before Suite will be excuted first before all day3 methods");
		
	}
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("This Before Method will be excuted first");
		
	}
	@AfterMethod
	public void amethod()
	{
		System.out.println("This After Method will be excuted after each method in Day3");
		
	}
	@BeforeClass
	public void bclass()
	{
		System.out.println("This Before class will be excuted before any methods in the class");
		
	}
	@AfterClass
	public void aclass()
	{
		System.out.println("This After class will be excuted after any methods in the class");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// 1st combination- usrname and password good credit history
		//2nd combination-usrname and password no credit history
		//3rd combination-usrname and password fradlent credit history
		Object[][] data=new Object[3][2]; // 3rows and 2 columns multi dimentional array
	data[0][0]="firstsetuname";
	data[0][1]="firstpassword";
	data[1][0]="secondsetuname";
	data[1][1]="secondpassword";
	data[2][0]="thirdsetuname";
	data[2][1]="thirdpassword";
	return data;
	}
	

}
