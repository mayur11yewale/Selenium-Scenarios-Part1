package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maxwin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("session");
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//[@id='title0000']")).isDisplayed();
		driver.findElement(By.xpath("//[@id='title0000']")).isSelected();
		driver.findElement(By.xpath("//[@id='title0000']")).isEnabled();
		
	}

}
