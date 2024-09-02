package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.crm.accounts.AccountsPage;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver=driver;
	}

	public void goToHome() {
		
	}
	
	public void goToLeads() {
		
	}
	
	public void goToContacts() {
		
	}
	public AccountsPage goToAccounts() throws InterruptedException {
		
//		for(String winHandle : driver.getWindowHandles()){
//		    driver.switchTo().window(winHandle);
//		}
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[id='Visible_Accounts'] span")).click();
		return new AccountsPage();

	}
	
	
	public void goToDeals() {
		
	}

	public void signOut() {

	}

}
