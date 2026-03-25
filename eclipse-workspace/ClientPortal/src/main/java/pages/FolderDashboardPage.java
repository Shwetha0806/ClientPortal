package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;
import locators.FolderDashboardLocators;

public class FolderDashboardPage extends BasePage {
	
	
    public FolderDashboardPage(WebDriver driver) {

        super(driver);
    }
    
    // DYNAMIC LOCATORS

    private By folderNameDynamic(String folderName) {
        return By.xpath("//p[normalize-space()='" + folderName + "']");
    }

    private By threeDotMenu(String folderName) {
        return By.xpath("//p[normalize-space()='" + folderName + "']/ancestor::div[contains(@class,'folder-card')]//button[contains(@class,'three-dot')]");
    }


    // HEADER VERIFICATION

    public boolean isHeaderDisplayed() {
        return isVisible(FolderDashboardLocators.HEADER);
    }

    public boolean isLogoDisplayed() {
        return isVisible(FolderDashboardLocators.LOGO);
    }

    public boolean isProfileIconDisplayed() {
        return isVisible(FolderDashboardLocators.PROFILE_ICON);
    }

    public boolean isFolderContainerDisplayed() {
        return isVisible(FolderDashboardLocators.FOLDER_CONTAINER);
    }

    public boolean isPageTitleDisplayed() {
        return isVisible(FolderDashboardLocators.PAGE_TITLE);
    }

    public boolean isFooterDisplayed() {
        return isVisible(FolderDashboardLocators.FOOTER);
    }

    public boolean isFooterTextDisplayed() {
        return isVisible(FolderDashboardLocators.FOOTER_TEXT);
    }

    public boolean isVersionTextDisplayed() {
        return isVisible(FolderDashboardLocators.VERSION_TEXT);
    }

    // CREATE FOLDER

    public void clickAddButton() {
        click(FolderDashboardLocators.ADD_BUTTON);
    }

    public boolean isCreateFolderPopupDisplayed() {
        return isVisible(FolderDashboardLocators.CREATE_FOLDER_POPUP);
    }

    public boolean isCreatePopupTitleDisplayed() {
        return isVisible(FolderDashboardLocators.CREATE_POPUP_TITLE);
    } 
    
    public void enterFolderName(String folderName) {
        type(FolderDashboardLocators.FOLDER_NAME_INPUT, folderName);
    }

    public void clickCreate() {
        click(FolderDashboardLocators.CREATE_POPUP_BUTTON);
    }

    public void closeCreateFolderPopup() {
        click(FolderDashboardLocators.CANCEL_POPUP_BUTTON);
    }

    public void clickCancel() {
        click(FolderDashboardLocators.CANCEL_POPUP_BUTTON);
    }

    public void createFolder(String folderName) {
        clickAddButton();
        enterFolderName(folderName);
        clickCreate();     

    }
    
    public boolean isFolderPresent(String folderName) {
        return driver.findElements(folderNameDynamic(folderName)).size() > 0;
    }
    
    public boolean isFolderDisplayed(String folderName) {
        return isVisible(folderNameDynamic(folderName));
    }
    
  
    public String getDuplicateErrorMessage() {
        return getText(FolderDashboardLocators.DUPLICATE_FOLDER_ERROR_MSG).trim();
    }
    
    //  Search folder   
    public void searchFolder(String folderName) {
        type(FolderDashboardLocators.SEARCH_FOLDER, folderName);
    }

    //  Click folder tab 
    public void clickFolderTab() {
        click(FolderDashboardLocators.FOLDER_TAB);
    }

    //  Click document tab
    public void clickDocumentTab() {
        click(FolderDashboardLocators.DOCUMENT_TAB);
    }

    // Check create folder card 
    public boolean isCreateFolderCardDisplayed() {
        return isVisible(FolderDashboardLocators.CREATE_FOLDER_CARD);
    }

    
    //  Verify folder icons    
    public boolean areFolderIconsDisplayed() {

        List<WebElement> icons = findElements(FolderDashboardLocators.FOLDER_ICONS);

        for (WebElement icon : icons) {
            if (!icon.isDisplayed()) {
                return false;
            }
        }

        return true;
    }

    
    // THREE DOT MENU

