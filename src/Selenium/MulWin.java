package Selenium;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MulWin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseurl="https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp";
		driver.get(baseurl);
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		String mainwin=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		java.util.Iterator<String> itr=s.iterator();
		
		while(itr.hasNext())
		{
			String childwin=itr.next();
			if(!mainwin.equals(childwin))
			{
				driver.switchTo().window(childwin);
				System.out.println(driver.getTitle());
			}
		}
		Thread.sleep(5000);
		driver.switchTo().window(mainwin);
		System.out.println(driver.getTitle());
	}
}