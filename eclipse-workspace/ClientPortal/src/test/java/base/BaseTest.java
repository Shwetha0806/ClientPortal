package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pages.DocumentDashboardPage;
import pages.FolderDashboardPage;
import pages.LoginPage;
public class BaseTest {

    protected static WebDriver driver;
    protected static LoginPage login;
    protected static FolderDashboardPage dashboard;
    protected static DocumentDashboardPage documentDashboard;
    
    @BeforeSuite
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();      
        driver.get("https://clientportal.volworks.com/#/");
        
        login = new LoginPage(driver);
        documentDashboard = new DocumentDashboardPage(driver);
        
    }

    @AfterSuite
    public void tearDown() {
    	
        driver.quit();
    
}
}