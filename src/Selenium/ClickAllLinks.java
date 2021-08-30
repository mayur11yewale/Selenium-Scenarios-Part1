package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickAllLinks {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String baseurl="http://www.google.com";
	driver.get(baseurl);
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@title='Search']")).submit();
	//driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).click();
	/*WebElement divdriver=driver.findElement(By.xpath("//div[@class='srg']"));
	int x=divdriver.findElements(By.xpath("//a[contains(text(),'Selenium')]")).size();
	System.out.println(x);
	for(int i=0;i<x;i++)
	{
		String clickon=Keys.chord(Keys.CONTROL,Keys.ENTER);
		divdriver.findElements(By.xpath("//a[contains(text(),'Selenium')]")).get(i).sendKeys(clickon);
	}*/
}

}