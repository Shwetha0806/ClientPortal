package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import locators.CreateDocumentLocators;


public class CreateDocument extends BasePage{
	
	public CreateDocument(WebDriver driver) {
		super(driver);
	}

		
		// ************ Add Card ***************	
		 public boolean isAddCard() {
			 return isVisible(CreateDocumentLocators.ADD_CARD);
		 }  
		 
		 // ************* Click Add Button **************	 
		 public void clickAddButton() {
			 	click(CreateDocumentLocators.ADD_BUTTON);
		 }
		 
		 // ************** Add Text *****************		 
		 public boolean isAddtext() {
		        return isVisible(CreateDocumentLocators.ADD_TEXT);
		 }
		 
		// ************** Verify popup ***************
	    public void isCreateDocumentPopupDisplayed() {
	        waitForVisibility(CreateDocumentLocators.CREATE_DOCUMENT_POPUP);
	    }

	    // ************* Enter Title ***************
	    public void enterTitle(String title) {
	        type(CreateDocumentLocators.CREATEDOCUMENT_TITLEINPUT, title);
	    }

	    // ************ Enter Description ***********
	    public void enterDescription(String desc) {
	        type(CreateDocumentLocators.CREATEDOCUMENT_TEXTAREA, desc);
	    }

	    // ************ Select Access Type ***********
	    public void selectAccessType(String type) {

	        switch (type) {
	            case "Open Access":
	                safeClick(CreateDocumentLocators.CREATEDOCUMENT_OPEN_ACCESS);
	                break;

	            case "Register":
	                safeClick(CreateDocumentLocators.CREATEDOCUMENT_REGISTER);
	                break;

	            case "Private":
	                safeClick(CreateDocumentLocators.CREATEDOCUMENT_PRIVATE);
	                break;
	        }
	    }

	    // *************** Add Tag *****************
	    public void addTag(String tagName) {

	        isVisible(CreateDocumentLocators.CREATEDOCUMENT_TAGS_CONTAINER);
	                   
	        type(CreateDocumentLocators.CREATEDOCUMENT_TAG_INPUT, tagName);

	        waitForVisibility(CreateDocumentLocators.CREATEDOCUMENT_TAGS_DROPDOWN);

	        By checkbox = By.xpath("//span[normalize-space()='" + tagName + "']/ancestor::label//input[@class='checkbox-input']");
	       
	        clickJS(checkbox);
	        
	        smallWait();
	        
	        clickOutside();

	        By selectedTag = By.xpath("//span[contains(@class,'category-tag') and text()='" + " "+tagName+" " + "']");

	      //  waitForVisibility(selectedTag);   
	        
	        isVisible(selectedTag);
	        
	    }

	    // **************** Upload Document ****************
	    public void uploadDocument(String filePath1) throws AWTException  {
	    	
	    	click(CreateDocumentLocators.DOCUMENT_BROWSER_FILE); 	
	    	smallWait(); 
	    		    	
	    	StringSelection selection = new StringSelection(filePath1);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	        
	    	// Robot Class
	    	Robot rb =new Robot();
	    	
	    	rb.delay(1000);
	    	
	    	// CTRL + V (Past file)
	    	rb.keyPress(KeyEvent.VK_CONTROL);
	    	rb.keyPress(KeyEvent.VK_V);
	    	rb.keyRelease(KeyEvent.VK_V);
	    	rb.keyRelease(KeyEvent.VK_CONTROL);
	    	
	    	// wait before enter
	    	rb.delay(1000);
	    	
	    	// press enter
	    	rb.keyPress(KeyEvent.VK_ENTER);
	    	rb.keyRelease(KeyEvent.VK_ENTER);
	    	
	    	
	    }

	    // *************** Upload Thumbnail **************
	    public void uploadThumbnail(String filePath2) throws AWTException {
	    	
	    	clickJS(CreateDocumentLocators.THUMBNAIL_BROWSER_FILE);
	    	smallWait();
	    	
	    	// copy file path
	    	StringSelection selection2= new StringSelection(filePath2);
	    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection2, null);
	    	
	    	Robot rb =new Robot();
	    	
	    	// Past
	    	rb.delay(1000);
	    	rb.keyPress(KeyEvent.VK_CONTROL);
	    	rb.keyPress(KeyEvent.VK_V);
	    	rb.keyRelease(KeyEvent.VK_V);
	    	rb.keyRelease(KeyEvent.VK_CONTROL);
	    	
	    	rb.delay(1000);
	    	
