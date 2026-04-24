package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BaseTest;

public class ExtentReportManager implements ITestListener{
	public ExtentSparkReporter sparkReporter;  //UI of the report
	public ExtentReports extent;  //populate common info on the report
	public ExtentTest test; //creating test case enetries in the report and update status of the test methods
	
	String repName;
	
	public void onStart(ITestContext testContext) {
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());  //time Stamp		
		repName = "Test-Report-" + timeStamp+ ".html";
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html"); //specify location of the repoart
		
		sparkReporter.config().setDocumentTitle("ClientPortal Automation Report"); //Title of report
		sparkReporter.config().setReportName("ClientPortal Functional Testing"); //name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Project Name","ClientPortal");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester Name","Shwetha G");     //System.getProperty("user.name"));
		extent.setSystemInfo("OS","Windows11");
		extent.setSystemInfo("Browser Name","Edge");
		
		
		/*String os = testContext.getCurrentXmlTest().getParameter("os"); 
		extent.setSystemInfo("Operating System", os); */
		
		List<String> includedGroups = testContext.getCurrentXmlTest().getIncludedGroups();
		if(!includedGroups.isEmpty()) {
			extent.setSystemInfo("Groups",includedGroups.toString());
		}
		
		
	}
	
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());   // create a new enty in the report
		test.assignCategory(result.getMethod().getGroups());     // to display group in report
		test.log(Status.PASS,result.getName()+ "\t got successfully executed"); //update status 
	}
	
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());  
		test.assignCategory(result.getMethod().getGroups());
		
		test.log(Status.FAIL, result.getName()+"\t got failed");  
		test.log(Status.INFO, result.getThrowable().getMessage());  
		
		try {
			String imgPath = new BaseTest().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgPath);
		}
		catch(IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName()); 
		test.assignCategory(result.getMethod().getGroups());
		
		test.log(Status.SKIP,result.getName()+ "\t got skipped"); 
		test.log(Status.INFO, result.getThrowable().getMessage()); 
	}
	
	public void onFinish(ITestContext context) {
		
		extent.flush();
		
		String pathofExtentReport = System.getProperty("user.dir")+"\\reports\\"+repName;
		File extentReport = new File(pathofExtentReport);
		
		try {
			Desktop.getDesktop().browse(extentReport.toURI());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
