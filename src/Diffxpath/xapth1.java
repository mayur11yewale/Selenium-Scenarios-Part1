package Diffxpath;

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
public class xapth1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin#identifier");
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
		//relative xpath
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc");
				
		//absolute xpath
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("abc");
		
		//single attribute xpath
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("abc");
		
		//multiple attribute
		driver.findElement(By.xpath("//input[@type='email'][@class='whsOnd zHQkBf']")).sendKeys("xyz");
		
		//using and operator
		driver.findElement(By.xpath("//input[@type='email' and @class='whsOnd zHQkBf']")).sendKeys("abf");
		
		//using or operator
		driver.findElement(By.xpath("//input[@type='email' or @class='whsOnd zHQkBf']")).sendKeys("guu");
		
		//using contains
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("yfyf");
		
		//using startwith
		driver.findElement(By.xpath("//input[starts-with(@type,'emai')]")).sendKeys("aesr");
		
		//finding any text using text()
		String str=driver.findElement(By.xpath("//*[text()='Sign in']")).getText();
		System.out.println(str);
		
		//finding last type=text element using last()
		driver.findElement(By.xpath("(//input[@type='text'])[last()]")).sendKeys("gyg");
		
		//finding position()
		driver.findElement(By.xpath("(//input[@type='text'])[position()=2]")).sendKeys("ygygy");
		
		//using index
		driver.findElement(By.xpath("//input[2]")).sendKeys("awar");
		
		//using following
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[@name='lastName']")).sendKeys("rvghbj");
		
		//using preceding
		driver.findElement(By.xpath("//input[@name='lastName']/preceding::input[@type='text']")).sendKeys("rtfygh");
	}

}
