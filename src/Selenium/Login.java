package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseurl="http://demo.guru99.com/test/login.html";
		driver.get(baseurl);
		WebElement email=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("passwd"));
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		email.clear();
		password.clear();

		System.out.println("Fields is cleared");
		
		WebElement login=driver.findElement(By.id("SubmitLogin"));
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		login.click();
		System.out.println("User is login");
		
	}

}
