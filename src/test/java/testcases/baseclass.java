package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.readconfigs;

public class baseclass {
	WebDriver driver;
	readconfigs figs=new readconfigs();
//	String url=figs.getapplicationurl();
//			String username=figs.getusername();
//			String pwd=figs.getpassword();
	@BeforeClass
  public void setup() {
	 	ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		 driver = new ChromeDriver(options);
		
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(figs.getapplicationurl());
		  
  }
	
 
}
