package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {
	 WebDriver ldriver;
		public dashboard(WebDriver rdriver) {
			ldriver=rdriver;
			PageFactory.initElements( rdriver,this);
			
		}
		@FindBy(xpath = "//*[@id=\"menu\"]/li[2]/a/span")
		WebElement emp;
		@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div/div/div/div/center/a")
		WebElement addemp;
	    @FindBy(xpath = "//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//tr")		
	List<WebElement> tablerows;
	    public void clickemp() {
			emp.click();
		}
		public void addemp() {
			addemp.click();
			
		}
		public void findnameandclick(String namefind) {
			for(int i=1;i<=tablerows.size();i++) {
	WebElement fullname=tablerows.get(i-1).findElement(By.xpath("//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//tr["+i+"]//td[3]//a"));
			String name=fullname.getText();
			if (name.equalsIgnoreCase(namefind)) {
				System.out.println("name found");
				WebElement button=tablerows.get(i-1).findElement(By.xpath("//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//tr["+i+"]//td[7]"));

				button.click();
				break;
			}}
		}
		
}
