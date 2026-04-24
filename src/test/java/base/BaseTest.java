package base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pages.CreateDocument;
import pages.DocumentDashboardPage;
import pages.FolderDashboardPage;
import pages.LoginPage;
public class BaseTest {

    protected static WebDriver driver;
    protected static LoginPage login;
    protected static FolderDashboardPage dashboard;
    protected static DocumentDashboardPage documentDashboard;
    protected static CreateDocument createDocument;
    
    @BeforeSuite(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();      
        driver.get("https://clientportal.volworks.com/#/");
        
        login = new LoginPage(driver);
        documentDashboard = new DocumentDashboardPage(driver);
        createDocument =new CreateDocument(driver);
        
    }
    
   

    @AfterSuite
    public void tearDown() {
    	
        driver.quit();
    
}
    
    // ************** Capture Screen Shot ************
    public String captureScreen(String tname) throws IOException{
    	
    	String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
    	
    	TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
    	File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
    	
    	String targetFilePath = System.getProperty("user.dir")+"\\screenshots" +tname+ "_" +timeStamp +".png";
    	File targetFile =new File(targetFilePath);
    	
    	sourceFile.renameTo(targetFile);
    	return targetFilePath;
    	
    }
}