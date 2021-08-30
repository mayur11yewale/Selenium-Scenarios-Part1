package Selenium;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CssValue {
	
		public WebDriver driver;
		@BeforeClass
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.google.com");
		}
		
		@Test
		public void getbccolor()
		{
			System.out.println(driver.findElement(By.name("q")).getCssValue("background-color"));
		}
		@Test
		public void getcolor()
		{
			System.out.println(driver.findElement(By.name("q")).getCssValue("color"));
		}
		@Test
		public void getfont()
		{
		System.out.println(driver.findElement(By.name("q")).getCssValue("font"));
		}
		
		

}
