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

public class numoflink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseurl="https://www.toolsqa.com/selenium-webdriver/switch-commands/";
		driver.get(baseurl);
		//System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footdriver=driver.findElement(By.id("footer"));
		//System.out.println(footdriver.findElements(By.tagName("a")).size());
		
		WebElement columnd=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/footer[1]/div[1]/div[1]/div[1]/section[2]/div[2]"));
		System.out.println(columnd.findElements(By.tagName("a")).size());
		int x=columnd.findElements(By.tagName("a")).size();
		for(int i=0;i<x;i++)
		{
			String clickon=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnd.findElements(By.tagName("a")).get(i).sendKeys(clickon);
			String mainwin=driver.getWindowHandle();
			Set<String> s1=driver.getWindowHandles();
			java.util.Iterator<String> itr= s1.iterator();
			while(itr.hasNext())
			{
				String childwin=itr.next();
				if(!mainwin.equals(childwin))
				{
					driver.switchTo().window(childwin);
					System.out.println(driver.getTitle());
				}
				
			}
			driver.switchTo().window(mainwin);
		}
		
		//driver.quit();
	}
}
