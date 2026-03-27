package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class DocumentDashboardTest extends BaseTest {
	
	@Test(priority=40)
	public void verifyNavigationToDocumentDashboard() {
		
		dashboard.openFolder("LANDQ Testing");
		Assert.assertTrue(documentDashboard.isGoBackVisible(),"Go Back button is not visible");
	}
	
	
	/*@Test(priority=41)
	public void verifyGoBackNavigation() {
		
		 //Assert.assertTrue(documentDashboard.isGoBackVisible(),"Go Back button is not visible");
		 documentDashboard.clickGoBack();

	      Assert.assertTrue(dashboard.isHeaderDisplayed(),"User is not navigated to Folder page");
	}*/
	
	/*@Test(priority=41)
	public void verifyFilteredDocumentCount() throws InterruptedException {

	    int count = documentDashboard.getFilteredDocumentCount("volworks", "Tag");

	    System.out.println("Filtered Document Count: " + count);
	    Assert.assertTrue(count > 0, "No documents found after filtering");
	}
	*/
	@Test(priority=41)
	public void verifyAllFilterCounts() {

	    documentDashboard.search("testing");

	    documentDashboard.countAllFilters();
	}
	
	// ------------Create Document -------------
	@Test(priority=42)
	public void verifyCreateDocument() {
		documentDashboard.clickAddButton();
	
    // Enter details
    documentDashboard.enterTitle("Test Document");
    documentDashboard.enterDescription("This is test description");

    // Access type
    documentDashboard.selectAccessType("Public");

    // Add tag
    String[] tags = {"PDF"};

    for (String tag : tags) {
    	documentDashboard.addTag(tag);
    }

    

    // Upload files
//    documentDashboard.uploadDocument("C:\Users\hp\Downloads\volworks report.docx");
//    documentDashboard.uploadThumbnail("C:\Users\hp\Downloads\Earnings Calander Analysis.png");

    documentDashboard.uploadDocument("C:/Users/hp/Downloads/volworks report.docx");
    documentDashboard.uploadThumbnail("C:/Users/hp/Downloads/Earnings Calander Analysis.png");
    // Dates
    documentDashboard.selectStartDate("03/25/2026");
    documentDashboard.selectEndDate("03/30/2026");

    // Publish
    documentDashboard.clickPublish();
	}
	
	// ------------ profile Menu ---------------
	  @Test(priority = 43)
      public void verifyProfileMenuOptions() {

		  documentDashboard.openProfileDropdown();

     Assert.assertTrue(documentDashboard.getProfileTitle().length() > 0,
              "Profile title empty");
  
     Assert.assertTrue(documentDashboard.isProfileAccessLogsDisplayed(),
              "Access Logs missing");
     Assert.assertTrue(documentDashboard.isProfilePublicDocumentLogDisplayed(),
              "Public Document Log missing");
     Assert.assertTrue(documentDashboard.isProfileRegistratedUsersDisplayed(),
              "Registered Users missing");
     Assert.assertTrue(documentDashboard.isProfileConfigTagsDisplayed(),
              "Config Tags missing");
      Assert.assertTrue(documentDashboard.isProfileSendEmailDisplayed(),
              "Send Email missing");
      }

      // ================= LOGOUT =================

//     @Test(priority = 100)
//      public void verifyLogout() {
//    	 documentDashboard.openProfileDropdown();
//    	 documentDashboard.clickLogout();
//
//      //Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Logout failed");
//      Assert.assertTrue(login.isLoginWrapperDisplayed() ,
//	            "Logout failed - loginpage not loaded");
//  }
	

}
