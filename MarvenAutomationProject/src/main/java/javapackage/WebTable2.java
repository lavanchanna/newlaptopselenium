package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.manage().window().maximize();
		/*
		//All rows in a table
		System.out.println(driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size());
		//All columns in a table
		System.out.println(driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size());
		//we can write like this also
		List<WebElement> count=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(count.size());
		//click on Rossel India link on the table
	//	driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[4]/td[1]/a")).click();
	 
	 */
// list of all company names
		List<WebElement> AllCompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		
		System.out.println(AllCompanies.size());
		for(int i=0; i<AllCompanies.size();i++)
		{
			if(AllCompanies.get(i).getText().equalsIgnoreCase("Rossell India"))
			{
				System.out.println(AllCompanies.get(i).getText());
				AllCompanies.get(i).click();
				break;
			}

		}
		
		
	}

}
