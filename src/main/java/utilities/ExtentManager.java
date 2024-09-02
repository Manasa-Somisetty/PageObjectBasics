package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	private static ExtentReports extent;
	
	public static ExtentReports getInstance(){
		if (extent==null) {
			ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\target\\surefire-reports\\extentReport.html");
			extent= new ExtentReports(); 
			extent.attachReporter(extentSparkReporter);
			
			
		}
		
		return extent;
	}


}
 