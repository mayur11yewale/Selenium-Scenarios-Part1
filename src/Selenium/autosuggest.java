package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggest {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.id("hp-widget__sfrom")).clear();
	driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Pu");
	driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.DOWN);
	//driver.findElement(By.xpath("//span[@class='span24 clearField']//input[@id='FromTag']")).sendKeys(Keys.ENTER);
	Thread.sleep(10000);
/*	driver.findElement(By.xpath("//span[@class='span24 clearField']//input[@id='FromTag']")).sendKeys(Keys.DOWN);
	driver.findElement(By.xpath("//span[@class='span24 clearField']//input[@id='FromTag']")).sendKeys(Keys.DOWN);
	driver.findElement(By.xpath("//span[@class='span24 clearField']//input[@id='FromTag']")).sendKeys(Keys.DOWN);
	driver.findElement(By.xpath("//span[@class='span24 clearField']//input[@id='FromTag']")).sendKeys(Keys.DOWN);
	driver.findElement(By.xpath("//span[@class='span24 clearField']//input[@id='FromTag']")).sendKeys(Keys.ENTER);*/	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//String script="document.getElementById('FromTag').value()";
	String text=(String) js.executeScript("return document.getElementById('hp-widget__sfrom').value;");
	
	while(!text.contains("Pune"))
	{
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.DOWN);
		//driver.findElement(By.xpath("//span[@class='span24 clearField']//input[@id='FromTag']")).sendKeys(Keys.ENTER);
		text=(String) js.executeScript("return document.getElementById('hp-widget__sfrom').value;");
	}
	driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);
	System.out.println(text);
}
}