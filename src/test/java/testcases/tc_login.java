package testcases;

import org.testng.annotations.Test;

import pageobject.pageobjectlogins;

public class tc_login extends baseclass {
	@Test
	public void loginadmin() {
		pageobjectlogins pg=new pageobjectlogins(driver);
		pg.setusername(figs.getusername());
		pg.setpassword(figs.getpassword());
		pg.setbutton();
	}

}
