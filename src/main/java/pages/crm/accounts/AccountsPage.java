package pages.crm.accounts;


import base.Page;

public class AccountsPage extends Page{
	
	public CreateAccountPage goToCreateAccount() throws InterruptedException {
		Thread.sleep(2000);
		click("createAccountBtn_CSS");
		Thread.sleep(2000);
		return new CreateAccountPage();
	}
	
	public void goToImpotrtAccounts() {
		
	}

}
