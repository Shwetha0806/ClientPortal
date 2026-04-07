package testcases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import locators.DocumentDashboardLocators;

public class CreateDocumentTest extends BaseTest{
		String DocName=" Automation Test Document";
	// ------------Create Document -------------
		@Test(priority=42)
		public void verifyAddButton() {	
				createDocument.clickAddButton();
		}
		
		@Test(priority=43)
		public void verifyEntertitle() {		
				createDocument.enterTitle(DocName);
		}
		
		@Test(priority=44)
		public void verifyEnterDescription() {
				createDocument.enterDescription("This is test description");
		}
		
		@Test(priority=45)
		public void verifyAccessType() {			   
				createDocument.selectAccessType("Open Access");
		}
		
		@Test(priority=46)
		public void verifyAddTag()
		{
			    String[] tags = {"PDF","PG"};
			
			    for (String tag : tags) {
			    	createDocument.addTag(tag);
			    }  
		}
		
		@Test(priority=47)
		public void verifyUploadDocument() throws AWTException{			    
				createDocument.uploadDocument();
		}
		
		@Test(priority=48)
		public void verifyUploadThumbnail()throws AWTException{
				createDocument.uploadThumbnail();
		}
		
		@Test(priority=49)
		public void verifyCaptureCheckBox() {
		        Assert.assertTrue(createDocument.isCaptureThumbnailChecked(), "Capture thumbnail checkbox not selected");
		}   
		     
		@Test(priority=50)
		public void verifyAvailableDateCheckBox() {
		        Assert.assertTrue(createDocument.isAvailableDateChecked(), "Available Date checkbox not selected");
		}
		
		@Test(priority=51)
		public void verifyPublish() {  
			    createDocument.clickPublish();	
		}
		
		@Test(priority=52)
		public void verifyConfirmationPopupForPublish()	{
		      Assert.assertTrue(createDocument.isConfirmationPopupDisplayed(),"Confirmation popup not displayed");
		}
		
		@Test(priority=53)
		public void verifyConfirmationmessage() {
		        String message = createDocument.getConfirmationMessage();
		        Assert.assertTrue(message.contains("Publish this document"), "Incorrect confirmation message");
		}
		
		@Test(priority=54)
		public void verifyClickYesPublish() {
		        createDocument.clickYesPublish();
		        
		}
		
		@Test(priority=55)
		public void verifySuccessMessage() {
			String successMessage = createDocument.getSuccessMessageDisplayed();
			Assert.assertTrue(successMessage.contains("Document published successfully!"),"Incorrect success message");
			
			driver.navigate().refresh();		
			
		}
		
		@ Test(priority=56)
		public void verifyDocumentDisplayed() {
			//Assert.assertTrue(createDocument.isDocumentDisplayed(DocName), "Document not displayed after refresh");
			 boolean name = createDocument.isDocumentDisplayed(DocName);
			 
			 System.out.println("========== validatio for the Document Displayed ========");
			 System.out.println("Document is displayed: "+name);
		}
		
		@Test(priority=57)
		public void verifyCreatePrivateDocument() throws AWTException {
			
			createDocument.clickAddButton();
			
			createDocument.enterTitle(DocName);
			
			createDocument.enterDescription("This is test description");
			
			createDocument.selectAccessType("Private");
			
			String[] tags = {"PDF","PG"};
			
		    for (String tag : tags) {
		    	createDocument.addTag(tag);	    	
		    }
		    
		    createDocument.uploadDocument();
		    
		    createDocument.uploadThumbnail();
		    
		    createDocument.isCaptureThumbnailChecked();
		    
		    createDocument.isAvailableDateChecked();
		    
		    String[] customers = {"Shwetha G"};
			
		    for (String customer : customers) {
		    	createDocument.isAssignCustomer(customer);	    	
		    }
		    
		    createDocument.isDownloadableViewrs();
		    
		    createDocument.clickPublish();
		    
		    createDocument.isConfirmationPopupDisplayed();
		    
		    createDocument.clickYesPublish();
		    
		    createDocument.getSuccessMessageDisplayed();
		    
		    driver.navigate().refresh();
		    
		    boolean name = createDocument.isDocumentDisplayed(DocName);
			 
			 System.out.println("========== validation for the Document Displayed ========");
			 System.out.println("Document is displayed on the Admin portal: "+name);
			 
		}
		
		@Test(priority=58)
		public void verifyUserDashboard() {
			
			// User Dashboard login
			 login.loginToApplication("shwetha@landqtech.com", "Shwetha@0806");
			 Assert.assertTrue(dashboard.isHeaderDisplayed() ,"Login failed - Dashboard not loaded");

		    // Navigated to Document Dashboard
			dashboard.openFolder("LandQ Testing1");
			Assert.assertTrue(documentDashboard.isGoBackVisible(),"Go Back button is not visible");
			
			driver.navigate().refresh();
			    
			boolean name = createDocument.isDocumentDisplayed(DocName);
				 
			System.out.println("========== validatio for the User Portal ========");
			System.out.println("document is displayed on the user Portal: "+name);
		    
		}
			
		}
		
		

