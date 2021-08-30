package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String baseurl="https://www.google.com/";
		driver.get(baseurl);
		Actions a=new Actions(driver);
		//WebElement move=driver.findElement(By.xpath("//input[@name='q']"));
		//a.moveToElement(move).contextClick().build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//input[@name='q']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@name='q']"))).keyDown(Keys.LEFT_SHIFT).sendKeys("fyfy").doubleClick().build().perform();
	}

}
