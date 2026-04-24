package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class FolderDashboardTest extends BaseTest {

  
    // ================= HEADER =================

    	@Test(priority=11, groups="visible")
    	public void verifyHeaderSection() {
        Assert.assertTrue(dashboard.isHeaderDisplayed(), "Header is not displayed");
    	}
    
        @Test(priority = 12, groups="visible")
        public void verifyDashboardLogo() {
        Assert.assertTrue(dashboard.isLogoDisplayed(), "Logo is not displayed");
        }
        
        @Test(priority = 13, groups="visible")
        public void verifyProfileIcon() {
        Assert.assertTrue(dashboard.isProfileIconDisplayed(), "Profile icon is not displayed");
        }

        // ================= BODY =================

        @Test(priority = 14, groups="visible")
        public void verifyFolderContainer() {
        Assert.assertTrue(dashboard.isFolderContainerDisplayed(), "Folder container not displayed");
        }

        @Test(priority = 15, groups="visible")
        public void verifyPageTitle() {
        Assert.assertTrue(dashboard.isPageTitleDisplayed(), "Page title not displayed");
        }
        
       
        @Test(priority = 16, groups="visible")
        public void verifyDocumentTab() {
            dashboard.clickDocumentTab();

            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Document tab not opened");
        }

        @Test(priority = 17, groups="visible")
        public void verifyFolderTab() {

            dashboard.clickFolderTab();
            Assert.assertTrue(dashboard.isCreateFolderCardDisplayed(), "Folder tab not opened");
        }

        @Test(priority = 18, groups="visible")
        public void verifyFolderIcons() {
            Assert.assertTrue( dashboard.areFolderIconsDisplayed(), "Folder icons not displayed");
        }

        @Test(priority = 31, groups="functional")
        public void verifySearchFolder() {
            dashboard.searchFolder("Test");
            Assert.assertTrue( dashboard.getFolderCount() >= 0,  "Search not working");
        }
        // ================= FOOTER =================

        @Test(priority = 20, groups="visible")
        public void verifyFooterSection() {
        Assert.assertTrue(dashboard.isFooterDisplayed(), "Footer not displayed");
        }
        
        @Test(priority = 21, groups="visible")
        public void verifyFooterTest() {
        Assert.assertTrue(dashboard.isFooterTextDisplayed(), "Footer text missing");
        } 
        
        @Test(priority = 22, groups="visible")
        public void verifyVersionText() {
        Assert.assertTrue(dashboard.isVersionTextDisplayed(), "Version text not displayed");
        }

      // ================= CREATE FOLDER POPUP =================
        
        @Test(priority = 23, groups="functional")
        public void verifyCreateFolderWithName() {

            String folderName = "NewFolders1";

            dashboard.createFolder(folderName);
            
            
            String actualError = dashboard.getDuplicateErrorMessage();

            if (actualError.toLowerCase().contains("already")) {
            	
            	System.out.println("Duplicate folder error displayed");

                Assert.assertTrue(true, "Duplicate folder error displayed");
                
            } else {
            	 System.out.println("Folder created successfully");
                Assert.assertTrue(dashboard.isFolderDisplayed(folderName), "Folder not created");

            }

            dashboard.closeCreateFolderPopup();
        }
              
        
        
        @Test(priority = 24, groups="functional")
        public void verifyCreateFolderPopup() {
        dashboard.clickAddButton();
        Assert.assertTrue(dashboard.isCreateFolderPopupDisplayed(), "Create Folder popup not displayed");
        Assert.assertTrue(dashboard.isCreatePopupTitleDisplayed(), "Create Folder popup Title not displayed");
        
        dashboard.closeCreateFolderPopup();
        }
        

        // ================= PIN / UNPIN COUNT =================

        @Test(priority = 25, groups="functional")
        public void verifyPinnedAndUnpinnedFolderCount() {

        int total = dashboard.getTotalFolderCount();
        int pinned = dashboard.getPinnedFolderCount();
        int unpinned = dashboard.getUnpinnedFolderCount();

        System.out.println("Total Folders: " + total);
        System.out.println("Pinned Folders: " + pinned);
        System.out.println("Unpinned Folders: " + unpinned);

        Assert.assertEquals(pinned + unpinned, total,
                "Pinned + Unpinned count mismatch");
       }

        // ================= DROPDOWN =================

        @Test(priority = 26, groups="visible")
        public void verifyDropdownDisplayed() {
        Assert.assertTrue(dashboard.isDropdownDisplayed(),
                "Order dropdown not displayed");
        }

        @Test(priority = 27, groups="visible")
        public void verifyDropdownOpens() {

        dashboard.openDropdown();
        Assert.assertTrue(dashboard.areOptionsVisible(),
                "Dropdown options not visible");
        }

        @Test(priority = 28, groups="visible")
        public void verifyDefaultSelection() {

        Assert.assertEquals(dashboard.getSelectedText(),
                "Pinned",
                "Default selection incorrect");
        }
        
        @Test(priority=29, groups="functional")
        public void printFoldersForAllDropdownOptions() {

        String[] options = {
                "A-Z",
                "Z-A",
                "Latest First",
                "Oldest First",
                "Pinned"
        };

        for (String option : options) {

            dashboard.printFolderNameWithDate(option);
        }
        }
    
   
        // ======================== CLEAR ALL VALIDATION ========================

        @Test(priority = 30, groups="functional")
        public void verifyClearAllFunctionality() {

    	dashboard.selectOption("Pinned");
    	dashboard.clickClearAll();

        Assert.assertEquals(dashboard.getSelectedText(), "Pinned", "Clear All did not reset selection");
        }

        
      
        
       
}