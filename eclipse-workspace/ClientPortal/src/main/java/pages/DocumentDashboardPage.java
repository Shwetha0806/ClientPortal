package pages;

import org.openqa.selenium.WebDriver;

import base.BasePage;
import locators.DocumentDashboardLocators;

public class DocumentDashboardPage extends BasePage {
	
		public DocumentDashboardPage(WebDriver driver) {
		super(driver);
	}
	
	// Go_Back_Button
	public boolean isGoBackVisible() {
        return isVisible(DocumentDashboardLocators.GO_BACK_BUTTON);
    }
	
	public void clickGoBack() {
        click(DocumentDashboardLocators.GO_BACK_BUTTON);
    }
	
	
	// Search and filter
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
	 
	 	// COUNTING THE FILTER DOCUMENT
	 
	 	public int getDocumentCount() {
	 		 return driver.findElements(DocumentDashboardLocators.DOCUMENT_LIST).size();
		}
	 
	 	public int getFilteredDocumentCount(String searchText, String filterName) throws InterruptedException {

	 	    search(searchText);
	 	    selectFilter(filterName);
	 	    
	 	   waitForVisibility(DocumentDashboardLocators.DOCUMENT_LIST);
	 	  Thread.sleep(10000);
	 	    return getDocumentCount();
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
