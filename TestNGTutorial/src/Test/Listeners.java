package Test;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;
public class Listeners implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result)
	{
		// screenshot code
		// print response if API fail
		System.out.println("Test is Failed using listners "+result.getName());
	
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test is Success using listners");
	}
	

}
