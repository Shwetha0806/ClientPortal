package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class LoginTest extends BaseTest {
	
	//LoginPage login;
	
//	@BeforeMethod
  /*  public void setupPage() {

       driver.get("https://clientportal.volworks.com/#/");
        login = new LoginPage(driver);   
        
    }
*/
    // -------- UI TESTS -------- //

    @Test
    public void verifyLogo() {  	
        Assert.assertTrue(login.isLogoDisplayed(), "Logo not displayed");
    }

    @Test
    public void verifyLoginWrapper() {
        Assert.assertTrue(login.isLoginWrapperDisplayed(), "Login Wrapper not displayed");
    }

    @Test
    public void verifyLoginBox() {
        Assert.assertTrue(login.isLoginBoxDisplayed(), "Login Box not displayed");
    }

    @Test
    public void verifySubTitle() {
        Assert.assertTrue(login.isSubTitleDisplayed(), "Subtitle not displayed");
    }

    @Test
    public void verifyEmailIcon() {
        Assert.assertTrue(login.isEmailIconDisplayed(), "Email icon not displayed");
    }

    @Test
    public void verifyPasswordIcon() {
        Assert.assertTrue(login.isPasswordIconDisplayed(), "Password icon not displayed");
    }

    // -------- LOGIN TESTS -------- //
    @Test(priority = 1)
    public void verifyInvalidLogin() {

        login.loginToApplication("akhil.g@landqtech.com", "Shwetha@0806");

        String actualError = login.getErrorMessage();
        Assert.assertEquals(actualError, "Invalid User/Password", "Error message mismatch");
    }
    
    @Test(priority =2)
    public void verifyValidLogin() {

    	dashboard =login.loginToApplication("shwetha.g@landqtech.com", "Shwetha@0806");
      
    	 Assert.assertTrue(dashboard.isHeaderDisplayed() ,"Login failed - Dashboard not loaded");
    	 
    	 String actualMessage = login.getLoginSuccessMessage();
         Assert.assertEquals(actualMessage, "Logged in successfully", "Login success message mismatch");

    }

   
}
