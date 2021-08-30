package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Select1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select s=new Select(driver.findElement(By.name("country")));
		//List<WebElement> s1=s.getAllSelectedOptions();
		List<WebElement> s2=s.getOptions();
		//s.selectByIndex(i);
		//s.selectByValue(i);
		//s.selectByVisibleText(i);
		for(int i=0;i<s2.size();i++)
		{
			System.out.println(s2.get(i).getText());
		}
		driver.close();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
	}

}
