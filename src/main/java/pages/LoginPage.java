package pages;

import base.Page;

public class LoginPage extends Page {
	
	
	
	public ZohoAppPage login(String username, String pwd) throws InterruptedException {
		
		Thread.sleep(2000);
		type("loginEmail_CSS",username);
		click("nextButton_CSS");
		Thread.sleep(2000);
		type("loginPwd_CSS",pwd);
		click("signin_CSS");
		//Thread.sleep(2000);
		return new ZohoAppPage();
	
	}

}
