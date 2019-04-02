package com.testing;



import org.openqa.selenium.WebDriver;

import Utility.Constants;
import Utility.Utilities;
import appModules.Login;
import pageObjects.HomePage;
import pageObjects.MyxeroPage;
import pageObjects.ReusableMethods;

public class TC08 {
	 private static WebDriver driver = null;
		public static void TC08test() throws Exception {
			// TODO Auto-generated method stub
			driver = ReusableMethods.InitializeDriver();
			
			  
			driver = testcase8a();
			driver = testcase8b();
			//driver = testcase8c();
			//driver = testcase8d();

		 ReusableMethods.teardown();

		}
		public static WebDriver testcase8a() throws Exception {
			// TODO Auto-generated method stub
			ReusableMethods.Launch(Constants.URL,"/Users/Naveen/Documents/QAReports/TC08a.html","TC08A");
			Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet6");
			String email = Utilities.getCellData(1,1);
			String Password = Utilities.getCellData(1, 2);
			String OrgName = Utilities.getCellData(1,3);
			String pvalue = Utilities.getCellData(1, 4);
			String Tvalue = Utilities.getCellData(1, 5);
			String OrgDo = Utilities.getCellData(1, 6);
			String svalue = Utilities.getCellData(1, 7);
				
			  Login.loginExecute(driver,email,Password);
			  driver.manage().window().maximize();
			  HomePage.App_button(driver);
			  Thread.sleep(2000);
			  HomePage.myXero(driver);
			  MyxeroPage.myxero_validation(driver);
			  MyxeroPage.Addanorg_btn(driver);
			  MyxeroPage.Addanorgpage_validation(driver);
			  MyxeroPage.Orgname(driver, OrgName);
			  MyxeroPage.paytaxex_dd(driver, pvalue);
			  MyxeroPage.Time_dd(driver, Tvalue);
			  MyxeroPage.OrgDo(driver, OrgDo);
			  MyxeroPage.Software_dd(driver, svalue);
			  MyxeroPage.AddNewTrial_btn(driver);
			  
			  Utilities.setCellData("Pass", 1, 8);
			  
			  ReusableMethods.endReport();
			  driver.close();
			 
			  
			return driver;
		}
		public static WebDriver testcase8c() {
			// TODO Auto-generated method stub
			return driver;
		}
		public static WebDriver testcase8b() throws Exception {
			// TODO Auto-generated method stub
			driver = ReusableMethods.InitializeDriver();
			ReusableMethods.Launch(Constants.URL,"/Users/Naveen/Documents/QAReports/TC08b.html","TC08B");
			Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet6");
			String email = Utilities.getCellData(2,1);
			String Password = Utilities.getCellData(2, 2);
			String OrgName = Utilities.getCellData(2,3);
			String pvalue = Utilities.getCellData(2, 4);
			String Tvalue = Utilities.getCellData(2, 5);
			String OrgDo = Utilities.getCellData(2, 6);
			String svalue = Utilities.getCellData(2, 7);
				
			  Login.loginExecute(driver,email,Password);
			  driver.manage().window().maximize();
			  HomePage.App_button(driver);
			  Thread.sleep(2000);
			  HomePage.myXero(driver);
			  MyxeroPage.myxero_validation(driver);
			  MyxeroPage.Addanorg_btn(driver);
			  MyxeroPage.Addanorgpage_validation(driver);
			  MyxeroPage.Orgname(driver, OrgName);
			  MyxeroPage.paytaxex_dd(driver, pvalue);
			  MyxeroPage.Time_dd(driver, Tvalue);
			  MyxeroPage.OrgDo(driver, OrgDo);
			  MyxeroPage.Software_dd(driver, svalue);
			 MyxeroPage.Purchase_btn(driver);
			  
			  Utilities.setCellData("Pass", 2, 8);
			  
			  ReusableMethods.endReport();
			return driver;
		}
		public static WebDriver testcase8d() {
			// TODO Auto-generated method stub
			return driver;
		}

}
