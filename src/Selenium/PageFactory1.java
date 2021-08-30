package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFactory1 {

	static WebDriver driver;
	@FindBy(how=How.XPATH,using="//input[@title='Search']")
	static WebElement search;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		PageFactory.initElements(driver,PageFactory1.class);
		driver.get("http://www.google.com");
		search.sendKeys("sdfgh");
	}

}
