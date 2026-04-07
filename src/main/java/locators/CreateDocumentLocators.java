package locators;

import org.openqa.selenium.By;

public class CreateDocumentLocators {

	
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
		public static By CREATEDOCUMENT_OPEN_ACCESS = By.xpath("//input[contains(@id,'public')]");
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
		
		public static By CAPTURE_THUMBNAIL_DOCUMENT = By.xpath("//input[@id='isCaptureThumbnailChecked']");
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
		
		// Confirmation Popup for Publish

		public static By CONFIRMATION_BOX = By.xpath("//div[contains(@class,'confirmation-box')]");
		public static By CONFIRMATION_MESSAGE = By.xpath("//p[contains(@class,'confirmation-message')]");
		public static By YES_PUBLISH_BUTTON = By.xpath("//button[normalize-space()='Yes, Publish']");
		public static By CANCEL_BUTTON = By.xpath("//button[normalize-space()='Cancel']");
		
		public static By SUCCESS_MESSAGE =By.xpath("//div[@class='toast-bottom-right toast-container']");
		
		// Assign Customer 
		public static By ASSIGN_CUSTOMER =By.xpath("//div[@class='modal-tabs']//span[contains(text(),'Assign customer')]");
		public static By ASSIGN_CUSTOMER_TITLE =By.xpath("//label[normalize-space()='Authorized viewers:']");
		public static By SEARCH_CUSTOMER_INPUT =By.xpath("//input[@placeholder='Search to add people']");
		public static By CUSTOMER_DROPDOWN_LIST =By.xpath("//div[@class='people-list ng-star-inserted']");
		public static By PERSON_TAG =By.xpath("//span[@class='person-tag ng-star-inserted']");
		
		// Downloadable Viewers
		public static By DOWNLOADEBLE_VIEWERS =By.xpath("//div[@class='modal-tabs']//span[contains(text(),'Downloadable Viewers')]");
		public static By DOWNLOADEBLE_VIEWERS_TITLE =By.xpath("//label[contains(normalize-space(),'Select which assigned customers')]");
		public static By DOWNLOADDABLE_CHECKBOX =By.xpath("//div[@class='person-item ng-star-inserted']//input[@type='checkbox']");
		
		
		
		
		
		
		
		
}


