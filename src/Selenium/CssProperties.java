package Selenium;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CssProperties {
	
		public WebDriver driver;
		@BeforeClass
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.google.com");
		}
		
		@Test
		public void getclass()
		{
			System.out.println(driver.findElement(By.name("q")).getAttribute("class"));
		}
		@Test
		public void maxlength()
		{
			System.out.println(driver.findElement(By.name("q")).getAttribute("maxlength"));
		}
		@Test
		public void type()
		{
		System.out.println(driver.findElement(By.name("q")).getAttribute("type"));
		}
		@Test
		public void role()
		{
				System.out.println(driver.findElement(By.name("q")).getAttribute("role"));
		}
		@AfterClass
		public void close()
		{
			driver.quit();
		}

}
