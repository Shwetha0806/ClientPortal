package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager1 implements ITestListener {

    private ExtentSparkReporter sparkReporter;
    private ExtentReports extent;
    private ExtentTest test;
    private String reportName;

    // WebDriver reference (set from your BaseTest or test class)
    public static WebDriver driver;

    @Override
    public void onStart(ITestContext context) {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        reportName = "Test-Report-" + timeStamp + ".html";

        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/" + reportName);

        sparkReporter.config().setDocumentTitle("ClientPortal Automation Report");
        sparkReporter.config().setReportName("ClientPortal Functional Testing");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Project Name", "ClientPortal");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester Name", "Shwetha G");//System.getProperty("user.name"));
        extent.setSystemInfo("OS", "Windows11");//System.getProperty("os.name"));
        extent.setSystemInfo("Browser Name", "Edge");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.PASS, "Test Case PASSED: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.FAIL, "Test Case FAILED: " + result.getName());
        test.log(Status.FAIL, result.getThrowable());

        // Capture screenshot on failure
        if (driver != null) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
           // String destPath = System.getProperty("user.dir") + "/reports/screenshots/" + result.getName() + "_" + System.currentTimeMillis() + ".png";
            
            String relativePath = "screenshots/" + result.getName() + "_" + System.currentTimeMillis() + ".png";
            test.addScreenCaptureFromPath(relativePath, result.getName() + " Screenshot");

            try {
                Files.copy(screenshot.toPath(), new File(relativePath).toPath());
                test.addScreenCaptureFromPath(relativePath);
            } catch (IOException e) {
                test.warning("Screenshot attach failed: " + e.getMessage());
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test Case SKIPPED: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
