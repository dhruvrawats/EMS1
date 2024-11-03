package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.testng.annotations.Test;

public class readconfigs {
	Properties pro;
	
String path="C:\\Users\\ASUS\\eclipse-workspace\\selenium\\employee\\configuration\\configs";
public  readconfigs() {
	pro=new Properties();
	try {
		FileInputStream fis=new FileInputStream(path);
		pro.load(fis);
	}
	catch (IOException e) {
		System.out.println("Exception: " + e.getMessage());

		// TODO: handle exception
	}
	}
	@Test
	public String getapplicationurl() {
		String url=pro.getProperty("baseurl");
		return url;
	}
	@Test
	public String getusername(){
		String uname=pro.getProperty("username");
		return uname;
	}
	@Test
	public String getpassword() {
		String pwd=pro.getProperty("password");
		return pwd;
		
	}
}
