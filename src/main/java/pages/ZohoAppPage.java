package pages;



import base.Page;
//import pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	
	
	
	public  void goToCRM() throws InterruptedException {
		Thread.sleep(3000);
		
		click("crmLink1_CSS");
	
		//return new CRMHomePage();
	}
	public void goToMail() {
		click("mailLink_XPATH");
		
	}
	public void goToAssist() {
		
	}

}
