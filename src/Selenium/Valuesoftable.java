package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Valuesoftable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samurai\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20312/aus-vs-sl-1st-test-sri-lanka-tour-of-australia-2019");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int x=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		System.out.println(x);
		int count=0;
		for(int i=0;i<x-2;i++)
		{
			String text=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			//System.out.println(text);
			count=count+Integer.valueOf(text);
		}
		String extra=driver.findElement(By.xpath("//div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText();
		int ext=Integer.valueOf(extra);
		System.out.println(count+ext);
	}

}
