package com.testing;

import org.openqa.selenium.WebDriver;

import Utility.Constants;
import Utility.Utilities;
import appModules.Home;
import appModules.Login;
import pageObjects.ReusableMethods;

public class TC04 {
	private static WebDriver driver = null;

	public static void TC04test() throws Exception {
		// TODO Auto-generated method stub
		driver = ReusableMethods.InitializeDriver();
		ReusableMethods.Launch(Constants.URL,"/Users/Naveen/Documents/QAReports/TC04.html","TC04");
		Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet4");
			String email = Utilities.getCellData(1,1);
			String Password = Utilities.getCellData(1, 2);
			
			Login.loginExecute(driver,email,Password);
			  
			  Login.Hopg_validation(driver);
			  Home.HomeExecute(driver);
			  
			  Utilities.setCellData("Pass", 1, 3);
			  
			  ReusableMethods.endReport();
			  ReusableMethods.teardown();

	}

}
