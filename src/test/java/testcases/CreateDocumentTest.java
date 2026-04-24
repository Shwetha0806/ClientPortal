package testcases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import locators.DocumentDashboardLocators;

public class CreateDocumentTest extends BaseTest{
		//String DocName=" Automation Test Document";
	// ------------Create Document -------------
			
		@Test(priority=42)
		public void verifyAddButton() {	
				createDocument.clickAddButton();
		}
		
		@Test(priority=43)
		public void verifyEntertitle() {		
				createDocument.enterTitle("Automation Test Open Access with word Document");
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
			    String[] tags = {"Word Doc","HD"};
			
			    for (String tag : tags) {
			    	createDocument.addTag(tag);
			    }  
		}
		
		@Test(priority=47)
		public void verifyUploadDocument() throws AWTException{	
				createDocument.uploadDocument("C:\\Users\\hp\\Downloads\\volworks report.docx");
		}
		
		@Test(priority=48)
		public void verifyUploadThumbnail()throws AWTException{
				createDocument.uploadThumbnail("C:\\Users\\hp\\Downloads\\Earnings Calander Analysis.png");
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
			 boolean name = createDocument.isDocumentDisplayed("Automation Test Open Access with word Document");
			 
			 System.out.println("========== validatio for the Document Displayed ========");
			 System.out.println("Open Access with word document is displayed: "+name);
		}
		
		// Private Access type
		@Test(priority=57, groups="Access")
		public void verifyCreatePrivateWithExcelDocument() throws AWTException {
			
			createDocument.clickAddButton();
			
			createDocument.enterTitle("Automation Test Private with EXCEL Document");
			
			createDocument.enterDescription("This is test description");
			
			createDocument.selectAccessType("Private");
			
			String[] tags = {"Excel File","PG"};
			
		    for (String tag : tags) {
		    	createDocument.addTag(tag);	    	
		    }
		    
		    createDocument.uploadDocument("C:\\Users\\hp\\Downloads\\volworks-reports-Put Writes_20260210125733");
		    
		    createDocument.uploadThumbnail("C:\\Users\\hp\\Downloads\\Screenshot 2026-02-06 145304 (1)");
		    
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
		    
		    boolean name = createDocument.isDocumentDisplayed("Automation Test Private with EXCEL Document");
			 
			 System.out.println("========== validation for the Document Displayed ========");
			 System.out.println("private with Excel document is displayed: "+name);
			 
		}
		
		// Register Access with PDF Document
		@Test(priority=58, groups="Access")
		public void verifyCreateRegisterWithPDFDocument() throws AWTException {
			
			createDocument.clickAddButton();
			
			createDocument.enterTitle("Automation Test Register with PDF Document");
			
			createDocument.enterDescription("This is test description");
			
			createDocument.selectAccessType("Register");
			
			String[] tags = {"PDF","PG"};
			
		    for (String tag : tags) {
		    	createDocument.addTag(tag);	    	
		    }
		    
		    createDocument.uploadDocument("C:\\Users\\hp\\Downloads\\volworks-reports-Trailing Returns_20260227124114");
		    
		    createDocument.uploadThumbnail("C:\\Users\\hp\\Downloads\\V3 - FINAL");
		    
		    createDocument.isCaptureThumbnailChecked();
		    
		    createDocument.isAvailableDateChecked();
		    
		    createDocument.clickPublish();
		    
		    createDocument.isConfirmationPopupDisplayed();
		    
		    createDocument.clickYesPublish();
		    
		    createDocument.getSuccessMessageDisplayed();
		    
		    driver.navigate().refresh();
		    
		    boolean name = createDocument.isDocumentDisplayed("Automation Test Register with PDF Document");
			 
			 System.out.println("========== validation for the Document Displayed ========");
			 System.out.println("Register with PDF document is displayed: "+name);
			 
		}
		
		// Register without Thumbnail with PPT Document
		@Test(priority=58, groups="Access")
		public void verifyCreateWithoutThumbnailWithPPTDocument() throws AWTException, InterruptedException {
					
			createDocument.clickAddButton();
					
			createDocument.enterTitle("Automation Test without Thumbnail with PPT Document");
					
			createDocument.enterDescription("This is test description");
					
			createDocument.selectAccessType("Register");
					
			String[] tags = {"PPT","ORCL"};
					
			for (String tag : tags) {
				   createDocument.addTag(tag);	    	
			}
				    
			createDocument.uploadDocument("C:\\Users\\hp\\Downloads\\L&Q Team Meeting Draft.pptx");
				    
			//createDocument.uploadThumbnail("C:\\Users\\hp\\Downloads\\V3 - FINAL");
				    
			 Assert.assertTrue(createDocument.isCaptureThumbnailChecked(), "Capture thumbnail checkbox not selected");
				    
			createDocument.isAvailableDateChecked();
				    
			createDocument.clickPublish();
				    
			createDocument.isConfirmationPopupDisplayed();
				    
			createDocument.clickYesPublish();
						
			createDocument.getSuccessMessageDisplayed();
				    
			driver.navigate().refresh();
			
			Thread.sleep(3000);
			boolean name = createDocument.isDocumentDisplayed("Automation Test without Thumbnail with PPT Document");
					 
			System.out.println("========== validation for the Document Displayed ========");
			System.out.println("Register without Thumbnail with PPT document is displayed: "+name);
					 
				}
								 
		
		
		@Test(priority=59, groups={"user","Access"})
		public void verifyUserDashboard() {
			
			// User Dashboard login
			 login.loginToApplication("shwetha@landqtech.com", "Shwetha@0806");
			 Assert.assertTrue(dashboard.isHeaderDisplayed() ,"Login failed - Dashboard not loaded");

		    // Navigated to Document Dashboard
			dashboard.openFolder("LandQ Testing1");
			Assert.assertTrue(documentDashboard.isGoBackVisible(),"Go Back button is not visible");
			
			driver.navigate().refresh();
			    
			boolean name = createDocument.isDocumentDisplayed("Automation Test Private with EXCEL Document");
				 
			System.out.println("========== validatio for the User Portal ========");
			System.out.println("document is displayed on the user Portal: "+name);
		    
		}
			
		}
		
		

