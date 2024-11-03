package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class pageobjectlogins {
    WebDriver ldriver;
	public pageobjectlogins(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
		
	}
	@FindBy(name ="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(id="form_submit")
	WebElement button;
	
	public void setusername(String name) {
		username.sendKeys(name);
		
	}
	public void setpassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void setbutton() {
		button.click();
	}

}
