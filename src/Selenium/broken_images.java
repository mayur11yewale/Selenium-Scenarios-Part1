package Selenium;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class broken_images {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/newtours/register.php");

	List<WebElement> ele=driver.findElements(By.tagName("img"));
	for(int i=0;i<ele.size();i++)
	{
		if(ele.get(i).getAttribute("naturalWidth").equals("0"))
		{
			System.out.println(ele.get(i).getAttribute("outerHTML"));
		}
	}
}
}