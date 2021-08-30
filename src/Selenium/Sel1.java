package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class Sel1 {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseUrl="http://demo.guru99.com/test/newtours/";
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle="";
		driver.get(baseUrl);
		actualTitle =driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		driver.close();
	}
}
