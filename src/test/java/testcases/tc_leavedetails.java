package testcases;

import org.testng.annotations.Test;

import pageobject.dashboard;
import pageobject.leavedetails;
import pageobject.pageobjectlogins;


public class tc_leavedetails extends baseclass {
	@Test
	public void setleavedetails() throws InterruptedException {
		pageobjectlogins ls=new pageobjectlogins(driver);
		ls.setusername(figs.getusername());
		ls.setpassword(figs.getpassword());
		ls.setbutton();
	dashboard ds=new dashboard(driver);
	ds.findnameandclick("rocky kumar");
	
	leavedetails ld =new leavedetails(driver);
	ld.setaction();
	Thread.sleep(3000);
	ld.setstatus("Approve");
	ld.setdescription("approve leave");
	ld.setapply();
	
	
	
	
	
	
	}

}
