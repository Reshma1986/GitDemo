import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkartpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0;
		String[] items= {"Cucumber","Mushroom","Cashews","Brinjal"};
		System.setProperty("webdriver.chrome.driver", "D:\\reshma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products=driver.findElements(By.cssSelector("h4[class='product-name']"));
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");//splits -1kgfrom the name
			String formattedName=name[0].trim();
			 
			List itemsList=Arrays.asList(items);
			if(itemsList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==items.length)
				{
					break;
				}

			}
		}
		
		

	}

}
