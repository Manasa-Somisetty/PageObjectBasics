package testCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

import utilities.TestUtil;

public class LoginTest extends BaseTest{
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data) throws InterruptedException {
		
		HomePage home=new HomePage();
		LoginPage loginObj=home.goToSignin();
		
		loginObj.login(data.get("username"),data.get("password"));
		
		
	}

}
