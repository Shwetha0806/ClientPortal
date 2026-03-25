package pages;

import org.openqa.selenium.WebDriver;

import base.BasePage;
import locators.LoginLocators;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoginWrapperDisplayed() {
        return isVisible(LoginLocators.LOGIN_WRAPPER);
    }
    
    public boolean isLogoDisplayed() {
        return isVisible(LoginLocators.LOGO);
    }
    
    public boolean isSubTitleDisplayed() {
        return isVisible(LoginLocators.SUBTITLE);
    }

    
    public void enterEmail(String email) {
        type(LoginLocators.EMAIL, email);
    }

    public void enterPassword(String password) {
        type(LoginLocators.PASSWORD, password);
    }

    public void clickLogin() {
        click(LoginLocators.LOGIN_BUTTON);
    }
    
    
    public boolean isLoginBoxDisplayed() {
    	return isVisible(LoginLocators.LOGIN_BOX);
    }
    
    public boolean isEyeIconDisplayed() {
    	return isVisible(LoginLocators.EYE_PASSWORD);
    }
    
    public boolean isEmailIconDisplayed() {
    	return isVisible(LoginLocators.EMAIL_ICON);
    }
    
    public boolean isPasswordIconDisplayed() {
    	return isVisible(LoginLocators.PWD_ICON);
    }
    
    public String getErrorMessage() {
        return getText(LoginLocators.ERROR_MESSAGE);
    }

    public String getLoginSuccessMessage() {
        return getText(LoginLocators.LOGIN_TOASTER);
    }

    public FolderDashboardPage loginToApplication(String email, String password) {

        enterEmail(email);
        enterPassword(password);
        clickLogin();

        return new FolderDashboardPage(driver);
    }
    
    
}
