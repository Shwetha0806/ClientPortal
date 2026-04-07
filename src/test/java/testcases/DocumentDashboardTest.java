package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class DocumentDashboardTest extends BaseTest {
	
	@Test(priority=40)
	public void verifyNavigationToDocumentDashboard() {
		
		dashboard.openFolder("LandQ Testing1");
		Assert.assertTrue(documentDashboard.isGoBackVisible(),"Go Back button is not visible");
	}
	
	
	/*@Test(priority=41)
	public void verifyGoBackNavigation() {
		
		 Assert.assertTrue(documentDashboard.isGoBackVisible(),"Go Back button is not visible");
		 documentDashboard.clickGoBack();

	      Assert.assertTrue(dashboard.isHeaderDisplayed(),"User is not navigated to Folder page");
	}*/
	/*
	@Test(priority=41)
	public void verifyFilteredDocumentCount() throws InterruptedException {

	    int count = documentDashboard.getFilteredDocumentCount("volworks", "Tag");

	    System.out.println("Filtered Document Count: " + count);
	    Assert.assertTrue(count > 0, "No documents found after filtering");
	}
	
	@Test(priority=41)
	public void verifyAllFilterCounts() {

	    documentDashboard.search("test");

	    documentDashboard.countAllFilters();
	}
*/
	
	
	// ------------ profile Menu ---------------
	  @Test(priority = 60)
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

     @Test(priority = 100)
      public void verifyLogout() {
    	 documentDashboard.openProfileDropdown();
    	 documentDashboard.clickLogout();

      Assert.assertTrue(login.isLoginWrapperDisplayed() ,
	            "Logout failed - loginpage not loaded");
  }
	

}
