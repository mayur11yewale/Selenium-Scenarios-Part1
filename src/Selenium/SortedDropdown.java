package Selenium;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SortedDropdown {
	
	@Test
	public void run()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://semantic-ui.com/modules/dropdown.html");
	Select s=new Select(driver.findElement(By.name("skills")));
	List<WebElement> ele=s.getOptions();
	/*driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
	List<WebElement> ele=driver.findElements(By.tagName("ul"));*/
	ArrayList<String> list=new ArrayList<String>();
	
	for(int i=0;i<ele.size();i++)
	{
		list.add(ele.get(i).getText());
	}
	ArrayList<String> list1=list;
	Collections.sort(list1);
	try{
	Assert.assertEquals(list, list1);
	System.out.println("Dropdown is sorted");
	}catch(AssertionError e)
	{
		System.out.println("Dropdown is not sorted");
		 throw e;
		
	}
}
}
