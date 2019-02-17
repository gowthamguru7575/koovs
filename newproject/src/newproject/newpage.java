package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class newpage {

	
	@Test
	void mytest()
	
	{
		String Keys="webdriver.chrome.driver";
		String values="E:\\SeleniumJava\\Driver\\chromedriver.exe";  
		String Appurl="https://www.myntra.com/login";
	    System.setProperty(Keys, values);
		WebDriver dr= new ChromeDriver();
	    dr.get(Appurl);
	    
	   dr.findElement(By.xpath("//input[@placeholder='Your Email Address']")).sendKeys("gowthameee7575@gmail.com");
	dr.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("gowtham@123");
	dr.findElement(By.xpath("//button[@class='login-login-button']")).click();
	
	Actions a1= new Actions(dr);
	a1.moveToElement(dr.findElement(By.xpath("//a[contains(text(),'Men')]"))).build().perform();
	dr.findElement(By.xpath("//li[@data-reactid='27']//a[@class='desktop-categoryLink'][contains(text(),'T-Shirts')]")).click();
	dr.findElement(By.xpath("//section//li[2]//div[3]//span[1]//span[1]")).click();

	}
}
