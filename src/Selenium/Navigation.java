package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.cleartrip.com/");
		driver.navigate().to("https://www.cleartrip.com/");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.getCurrentUrl();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

}
