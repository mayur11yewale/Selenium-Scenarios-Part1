package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseurl="https://patrickhlauke.github.io/recaptcha/";
		driver.get(baseurl);
		switchtoframe(driver);
		//driver.findElement(By.className("recaptcha-checkbox-border")).click();
	}
	
	public static void switchtoframe(WebDriver driver)
	{
		int count=driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);
		//for(int i=0;i<1;i++)
		//{
			driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/iframe[1]")));
			//System.out.println(count);
			int x=driver.findElements(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).size();
			System.out.println(x);
			if(x>0)
			{
				driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
				//break;
			}
		//}
		driver.switchTo().defaultContent();
		}
	

}