	    	// Enter
	    	rb.keyPress(KeyEvent.VK_ENTER);
	    	rb.keyRelease(KeyEvent.VK_ENTER);
	    		
	             
	    }
	  
		 // ************ Capture Thumbnail Checkbox ***********
		 public boolean isCaptureThumbnailChecked() {
		        return isSelected(CreateDocumentLocators.CAPTURE_THUMBNAIL_DOCUMENT);
		    }
		 
		 
		 // ************ Get Available date ************
		 public boolean isAvailableDateChecked() {
		        return isSelected(CreateDocumentLocators.SAME_PUBLISH_DATE);
		    }
		 
		 
		 /*
		 // ************ Get Available date ***********
		 public String getAvailableDate() {
		        return driver.findElement(DocumentDashboardLocators.DATE_FIELD).getAttribute("value");
		    }*/
		 
		 
	    // ************** Select Dates ******************
	    public void selectStartDate(String date) {
	        type(CreateDocumentLocators.CREATEDOCUMENT_STARTDATE, date);
	    }

	    public void selectEndDate(String date) {
	        type(CreateDocumentLocators.CREATEDOCUMENT_ENDDATE, date);
	    }

	    // ************** Save as Draft ***************
	    public void clickSaveAsDraft() {
	        safeClick(CreateDocumentLocators.SAVE_AS_DRAFT);
	    }

	    // ************* Publish ******************
	    public void clickPublish() {
	        safeClick(CreateDocumentLocators.PUBLISH);
	    }

	    // ************** Cancel *****************
	    public void clickCancel() {
	        safeClick(CreateDocumentLocators.CREATEDOCUMENT_CANCEL);
	    }
		
	    // ************ Confirmation PopupDisplayed ***********
	    public boolean isConfirmationPopupDisplayed() {	    	
	        return isVisible(CreateDocumentLocators.CONFIRMATION_BOX);
	        
	    }
	    
	    // ************* Confirmation Message ****************
	    public String getConfirmationMessage() {
	        return getText(CreateDocumentLocators.CONFIRMATION_MESSAGE);
	    }
	    
	    // ************ Click Yes Publish **************
	    public void clickYesPublish() {
	        click(CreateDocumentLocators.YES_PUBLISH_BUTTON);
	    }
	    
	    // *********** Click Confirmation Cancel ***********
	    public void clickConfirmationCancel() {
	        click(CreateDocumentLocators.CANCEL_BUTTON);
	    }
	    
	    // ************* Wait for Popup Close ***********
	    public void waitForConfirmationPopupToClose() {
	        waitForInvisibility(CreateDocumentLocators.CONFIRMATION_BOX);
	    }
	    
	    
	    // ************* Success Message **********
	    public String getSuccessMessageDisplayed() {
	    	smallWait();
	    	return getText(CreateDocumentLocators.SUCCESS_MESSAGE);
	    	
	    }
	    // *********** Document Displayed **********
	    public boolean isDocumentDisplayed(String docName) {
	        By doc = By.xpath("//h3[contains(@class,'title') and text()='" + docName + "']");
	        return isVisible(doc);
	    }
	    
	    // *********** Assign Customer *****************
	    public void isAssignCustomer(String CustomerName) {
	    	
	    	click(CreateDocumentLocators. ASSIGN_CUSTOMER);
	    	
	    	isVisible(CreateDocumentLocators.ASSIGN_CUSTOMER_TITLE);
	    	
	    	type(CreateDocumentLocators.SEARCH_CUSTOMER_INPUT,CustomerName);
	    	
	    	waitForVisibility(CreateDocumentLocators.CUSTOMER_DROPDOWN_LIST);
	    	
	    	By clickCustomer = By.xpath("//span[normalize-space()='" + CustomerName + "']/ancestor::div[@class='person-item ng-star-inserted']");
		       
	        clickJS(clickCustomer);
	        
	        smallWait();
	        	       

	        By personTag = By.xpath("//span[contains(@class,'person-tag') and text()='" + " "+CustomerName+" " + "']");

	      //  waitForVisibility(selectedTag);   
	        
	        isVisible(personTag);    	
	    	
	    }
	    
	    // ************ Downloadable Viewrs ***********
	    public void isDownloadableViewrs() {
	    	
	    	click(CreateDocumentLocators. DOWNLOADEBLE_VIEWERS );
	    	
	    	isVisible(CreateDocumentLocators.DOWNLOADEBLE_VIEWERS_TITLE);
	    	
	    	clickJS(CreateDocumentLocators.DOWNLOADDABLE_CHECKBOX);
	    	
	    }
}
