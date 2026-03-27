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
	
	// ------------------ Create Document  --------------------
	
	public static By ADD_CARD = By.xpath("//div[contains(@class,'add-card')]");
	public static By ADD_BUTTON = By.xpath("//button[contains(@class,'add-button')]");
	public static By ADD_TEXT = By.xpath("//p[contains(@class,'add-text')]");
	
	// ------------------- Create Document Popup ----------------
	
	public static By CREATE_DOCUMENT_POPUP = By.xpath("//div[contains(@class,'modal-content-custom')]");
	public static By CREATEDOCUMENT_POPUP_BODY =By.xpath("//div[contains(@class,'modal-body-custom')]");
	public static By CREATEDOCUMENT_POPUP_TAB =By.xpath("//div[contains(@class,'modal-tabs')]//span");
	
	// Title
	public static By CREATEDOCUMENT_TITLE= By.xpath("//label[normalize-space()='Title']");
	public static By CREATEDOCUMENT_TITLEINPUT =By.xpath("//input[@placeholder='Add any title here...']");
	
	// Description
	public static By CREATEDOCUMENT_DESCRIPTION = By.xpath("//label[normalize-space()='Description']");
	public static By CREATEDOCUMENT_TEXTAREA = By.xpath("//textarea[@placeholder='Add your description for the document...']");
	
	// Access Type
	public static By CREATEDOCUMENT_ACCESSTYPE = By.xpath("//label[normalize-space()='Access Type']");
	public static By CREATEDOCUMENT_ANONYMOUS = By.xpath("//input[contains(@id,'public')]");
	public static By CREATEDOCUMENT_REGISTER = By.xpath("//input[contains(@id,'protected')]");
	public static By CREATEDOCUMENT_PRIVATE = By.xpath("//input[contains(@id,'private')]");
	
	// Tags
	public static By CREATEDOCUMENT_TAGS = By.xpath("//label[normalize-space()='Tags']");
	public static By CREATEDOCUMENT_TAGS_CONTAINER = By.xpath("//div[@class='tag-container']");
	public static By CREATEDOCUMENT_TAGS_DROPDOWN = By.xpath("//div[@class='tag-dropdown-list ng-star-inserted']");
	public static By CREATEDOCUMENT_TAG_INPUT = By.xpath("//input[@placeholder='Search to add tags...']");
	public static By CREATEDOCUMENT_TAGS_ICON = By.xpath("//img[@class='status-icon.mb-2']");
	
	// Tags Popup
	public static By TAG_POPUP = By.xpath("//div[@class='tag-popup-content']");
	public static By TAG_PREVIEW = By.xpath("//div[@class='tag-preview']");
	public static By TAG_NAME =By.xpath("//label[normalize-space()='Tag name']");
	public static By TAG_INPUT = By.xpath("//input[@placeholder='Enter tag name']");
	public static By TAG_COLOR = By.xpath("//label[normalize-space()='Tag color']");
	public static By TAG_BACKGROUND_COLOR=By.xpath("//div[@class='popup-content']//chrome-picker//saturation-component");
	public static By TAG_COLOR_POINTER = By.xpath("//saturation-component//div[@class='pointer']");
	
	public static By TAG_COLOR_CONTROLS = By.xpath("//div[contains(@class,'controls')]");
	public static By COLUMN_TYPE = By.xpath("//div[contains(@class,'type-column')]//span");
	public static By C1 = By.xpath("//div[@class='column']//div[1]//input[1]");
	public static By C2 = By.xpath("//div[@class='column']//div[2]//input[1]");
	public static By C3 = By.xpath("//div[@class='column']//div[3]//input[1]");
	public static By C4 = By.xpath("//div[@class='column']//div[4]//input[1]");
		
	public static By TAG_COLOR_PRESETS = By.xpath("//color-presets-component[@class='ng-star-inserted']");
	public static By FONT_COLOUR = By.xpath("//label[normalize-space()='Font colour']");
	public static By FONT_COLOUR_SELECTED = By.xpath("//div[@class='color-circle selected']");
	public static By FONT_COLOUR_CIRCLE = By.xpath("//div[@class='color-circle']");
	
	public static By ADD_TAG = By.xpath("//button[normalize-space()='Add tag']");
	public static By TAG_CANCEL = By.xpath("//div[@class='actions-button']//button[@class='btn btn-secondary bold-text'][normalize-space()='Cancel']");
	
	// Document Drag and Drop
	public static By DOCUMENT_DRAGnDROP = By.xpath("//div[@class='modal-thumbnail-and-document-row']/div[1]/div[1]/div[1]");
	public static By DOCUMENT_DRAGnDROP_ICON = By.xpath("//img[@alt='Upload document']");
	public static By DOCUMENT_BROWSER_FILE = By.xpath("//span[text()='Document']/following::button[text()='Browse file'][1]");
	public static By DOCUMENT_FILETYPE = By.xpath("//span[text()='Document']/following::input[@type='file'][1]");
	
	// Thumbnail Drag and Drop
	public static By THUMBNAIL_DRAGnDROP = By.xpath("//div[@class='modal-thumbnail-and-document-row']/div[2]/div[1]/div[1]");
	public static By THUMBNAIL_DRAGnDROP_ICON = By.xpath("//img[@alt='Upload thumbnail']");
	public static By THUMBNAIL_BROWSER_FILE = By.xpath("//span[text()='Thumbnail']/following::button[text()='Browse file'][1]");
	public static By THUMBNAIL_FILETYPE = By.xpath("//span[text()='Thumbnail']/following::input[@type='file'][1]");
	
	public static By CAPTURE_THUMBNAIL_DOCUMENT = By.xpath("//label[contains(text(),'Capture thumbnail from document')]");
	public static By INSERT_DOCUMENT_LINK = By.xpath("//label[contains(text(), 'Insert Document Link here')]");
	public static By PAST_URL_LINK = By.xpath("//input[@placeholder='Paste url here']");
	
	// Availability Dates
	public static By AVAILABILITY_DTES = By.xpath("//label[contains(text(), 'Availability Dates')]");
	public static By CREATEDOCUMENT_STARTDATE = By.xpath("//div[contains(@class,'modal-body-custom')]//input[@matstartdate]");
	public static By CREATEDOCUMENT_ENDDATE = By.xpath("//div[contains(@class,'modal-body-custom')]//input[@matenddate]");
	public static By CREATEDOCUMENT_CALENDER_ICON = By.xpath("//div[contains(@class,'modal-body-custom')]//button[@aria-label='Open calendar']");
	public static By CREATEDOCUMENT_CALENDER_POPUP = By.xpath("//mat-calendar[@id='mat-datepicker-8']");
	
	public static By SAME_PUBLISH_DATE = By.xpath("//input[@id='isCheckedCheckbox']");
	
	// Create Document footer
	public static By SAVE_AS_DRAFT = By.xpath("//button[normalize-space()='Save as Draft']");
	public static By PUBLISH = By.xpath("//button[@class='btn btn-primary bold-text']");
	public static By CREATEDOCUMENT_CANCEL = By.xpath("//button[@class='btn btn-secondary bold-text' and text()='Cancel']");
	
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
