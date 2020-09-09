import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sushantpetition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name[]= {"ramya","divya","disha","ranjan","rajat","deepa","ashok","riya","sharada","shilpa","riya","sanjana","ragini"};
		System.setProperty("webdriver.chrome.driver", "D:\\reshma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://petition.republicworld.com/");
		System.out.println("updated for GitHub");
		
		for(int i=0;i<10;i++)
		{		
		List<String> name1=Arrays.asList(name);
		driver.findElement(By.cssSelector("input[name='First Name']")).sendKeys(name[i]);Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='Last Name']")).sendKeys("shetty");
		Thread.sleep(3000);
		WebElement country=driver.findElement(By.cssSelector("select[name='Country']"));
		Select s=new Select(country);
		s.selectByValue("India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-at='form-button']")).click();
		Thread.sleep(3000);
		}

	}

}
