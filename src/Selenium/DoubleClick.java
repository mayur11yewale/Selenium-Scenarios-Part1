package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/scroll-web-page-using-selenium-webdriver/");
		
		// TODO Auto-generated method stub
		 WebElement ele = driver.findElement(By.cssSelector("html>body>div"));
         //Here I used JavascriptExecutor interface to scroll down to the targeted element
		
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
		         //used doubleClick(element) method to do double click action
		Actions action=new Actions(driver);
		 action.doubleClick(ele).build().perform();
	}

}
