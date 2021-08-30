package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Link {

		static WebDriver driver;
	
		public static void main(String[] args) throws IOException
		{
			driver=new ChromeDriver();
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\samurai\\workspace\\TestNG\\src\\Auto\\datadriven.properties");
			prop.load(fis);	
			System.setProperty(prop.getProperty("x"), prop.getProperty("y"));
			
		}
		
		@Test
		public void link1()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
			driver.get("http://www.google.com");
			driver.quit();
		}
		
		@Test
		public void link2()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
			driver.get("http://www.amazon.com");
			driver.quit();
		}
		
		@Test
		public void link3()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
			driver.get("http://www.facebook.com");
			//driver.quit();
		}
		
	
	}