    public void clickThreeDotMenu(String folderName) {
        click(threeDotMenu(folderName));
        waitForVisibility(FolderDashboardLocators.THREE_DOT_DROPDOWN);
    }

    public boolean isPinOrUnPinDisplayed() {
        waitForVisibility(FolderDashboardLocators.THREE_DOT_DROPDOWN);
        return driver.findElements(By.xpath("//span[normalize-space()='Pin' or normalize-space()='Unpin']")).size() > 0;
    }

    // =============== EDIT FOLDER ================

    public void clickEditOption() {
        click(FolderDashboardLocators.EDIT_OPTION);
    }

    public void editFolder(String oldName, String newName) {
        clickThreeDotMenu(oldName);
        clickEditOption();
    }

    // ============== DELETE FOLDER =============

    public void clickDeleteOption() {
        click(FolderDashboardLocators.DELETE_OPTION);
    }

    public boolean isDeletePopupDisplayed() {
        return isVisible(FolderDashboardLocators.CONFIRM_DELETE_POPUP);
    }

    public void confirmCancel() {
        click(FolderDashboardLocators.CANCEL_DELETE);
    }

    public void confirmDelete() {
        click(FolderDashboardLocators.CONFIRM_DELETE);
    }

    public void deleteFolder(String folderName) {
        clickThreeDotMenu(folderName);
        clickDeleteOption();
        confirmDelete();
    }

    public boolean isFolderDeleted(String folderName) {
        return findElements(folderNameDynamic(folderName)).isEmpty();
    }

    
	// ================ FOLDER COUNT ===============

    public int getFolderCount() {
        return findElements(FolderDashboardLocators.FOLDER_CARDS).size();
    }

    // =============== PRINT FOLDERS ================

    public void printFolderNameWithDate(String option) {
    	
    	 selectOption(option);

        List<WebElement> folders = findElements(FolderDashboardLocators.FOLDER_CARDS);
        
        System.out.println("Filter: " + option);

        System.out.println("==========================================");

        for (WebElement folder : folders) {

            String name = folder.findElement(By.xpath(".//p[contains(@class,'folder-name')]")).getText().trim();
            String date = folder.findElement(By.xpath(".//p[contains(@class,'folder-time')]")).getText().trim();

            System.out.println("Folder Name: " + name + " | Date: " + date);
        }
    }

    // ----------- Click folder --------------
    
    public void openFolder(String folderName) {
        click(folderNameDynamic(folderName));
    }
    
    // =============== PIN COUNTS ===============

    public int getPinnedFolderCount() {
        waitForElements(FolderDashboardLocators.PINNED_FOLDERS);
        return findElements(FolderDashboardLocators.PINNED_FOLDERS).size();
    }

    public int getTotalFolderCount() {
        waitForElements(FolderDashboardLocators.ALL_FOLDERS);
        return findElements(FolderDashboardLocators.ALL_FOLDERS).size();
    }

    public int getUnpinnedFolderCount() {
        return getTotalFolderCount() - getPinnedFolderCount();
    }

    

  
    // =============== DROPDOWN METHODS ===========

    public void openDropdown() {
        clickJS(FolderDashboardLocators.DROPDOWN_TOGGLE);
    }

    public void selectOption(String optionName) {

        By option = By.xpath("//label[contains(@class,'radio-option') and normalize-space()='" + optionName + "']");

        clickJS(option);
    }

    public void clickClearAll() {
        openDropdown();
        click(FolderDashboardLocators.CLEAR_ALL_BUTTON);
    }

    public String getSelectedText() {
        return getText(FolderDashboardLocators.SELECTED_TEXT).trim();
    }

    public boolean isDropdownDisplayed() {
        return isVisible(FolderDashboardLocators.DROPDOWN_TOGGLE);
    }

    public boolean areOptionsVisible() {
        return isVisible(FolderDashboardLocators.DROPDOWN_CONTENT);
    }
}