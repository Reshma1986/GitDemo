import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bigbasketusingexplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String items[]= {"Potato/Batate","Lemon/Limboo","Pear - Green, Imported","Bottle Gourd","Apple - Royal Gala"};
		System.setProperty("webdriver.chrome.driver", "D:\\reshma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait w=new WebDriverWait(driver,5);
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//a[@class='btn hvr-fade']")).click();
		driver.findElement(By.xpath("//form[@name='changeLocationForm']/div/div")).click();
		driver.findElement(By.xpath("//a[@class='ui-select-choices-row-inner'] /span[text()='Mumbai']")).click();
		driver.findElement(By.id("areaselect")).sendKeys("400705");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default ng-scope']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']")).click();
		driver.findElement(By.xpath("//ul[@id='navBarMegaNav']/li[1]/a")).click();
		additems(driver,items);
		
		
	}
	
	public static void additems(WebDriver driver,String items[])
	{
		int j=0;
		List<WebElement> products=driver.findElements(By.xpath("//div[@class='col-sm-12 col-xs-7 prod-name']/a"));
		for(int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			List items1=Arrays.asList(items);
			if(items1.contains(name))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='col-sm-5 col-xs-5 pad-0'] /button")).get(i).click();
				
				if(j==items.length)
				{
					break;
				}
				
			}
		}
		
	}
		
		
		
		
		

	

}
