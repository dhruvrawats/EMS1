package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pageobject.dynamictable;

import org.openqa.selenium.*;
public class tap_dynamiclogin {
@Test
public void checkname() throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(options);   // launch the browser0
			
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	
	dynamictable dc = new dynamictable(driver);
	Thread.sleep(3000);
	dc.findnameandclick("Wireless Earbuds");
	
}
}
