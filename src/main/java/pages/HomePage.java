package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

import base.Page;

public class HomePage extends Page {
	
	
	
	public LoginPage goToSignin() throws InterruptedException {
		Thread.sleep(3000);
		click("loginLink_CSS");
		return new LoginPage();
	}
	
public void goToSignup() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.className("signUp")).click();
		
	}
	
public void validateFooterLinks() {
	
}


}
