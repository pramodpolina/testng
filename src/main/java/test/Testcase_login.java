package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Browsersetup;
import pages.Login;

public class Testcase_login extends Browsersetup{
	Login login;
	
      @BeforeMethod
	 public void pages() {
		 login = new Login(driver);
	 }
	
      @Test
	 public void validlogin() throws InterruptedException  {
		 login.enterusername("username");
		 login.enterpassword("Password");
		 Thread.sleep(5000);
		 login.clicklogin();
	 }
}
