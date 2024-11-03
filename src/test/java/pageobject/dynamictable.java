package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class dynamictable {
	WebDriver lDriver;
public dynamictable(WebDriver rDriver) {
	
	this.lDriver=rDriver;
	PageFactory.initElements( rDriver,this);
	
}
@FindBy(xpath = "//ul[@class='pagination']//li//a")
List<WebElement> pagination;
@FindBy(xpath = "//table[@id='productTable']//tr")
List<WebElement> tablerows;


public void findnameandclick(String ename) {
	boolean namefound=false;
	for(int pageindex=1;pageindex<=pagination.size();pageindex++) {
		for(int i=1;i<tablerows.size();i++) {
			WebElement fullname=tablerows.get(i-1).findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td[2]"));
//			WebElement fullname =tablerows.get(i-1).findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td[2]"));
			String name=fullname.getText();
			System.out.println(name );
			System.out.println(tablerows.size());//tablerows size is 6 here


		if(name.equalsIgnoreCase(ename)) {
			System.out.println("name found");
			WebElement button = tablerows.get(i-1).findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td[4]//input"));
//			WebElement button = tablerows.get(i-1).findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td[4]//input"));
				button.click();
			namefound=true;
				break;
			}
		}
			if(namefound==true) {break;}
		if(pageindex<pagination.size()) {
				WebElement page=pagination.get(pageindex);
				page.click();
			}
			
	}
		if(namefound==false) {System.out.println("element not found");}
		

	}

}
