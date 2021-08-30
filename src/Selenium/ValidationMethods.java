package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		boolean ele=driver.findElement(By.id("id")).isDisplayed();
		boolean ele1=driver.findElement(By.id("id")).isEnabled();
		boolean ele2=driver.findElement(By.id("id")).isSelected();
	}

}
