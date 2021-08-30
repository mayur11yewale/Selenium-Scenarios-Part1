package Selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Synchronize {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.id("FromTag")).sendKeys("pune");
	driver.findElement(By.id("FromTag")).sendKeys(Keys.DOWN);
	driver.findElement(By.id("FromTag")).sendKeys(Keys.ENTER);
	
	WebDriverWait d=new WebDriverWait(driver,20);
	d.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("abc"))));
	d.until(ExpectedConditions.alertIsPresent());
	d.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.id("abc"))));

	
	/*@SuppressWarnings("deprecation")
	Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
							.withTimeout(30,TimeUnit.SECONDS)
							.pollingEvery(5,TimeUnit.SECONDS)
							.ignoring(NoSuchElementException.class);
	wait1.until(new Function<WebDriver, WebElement>(){
	
		public WebElement apply(WebDriver driver ) {
			return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
		}
	});*/
}
}