package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addemployee {
	 WebDriver ldriver;
		public addemployee(WebDriver rdriver) {
			ldriver=rdriver;
			PageFactory.initElements( rdriver,this);
			
		}
	@FindBy(name="empcode")
	WebElement empid;
	@FindBy(name="firstName")
	WebElement firstName;
	@FindBy(name="lastName")
	WebElement lastName;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="department")
	WebElement department;
	@FindBy(name="gender")
	WebElement gender;
	@FindBy(name="dob")
	WebElement dob;
	@FindBy(name="mobileno")
	WebElement mobileno;
	@FindBy(name="country")
	WebElement country;
	@FindBy(name="address")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirmpassword")
	WebElement cnfpassword;
	@FindBy(name="add")
	WebElement addbutton;

	
	public void setempid(String eid) {
		empid.sendKeys(eid);
		}
		public void setfname(String fname) {
			firstName.sendKeys(fname);;
		}
		public void setlname(String lastName) {
			this.lastName.sendKeys(lastName);
		}
		public void setemail(String email) {
			this.email.sendKeys(email);
		}
		public void setdepartment(String department) {
			
			Select sc=new Select(this.department);
			sc.selectByVisibleText(department);
			
		}
		public void setgender(String gender) {
			Select sc=new Select(this.gender);
			sc.selectByVisibleText(gender);
		}
		public void setdob(String dd,String mm,String yyyy) {
			dob.sendKeys(dd);
			dob.sendKeys(mm);
			dob.sendKeys(yyyy);
			}
		public void setmobno(String mno) {
			mobileno.sendKeys(mno);
		}
		public void setcountry(String country) {
			this.country.sendKeys(country);
		}
		public void setaddress(String address) {
			this.address.sendKeys(address);
		}
		public void setcity(String city) {
			this.city.sendKeys(city);
		}
		public void setpassword(String password) {
			this.password.sendKeys(password);
			
		}
		public void setcnfpass(String cnfpasssword) {
			this.cnfpassword.sendKeys(cnfpasssword);
		}
		public void addclick() {
			addbutton.click();
		}
	

}
