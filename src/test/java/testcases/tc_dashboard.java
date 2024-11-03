package testcases;

import org.testng.annotations.Test;

import pageobject.dashboard;
import pageobject.pageobjectlogins;

public class tc_dashboard extends baseclass {
	@Test
	public void addemp() {
		pageobjectlogins pg=new pageobjectlogins(driver);
		pg.setusername(figs.getusername());
		pg.setpassword(figs.getpassword());
		pg.setbutton();
		dashboard ds=new dashboard(driver);
//		ds.clickemp();
//		ds.addemp();
		ds.findnameandclick("rocky kumar");
	}

}
