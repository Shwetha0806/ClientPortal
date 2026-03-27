package base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
    protected WebDriverWait wait;


    
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void type(By locator, String text) {
       WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    		element.clear();
       		element.sendKeys(text);
    }
    
    protected List<WebElement> waitForElements(By locator) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    protected List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }
    protected WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void clickJS(By locator) {
    	WebElement element = waitForVisibility(locator);
        
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
    }


    // Click outside (close dropdown )
    public void clickOutside() {
        ((JavascriptExecutor) driver).executeScript("document.body.click();");
    }
    
    public boolean isVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }

    public String getText(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }
    
    //  Safe Click (for interception issue)
    public void safeClick(By locator) {
        try {
            click(locator);
        } catch (Exception e) {
        	WebElement element = waitForVisibility(locator);
            
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", element);

            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", element);
        }
    }
    
    // Wait for count change
    public int waitForUpdatedCount(By locator, int oldCount) {
        wait.until(driver -> driver.findElements(locator).size() != oldCount );
        return driver.findElements(locator).size();
    }

    // Get count
    public int getCount(By locator) {
        return driver.findElements(locator).size();
    }
    
    // Small wait (optional)
    public void smallWait() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
    }
}
