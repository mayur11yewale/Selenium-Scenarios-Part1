package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sel4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement> elements=driver.findElements(By.name("name"));
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getAttribute("value"));
		}
	}

}
