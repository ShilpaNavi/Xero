package com.testing;



import org.openqa.selenium.WebDriver;

import Utility.Constants;
import Utility.Utilities;
import pageObjects.FreeTrialPage;
import pageObjects.ReusableMethods;

public class TC02 {
	 private static WebDriver driver = null;
	 
		
		
		public static void TC02test() throws Exception {
			
			driver = ReusableMethods.InitializeDriver();
		
		  
			//driver = testcase2a();
			driver = testcase2b();
			driver = testcase2c();
			driver = testcase2d();
			driver = testcase2e();

		 ReusableMethods.teardown();
		 
			
		}
		

		public static WebDriver testcase2a() throws Exception {
		ReusableMethods.Launch(Constants.FR_TRL_URL,"/Users/Naveen/Documents/QAReports/TC02a.html","TC02A");
		Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet2");
			String fname = Utilities.getCellData(1,1);
			String lname = Utilities.getCellData(1,2);
			String emailadd = Utilities.getCellData(1,3);
			String phnno = Utilities.getCellData(1, 4);
			String value = "United states";
			
			FreeTrialPage.free_trl_btn(driver);
			FreeTrialPage.FreeTrialPage_validation(driver);
			FreeTrialPage.txtbx_FirstName(driver, fname);
			FreeTrialPage.txtbx_LastName(driver, lname);
			FreeTrialPage.txtbx_emailadd(driver, emailadd);
			FreeTrialPage.txtbx_Phno(driver, phnno);
			FreeTrialPage.country_db(driver, value);
			FreeTrialPage.agree_chkbx(driver);
			
			FreeTrialPage.getstrtd_btn(driver);
			FreeTrialPage.GetStratedPage_validation(driver);
			
			
			Utilities.setCellData("Pass", 1, 5);
			
		  
		  ReusableMethods.endReport();
		  
		  return driver;
		  
		}
		
		public static WebDriver testcase2b() throws Exception {
			ReusableMethods.Launch(Constants.FR_TRL_URL,"/Users/Naveen/Documents/QAReports/TC02b.html","TC02B");
			
			Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet2");
			
			String emailadd = Utilities.getCellData(2,3);
			FreeTrialPage.getstrtd_btn(driver);
			Thread.sleep(1000);
			FreeTrialPage.Firstname_errormsg(driver);
			
			FreeTrialPage.txtbx_emailadd(driver, emailadd);
			Thread.sleep(1000);
			FreeTrialPage.Email_errormsg(driver);
			
			FreeTrialPage.getstrtd_btn(driver);
			System.out.println("Checkbox highlighted");
			
		  Utilities.setCellData("Pass", 2, 5);
		  
		  
		  ReusableMethods.endReport();
		  
		  return driver;
		}
		
		public static WebDriver testcase2c() throws Exception {
			ReusableMethods.Launch(Constants.FR_TRL_URL,"/Users/Naveen/Documents/QAReports/TC02c.html","TC02C"); 
			Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet2");
			
			FreeTrialPage.TermsofUselink(driver);
			Thread.sleep(3000);
			FreeTrialPage.TOFlink_validation(driver);
			driver.get(Constants.FR_TRL_URL);
			FreeTrialPage.PrivacyPolicylink(driver);
			try {
			//FreeTrialPage.PPlink_validation(driver);
			}
			catch(Exception e){
		  
		   Utilities.setCellData("Pass", 3, 5);
			}
		   ReusableMethods.endReport();
			  
		  return driver;
		 
		  
			
		}
		
		public static WebDriver testcase2d() throws Exception {
			ReusableMethods.Launch(Constants.FR_TRL_URL,"/Users/Naveen/Documents/QAReports/TC02d.html","TC02D"); 
			Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet2");
			
			FreeTrialPage.offerslink(driver);
			try {
			//FreeTrialPage.offersink_validation(driver);
			}
			catch(Exception e) {
			 Utilities.setCellData("Pass", 4, 5);
		}
		   ReusableMethods.endReport();
			  
		  return driver;
			
			
		}
		
		public static WebDriver testcase2e() throws Exception {
			ReusableMethods.Launch(Constants.FR_TRL_URL,"/Users/Naveen/Documents/QAReports/TC02e.html","TC02E"); 
			Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet2");
			FreeTrialPage.acctorbklink(driver);
			try {
			//FreeTrialPage.actorbk_validation(driver);
			}
			catch(Exception e) {
		   Utilities.setCellData("Pass", 5, 5);
			}
		   ReusableMethods.endReport();
			  
		  return driver;
		}

}
