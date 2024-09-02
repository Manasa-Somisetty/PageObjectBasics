package rough;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import base.Page;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;
import pages.crm.accounts.AccountsPage;
import pages.crm.accounts.CreateAccountPage;
//import pages.crm.accounts.CreateAccountPage;
public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		HomePage home=new HomePage();
		LoginPage loginObj=home.goToSignin();
		ZohoAppPage appPage=loginObj.login("manasa.voletir@gmail.com","Scientist@1509");
		appPage.goToCRM();
		AccountsPage acntsPage = Page.menu.goToAccounts();
		CreateAccountPage createAccnt =acntsPage.goToCreateAccount();
		createAccnt.createAccount("Manasa");
		

	}

}
