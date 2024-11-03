package testcases;

import org.testng.annotations.Test;

import pageobject.addemployee;
import pageobject.dashboard;
import pageobject.pageobjectlogins;

public class tc_emp extends baseclass {
	@Test
  public void addemployees() {
	  pageobjectlogins pg=new pageobjectlogins(driver);
		pg.setusername(figs.getusername());
		pg.setpassword(figs.getpassword());
		pg.setbutton();
		dashboard ds=new dashboard(driver);
		ds.clickemp();
		ds.addemp();
		addemployee amp=new addemployee(driver);
		amp.setempid("12345");
		amp.setfname("shivam");
		amp.setlname("kumar");
		amp.setemail("sk123@gmail.com");
		amp.setdepartment("Sales");
		amp.setgender("Other");
		amp.setdob("19", "10", "2024");
		amp.setmobno("7654789876");
		amp.setcountry("india");
		amp.setaddress("azad nagar up");
		amp.setcity("merut");
		amp.setpassword("shivam123@");
		amp.setcnfpass("shivam123@");
		amp.addclick();
  }
}
