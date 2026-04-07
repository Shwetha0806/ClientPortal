package locators;

import org.openqa.selenium.By;

public class DocumentDashboardLocators {
	
	
	public static By GO_BACK_BUTTON = By.xpath("//div[contains(@class,'go-to-folders')]//img[@alt='Folders']");
	
	// ------------- Search ------------------------
	
	public static By SEARCH_BOX = By.xpath("//input[@placeholder='Search by title, description or tags...']");
	public static By FILTER_ICON = By.xpath("//img[@alt='Filter' and contains(@class,'search-icon filter')]");
	public static By SEARCH_ICON = By.xpath("//img[@alt='Search']");

	public static By FILTER_DROPDOWN = By.xpath("//div[contains(@class,'filter-dropdown')]");
	public static By ALL_OPTION = By.xpath("//span[normalize-space()='All']");
	public static By TITLE_OPTION = By.xpath("//span[normalize-space()='Title']");
	public static By DESCRIPTION_OPTION = By.xpath("//span[normalize-space()='Description']");
	public static By TAG_OPTION = By.xpath("//span[normalize-space()='Tag']");

	// ---------------- Filter Tabs  --------------------
	
	public static By ALL_DOCUMENT = By.xpath("//button[contains(@text(),'All Documents')]");
	public static By PUBLISHED = By.xpath("//button[contains(@text(),'Published')]");
	public static By DRAFTS = By.xpath("//button[contains(@text(),'Drafts')]");
	public static By ARCHIVED = By.xpath("//button[contains(@text(),'Archived')]");
	
	public static By DOCUMENT_LIST =By.xpath("//div[contains(@class,'document-details')]");
	
	// ---------------- Folder Access Enabled ---------------
	
	public static By FOLDER_ACCESS =By.xpath("//span[contains(@text(),'Folder Access Enabled')]");
	public static By FOLDER_ACCESS_VIEW = By.xpath("//button[contains(@class,'view-button')]");
	public static By ACCESSTYPE_POPUP =By.xpath("//div[contains(@class, 'modal-content')]");
	
	public static By ACCESSTYPE_POPUP_BODY = By.xpath("//div[contains(@class,'modal-body')]");
	public static By ACCESSTYPE_POPUP_TABS = By.xpath("//span[contains(@text(),'Access Type')]");
	public static By ANONYMOUS = By.xpath("//input[conatins(@value='public')]");
	public static By REGISTER = By.xpath("//input[conatins(@value='protected')]");
	public static By PRIVATE = By.xpath("//input[conatins(@value='private')]");

	public static By ACCESSTYPE_POPUP_FOOTER =By.xpath("//div[contains(@class,'modal-footer')]");
	public static By ACCESSTYPE_DISABLE =By.xpath("//button[normalize-space()='Disable']");
	public static By ACCESSTYPE_SAVE =By.xpath("//button[normalize-space()='Save']");
	public static By ACCESSTYPE_CANCEL =By.xpath("//button[normalize-space()='Cancel']");
	
	
			
	// ---------------- PROFILE DROPDOWN ----------------
    public static By PROFILE_TRIGGER = By.xpath("//div[contains(@class,'profile-dropdown-wrapper')]");
    public static By PROFILE_DROPDOWN = By.xpath("//div[contains(@class,'profile-dropdown')]");
    
    public static By PROFILE_TITLE = By.xpath( "//div[@class='title']");
    public static By PROFILE_ACCESS_LOGS = By.xpath("//*[contains(normalize-space(),'Access logs')]");
    public static By PROFILE_PUBLIC_DOCUMENT_LOG = By.xpath("//*[contains(normalize-space(),'Public Document Log')]");
    public static By PROFILE_REGISTERED_USERS = By.xpath("//*[contains(normalize-space(),'Registrated Users')]");
    public static By PROFILE_CONFIG_TAGS = By.xpath( "//*[contains(normalize-space(),'Config Tags')]");
    public static By PROFILE_SEND_EMAIL = By.xpath("//*[contains(normalize-space(),'Send Email')]");
    public static By LOGOUT = By.xpath("//button[contains(@class,'dropdown-item') and normalize-space()='Logout']");

}
