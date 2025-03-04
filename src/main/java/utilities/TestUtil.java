package utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;


import base.Page;


public class TestUtil extends Page {

	public static String screenshotName;

	public static void captureScreenshot() throws IOException {
		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,
				new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + screenshotName));
	}

	@DataProvider(name = "dp")

	public Object[][] getData(Method m) {
		String sheetName = m.getName();

		int rows = excel.getRowCount(sheetName);
		int columns = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];
		
		Hashtable<String,String> table=null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			
			table=new Hashtable<String,String>(); 
			
			for (int col = 0; col < columns; col++) {
				
				table.put(excel.getCellData(sheetName, col, 1), excel.getCellData(sheetName, col, rowNum));

				data[rowNum - 2][0] = table;

			}
		}
		return data;

	}

	public static boolean isTestRunnable(String testName, ExcelReader excel) {

		int rows = excel.getRowCount("testsuite");
		for (int rNum = 2; rNum <= rows; rNum++) {
			String testCase = excel.getCellData("testsuite", "TCID", rNum);

			if (testCase.equalsIgnoreCase(testName)) {
				String runmode = excel.getCellData("testsuite", "Runmode", rNum);
				if (runmode.equalsIgnoreCase("y"))
					return true;
				else
					return false;

			}
		}
		
return false;
	}

}
