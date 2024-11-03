package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class leavedetails {


		WebDriver ldriver;
			
			public leavedetails(WebDriver rdriver)
			{
				ldriver = rdriver;
				PageFactory.initElements(rdriver, this);
				
			}
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div/div/div/div/div/table/tbody/tr[8]/td/button")
	WebElement action;
	@FindBy(name="status")
	WebElement sts;
	@FindBy(name="description")
	WebElement des;
	@FindBy(name="update")
	WebElement apply;
	
	public void setaction() {
		action.click();
	}
	public void setstatus(String str) {
		Select sc=new Select(sts);
		sc.selectByVisibleText(str);
	}
	public void setdescription(String desc)
	{    des.sendKeys(desc);  }
	public void setapply() {
		apply.click();
	}
}
