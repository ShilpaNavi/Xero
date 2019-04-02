package com.testing;

import org.openqa.selenium.WebDriver;

import Utility.Constants;
import Utility.Utilities;
import appModules.Login;
import pageObjects.HomePage;
import pageObjects.ReusableMethods;

public class TC03 {
	 private static WebDriver driver = null;
		public static void TC03test() throws Exception {
			// TODO Auto-generated method stub
			driver = ReusableMethods.InitializeDriver();
			ReusableMethods.Launch(Constants.URL,"/Users/Naveen/Documents/QAReports/TC03.html","TC03");
			Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet3");
				String email = Utilities.getCellData(1,1);
				String Password = Utilities.getCellData(1, 2);
				
			  Login.loginExecute(driver,email,Password);
			  
			  Login.Hopg_validation(driver);
			 HomePage.Dashboard(driver);
			 HomePage.Accounting(driver);
			 HomePage.Reports(driver);
			 HomePage.Contacts(driver);
			 HomePage.App_button(driver);
			 HomePage.Settings(driver);
			 HomePage.App_button(driver);
			 //HomePage.Plus(driver);
			 //HomePage.App_button(driver);
			 
			// driver.get(Constants.URL);
			// Login.loginExecute(driver,email,Password);
			  
			 // Login.Hopg_validation(driver);
			  HomePage.App_button(driver);
			  HomePage.Files(driver);
			  HomePage.Notifications(driver);
			  HomePage.Search(driver);
			  HomePage.Help(driver);
			 
			 
			  
			  Utilities.setCellData("Pass", 1, 3);
			  
			  ReusableMethods.endReport();
			  ReusableMethods.teardown();
				 

		}


}
