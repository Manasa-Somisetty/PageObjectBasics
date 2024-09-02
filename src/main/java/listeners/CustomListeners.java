package listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import base.Page;
import utilities.TestUtil;



public class CustomListeners extends Page implements ITestListener {
	
	public void onTestSuccess(ITestResult arg0) {
		
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.log(Status.PASS, arg0.getName().toUpperCase()+"Passed");
		test.pass("passed", MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+TestUtil.screenshotName).build());
		
	
		repo.flush();
		 
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.log(Status.FAIL, arg0.getName().toUpperCase()+"Failed with exception"+arg0.getThrowable().getMessage());
		test.fail("failed", MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+TestUtil.screenshotName).build());
		repo.flush();
	
		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+"><img src="+TestUtil.screenshotName+" height=200 width=200></img></a>");
		
	}
	
	
	public void onTestStart(ITestResult arg0){
		
		test=repo.createTest(arg0.getName());
		
		if (!TestUtil.isTestRunnable(arg0.getName(), excel)) {
			
			throw new SkipException("Skipping the test "+arg0.getName()+" as runmode is no");
		}
		
		
	}
	
	

	public void onTestSkipped(ITestResult arg0) {
		
		test.log(Status.SKIP, arg0.getName().toUpperCase()+"skipped test as runmode is no");
		repo.flush();
	}
	
}
