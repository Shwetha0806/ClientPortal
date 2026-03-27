package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import locators.DocumentDashboardLocators;

public class DocumentDashboardPage extends BasePage {
	
		public DocumentDashboardPage(WebDriver driver) {
		super(driver);
	}
	
	// ==================== Go_Back_Button ========================
		
	public boolean isGoBackVisible() {
        return isVisible(DocumentDashboardLocators.GO_BACK_BUTTON);
    }
	
	public void clickGoBack() {
        click(DocumentDashboardLocators.GO_BACK_BUTTON);
    }
	
	
	// ================= Search and filter ======================
	
	public void search(String value) {
        type(DocumentDashboardLocators.SEARCH_BOX, value);
        
    }
	
	 public void selectFilter(String filterName) {
		 safeClick(DocumentDashboardLocators.FILTER_ICON);

	        switch (filterName) {
	            case "All":
	            	 safeClick(DocumentDashboardLocators.ALL_OPTION);
	                break;
	                
	            case "Title":
	            	 safeClick(DocumentDashboardLocators.TITLE_OPTION);
	                break;
	                
	            case "Description":
	            	 safeClick(DocumentDashboardLocators.DESCRIPTION_OPTION);
	                break;
	                
	            case "Tag":
	            	 safeClick(DocumentDashboardLocators.TAG_OPTION);
	                break;
	        }

	 }
	 /*
	 	// COUNTING THE FILTER DOCUMENT
	 
	 	public int getDocumentCount() {
	 		 return driver.findElements(DocumentDashboardLocators.DOCUMENT_LIST).size();
		}
	 
	 	public int getFilteredDocumentCount(String searchText, String filterName) throws InterruptedException {

	 	    search(searchText);
	 	    selectFilter(filterName);
	 	   Thread.sleep(20000);
	 	   waitForVisibility(DocumentDashboardLocators.DOCUMENT_LIST);
	 	  
	 	    return getDocumentCount();
	 	}
	 	*/
	
	public int getCountForFilter(String filterName) {

		int oldCount = getCount(DocumentDashboardLocators.DOCUMENT_LIST);

        selectFilter(filterName);

        return waitForUpdatedCount(DocumentDashboardLocators.DOCUMENT_LIST, oldCount);
	}
	
	public void countAllFilters() {
	    String[] filters = {"All", "Title", "Description", "Tag"};
	    for (String filter : filters) {
	        int count = getCountForFilter(filter);
	        System.out.println(filter + " Count: " + count);
	    }
	}
	
	// ================= CREATE DOCUMENT ====================
	
	 public boolean isAddCard() {
		 return isVisible(DocumentDashboardLocators.ADD_CARD);
	 }  
	 
	 public void clickAddButton() {
		 	click(DocumentDashboardLocators.ADD_BUTTON);
	 }
	 
	 public boolean isAddtext() {
	        return isVisible(DocumentDashboardLocators.ADD_TEXT);
	 }
	 
	// Verify popup
    public void isCreateDocumentPopupDisplayed() {
        waitForVisibility(DocumentDashboardLocators.CREATE_DOCUMENT_POPUP);
    }

    // Enter Title
    public void enterTitle(String title) {
        type(DocumentDashboardLocators.CREATEDOCUMENT_TITLEINPUT, title);
    }

    // Enter Description
    public void enterDescription(String desc) {
        type(DocumentDashboardLocators.CREATEDOCUMENT_TEXTAREA, desc);
    }

    // Select Access Type
    public void selectAccessType(String type) {

        switch (type) {
            case "Anonymous":
                safeClick(DocumentDashboardLocators.CREATEDOCUMENT_ANONYMOUS);
                break;

            case "Registered":
                safeClick(DocumentDashboardLocators.CREATEDOCUMENT_REGISTER);
                break;

            case "Private":
                safeClick(DocumentDashboardLocators.CREATEDOCUMENT_PRIVATE);
                break;
        }
    }

    // Add Tag
    public void addTag(String tagName) {

        isVisible(DocumentDashboardLocators.CREATEDOCUMENT_TAGS_CONTAINER);
        
        type(DocumentDashboardLocators.CREATEDOCUMENT_TAG_INPUT, tagName);

        waitForVisibility(DocumentDashboardLocators.CREATEDOCUMENT_TAGS_DROPDOWN);

        By checkbox = By.xpath("//span[normalize-space()='" + tagName +"']/ancestor::label");

        clickJS(checkbox);
        
        smallWait();
        
        clickOutside();
        
        

        By selectedTag = By.xpath("//span[contains(@class,'category-tag') and normalize-space()='" + tagName + "']");

        waitForVisibility(selectedTag);   
        
    }

    // Upload Document
    public void uploadDocument(String filePath) {
        type(DocumentDashboardLocators.DOCUMENT_FILETYPE,filePath);
            
    }

    // Upload Thumbnail
    public void uploadThumbnail(String filePath) {
        type(DocumentDashboardLocators.THUMBNAIL_FILETYPE,filePath);
             
    }

    // Select Dates
    public void selectStartDate(String date) {
        type(DocumentDashboardLocators.CREATEDOCUMENT_STARTDATE, date);
    }

    public void selectEndDate(String date) {
        type(DocumentDashboardLocators.CREATEDOCUMENT_ENDDATE, date);
    }

    // Save as Draft
    public void clickSaveAsDraft() {
        safeClick(DocumentDashboardLocators.SAVE_AS_DRAFT);
    }

    // Publish
    public void clickPublish() {
        safeClick(DocumentDashboardLocators.PUBLISH);
    }

    // Cancel
    public void clickCancel() {
        safeClick(DocumentDashboardLocators.CREATEDOCUMENT_CANCEL);
    }
	
	  // ============== PROFILE ACTIONS ================

	    public void openProfileDropdown() {
	         clickJS(DocumentDashboardLocators.PROFILE_TRIGGER);
	        isVisible(DocumentDashboardLocators.PROFILE_DROPDOWN);
	    }

	    public String getProfileTitle() {
	        return getText(DocumentDashboardLocators.PROFILE_TITLE);
	    }

	    public boolean isProfileAccessLogsDisplayed() {
	        return isVisible(DocumentDashboardLocators.PROFILE_ACCESS_LOGS);
	    }

	    public boolean isProfilePublicDocumentLogDisplayed() {
	        return isVisible(DocumentDashboardLocators.PROFILE_PUBLIC_DOCUMENT_LOG);
	    }

	    public boolean isProfileRegistratedUsersDisplayed() {
	        return isVisible(DocumentDashboardLocators.PROFILE_REGISTERED_USERS);
	    }

	    public boolean isProfileConfigTagsDisplayed() {
	        return isVisible(DocumentDashboardLocators.PROFILE_CONFIG_TAGS);
	    }

	    public boolean isProfileSendEmailDisplayed() {
	        return isVisible(DocumentDashboardLocators.PROFILE_SEND_EMAIL);
	    }
	    
	    public void clickLogout() {
	        openProfileDropdown();
	        isVisible(DocumentDashboardLocators.LOGOUT);
	        click(DocumentDashboardLocators.LOGOUT);
	    }
	    

}
