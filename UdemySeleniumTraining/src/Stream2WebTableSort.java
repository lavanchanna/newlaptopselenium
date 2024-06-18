import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Stream2WebTableSort {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		//Click on the column
		driver.findElement(By.xpath("//tr//th[1]")).click();
		//capture all webelements into list
		List<WebElement> elementsList=driver.findElements(By.xpath("//tr//td[1]"));
		//capture text of all webelements into list>Original list
		List<String> originalList=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort in the above list-> sorted list>
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		//Get the Price of the vegetable 
		// scan the name column with Get Text->Beans->print the price of the rice
		List<String> price;
		do
		{
			List<WebElement> rows=driver.findElements(By.xpath("//tr//td[1]"));
	price=rows.stream().filter(s->s.getText().contains("Rice")).
		map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			
			
		}
		}while(price.size()<1);
			}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		//Below we need to get the xpath of the first sibling Price
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

    

	
}
