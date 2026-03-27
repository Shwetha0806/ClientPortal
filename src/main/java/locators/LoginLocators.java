package locators;

import org.openqa.selenium.By;

public class LoginLocators {
	
	    public static By LOGO = By.xpath("//img[@class='logo']");
	    public static By SUBTITLE = By.xpath("//div[@class='subtitle']");
	    
	    public static By EMAIL = By.xpath("//input[@placeholder='Email']");
	    public static By PASSWORD = By.xpath("//input[@type='password']");
	    public static By LOGIN_BUTTON = By.xpath("//button[contains(text(),'Login')]");
	    
	    public static By LOGIN_BOX = By.xpath("//div[@class='login-box']");
		public static By EYE_PASSWORD = By.xpath("//img[@class='eye-password']");
		public static By EMAIL_ICON = By.xpath("//img[contains(@src,'login-profile')]");
		public static By PWD_ICON = By.xpath("//img[contains(@src,'password-icon')]");
	    public static By LOGIN_WRAPPER = By.xpath("//div[contains(@class,'login-wrapper')]");

	    public static By ERROR_MESSAGE = By.xpath("//*[contains(text(),'Invalid User/Password')]");
	    public static By LOGIN_TOASTER =  By.xpath("//div[contains(text(),'Logged in successfully')]");
	    public static By LOGOUT_TOASTER= By.xpath("//*[contains(text(),'Logged out successfully')]");
		

}
