import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bigbasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int j=0;
        String items[]= {"Potato/Batate","Lemon/Limboo","Pear - Green, Imported","Bottle Gourd","Apple - Royal Gala"};
		System.setProperty("webdriver.chrome.driver", "D:\\reshma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//a[@class='btn hvr-fade']")).click();
	    //driver.findElement(By.xpath("//div[@class='form-group area-autocomplete city-select']"));
	    driver.findElement(By.xpath("//form[@name='changeLocationForm']/div/div")).click();
		driver.findElement(By.xpath("//a[@class='ui-select-choices-row-inner'] /span[text()='Mumbai']")).click();
		driver.findElement(By.id("areaselect")).sendKeys("400705");
		driver.findElement(By.xpath("//button[@class='btn btn-default ng-scope']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']")).click();
		driver.findElement(By.xpath("//ul[@id='navBarMegaNav']/li[1]/a")).click();
		//driver.findElement(By.xpath("//li[@class='ng-scope'] //a[text()='Fresh Vegetables'")).click();
		//driver.findElement(By.xpath("//*[@id=\"fruits-vegetables\"]/div/div/div[1]/ul/li[4]")).click();
		Thread.sleep(2000);
		List<WebElement> products=driver.findElements(By.xpath("//div[@class='col-sm-12 col-xs-7 prod-name']/a"));
		
		for(int i=0; i<products.size(); i++)
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
