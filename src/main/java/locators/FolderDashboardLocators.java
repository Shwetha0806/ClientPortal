package locators;

import org.openqa.selenium.By;

public class FolderDashboardLocators {

    // HEADER
    public static By HEADER  = By.xpath("//header[@class='header']");
    public static By LOGO = By.xpath("//img[@class='volworks-image']");
    public static By PROFILE_ICON = By.xpath("//img[@alt='Profile Picture']");

    // BODY
    public static By FOLDER_CONTAINER = By.xpath("//div[@class='folder-container']");
    public static By PAGE_TITLE = By.xpath("//div[text()='Choose a folder']");
    public static By SEARCH_FOLDER = By.xpath( "//input[@placeholder='Search folder name...']");
    public static By FOLDER_TAB =By.xpath( "//button[normalize-space()='Folders']");
    public static By DOCUMENT_TAB =By.xpath("//button[normalize-space()='Documents']");
    public static By CREATE_FOLDER_CARD =By.xpath("//div[contains(@class,'add-card')]");
    public static By ADD_TEXT = By.xpath("//p[contains(@class,'add-text')]");
 

    // CREATE FOLDER
    public static By ADD_BUTTON = By.xpath("//button[contains(@class,'add-button')]");
    public static By CREATE_FOLDER_POPUP = By.xpath("//div[contains(@class,'modal-content')]");
    public static By CREATE_POPUP_TITLE = By.xpath("//*[contains(text(),'Create a folder')]");
    public static By FOLDER_NAME_INPUT = By.xpath("//input[@placeholder='Enter folder name']");
    public static By CREATE_POPUP_BUTTON = By.xpath("//button[@class='btn-published']");
    public static By CANCEL_POPUP_BUTTON = By.xpath("//button[contains(@class,'btn-close')]");
    public static By DUPLICATE_FOLDER_ERROR_MSG = By.xpath("//div[@aria-label='folder with this name already exists']");

    
    
    // THREE DOT MENU
    public static By THREE_DOT_ICON = By.xpath("//img[contains(@class,'menu-btn')]");
    public static By THREE_DOT_DROPDOWN = By.xpath("//div[contains(@class,'menu-dropdown')]");
    public static By EDIT_OPTION = By.xpath("//span[normalize-space()='Edit']");
    public static By DELETE_OPTION = By.xpath("//span[normalize-space()='Delete']");

    public static By CONFIRM_DELETE_POPUP = By.xpath("//button[normalize-space()='Yes']");
    public static By CONFIRM_DELETE = By.xpath("//button[@class='confirmation-delete']");
    public static By CANCEL_DELETE = By.xpath("//button[@class='confirmation-cancel']");
    
    public static By PIN_OPTION = By.xpath("//div[@class='menu-option pinning']//span[text(),'pin']");
    public static By UNPIN_OPTION =By.xpath("//div[@class='menu-option pinning']//span[text(),'Unpin']");

    public static By ALL_FOLDERS = By.xpath("//div[contains(@class,'folder-card')]");
    public static By PINNED_FOLDERS = By.xpath("//div[contains(@class,'folder-card')]//div[contains(@class,'pinned')]");


    
   
    // FOLDER CARDS
	public static By FOLDER_ICONS = By.xpath( "//img[contains(@src,'folder')]");
	public static By FOLDER_CARDS = By.xpath("//div[contains(@class,'folder-card')]");
	public static By FOLDER_NAMES = By.xpath( ".//p[contains(@class,'folder-name')]");
	public static By FOLDER_DATE = By.xpath(".//p[contains(@class,'folder-time')]");

    // FOOTER 

	public static By FOOTER = By.xpath( "//div[contains(@class,'footer')]");
	public static By FOOTER_TEXT = By.xpath( "//a[contains(@class,'link')]");
    public static By VERSION_TEXT = By.xpath( "//div[contains(@class,'version')]");

     // FOLDER DROPDOWN 

    public static By DROPDOWN_TOGGLE = By.xpath("//div[contains(@class,'order-by-dropdown')]//div[contains(@class,'dropdown-toggle')]");
    public static By DROPDOWN_CONTENT = By.xpath( "//div[contains(@class,'dropdown-content')]");

    public static By CLEAR_ALL_BUTTON = By.xpath("//div[contains(@class,'dropdown-content')]//button");
    public static By SELECTED_TEXT = By.xpath("//div[contains(@class,'dropdown-toggle')]//span");

    public static By ALL_OPTIONS = By.xpath( "//label[contains(@class,'radio-option')]");

}