package testCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.Page;
import pages.ZohoAppPage;
import pages.crm.accounts.AccountsPage;
import pages.crm.accounts.CreateAccountPage;
import utilities.TestUtil;

public class CreateAccountTest extends BaseTest {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String,String> data) throws InterruptedException {
		ZohoAppPage appPage= new ZohoAppPage();
		appPage.goToCRM();
		AccountsPage acntsPage = Page.menu.goToAccounts();
		CreateAccountPage createAccnt =acntsPage.goToCreateAccount();
		createAccnt.createAccount(data.get("accountName"));
	}
	


}
