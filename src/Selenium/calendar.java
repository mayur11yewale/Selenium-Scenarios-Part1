package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calendar {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com/");
	driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
	
	//String text1=driver.findElement(By.xpath("//span[contains(text(),'January')]")).getText();
	while(!driver.findElement(By.xpath("//div[contains(@class,'monthBlock last')]//div[contains(@class,'header')]")).getText().contains("March"))
	{
		driver.findElement(By.xpath("//div[contains(@class,'header')]//a[contains(@title,'Next')]")).click();
	}
	
	List<WebElement> ss=driver.findElements(By.className("ui-state-default"));
	int x=ss.size();
	System.out.println(x);
	for(int i=0;i<x;i++)
	{
		String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
		System.out.println(text);
		if(text.equals("31"))
				driver.findElements(By.className("ui-state-default")).get(i).click();
		//break;
	}
}
}
