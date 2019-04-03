package com.testing;



import org.openqa.selenium.WebDriver;

import Utility.Constants;
import Utility.Utilities;
import appModules.Login;
import pageObjects.HomePage;
import pageObjects.ProfilesPage;
import pageObjects.ReusableMethods;

public class TC06 {
	
	private static WebDriver driver = null;
	public static void TC06test() throws Exception {
		// TODO Auto-generated method stub
		driver = ReusableMethods.InitializeDriver(Constants.Browser_name);
		ReusableMethods.Launch(Constants.URL,Constants.Report_path + "TC06.html","TC06");
		Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet5");
			String email = Utilities.getCellData(1,1);
			String Password = Utilities.getCellData(1, 2);
			
			Login.loginExecute(driver,email,Password);
			  
			  Login.Hopg_validation(driver);
			  HomePage.lnk_MyAccount(driver);
			  ProfilesPage.profile_btn(driver);
			  ProfilesPage.Profilepage_validation(driver);
			  ProfilesPage.upload_btn(driver);
			  try {
			  ProfilesPage.Browse_btn(driver);
			  }
			  catch(Exception e) {
			
				  Utilities.setCellData("Pass", 1, 3);
				  
			  }
			  
			 // ProfilesPage.Upload2_btn(driver);
			  
			 
			  
			  ReusableMethods.endReport();
			  ReusableMethods.teardown();

			  

	}

}
