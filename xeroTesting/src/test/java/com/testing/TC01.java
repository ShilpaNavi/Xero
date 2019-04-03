package com.testing;



import org.openqa.selenium.WebDriver;

import Utility.Constants;
import Utility.Utilities;
import appModules.Home;
import appModules.Login;
import pageObjects.ReusableMethods;

public class TC01 {
	
	private static WebDriver driver = null;
	 
	;
	
	public static void TC01test() throws Exception {
		
		driver = ReusableMethods.InitializeDriver(Constants.Browser_name);
	
	  
		driver = testcase1a();
		driver = testcase1b();
		driver = testcase1c();
		//driver = testcase1d();

	 ReusableMethods.teardown();
	 
		
	}
	

	public static WebDriver testcase1a() throws Exception {
	ReusableMethods.Launch(Constants.URL,Constants.Report_path + "TC01a.html","TC01A");
	Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet1");
		String email = Utilities.getCellData(1,1);
		String Password = Utilities.getCellData(1, 2);
		
	  Login.loginExecute(driver,email,Password);
	  
	  Login.Hopg_validation(driver);
	  Home.HomeExecute(driver);
	  
	  Utilities.setCellData("Pass", 1, 3);
	  
	  ReusableMethods.endReport();
	  
	  return driver;
	  
	}
	
	public static WebDriver testcase1b() throws Exception {
		ReusableMethods.Launch(Constants.URL,Constants.Report_path + "TC01b.html","TC01B");
		
		Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet1");
		
		String email = Utilities.getCellData(2,1);
		String Password = Utilities.getCellData(2, 2);
		
	  Login.loginExecute(driver,email,Password);
	  
	  Login.errormsg(driver);
	  
	  Utilities.setCellData("Pass", 2, 3);
	  
	  
	  ReusableMethods.endReport();
	  
	  return driver;
	}
	
	public static WebDriver testcase1c() throws Exception {
		ReusableMethods.Launch(Constants.URL,Constants.Report_path+ "TC01c"+ ".html","TC01C"); 
		Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet1");
		
		String email = Utilities.getCellData(3,1);
		String Password = Utilities.getCellData(3, 2);
		
	   Login.loginExecute(driver,email,Password);
	   
	   Login.errormsg(driver);
	  
	   Utilities.setCellData("Pass", 3, 3);
	   ReusableMethods.endReport();
		  
	  return driver;
	 
	  
		
	}
	
	public static WebDriver testcase1d() throws Exception {
		ReusableMethods.Launch(Constants.URL,Constants.Report_path + "TC01d"+".html","TC01D"); 
		Utilities.setExcelFile(Constants.path_TestData + Constants.File_TestData,"Sheet1");
		
		String email = Utilities.getCellData(4,1);
		
	   Login.forgotpassword(driver,email);
	   Utilities.setCellData("Pass", 4, 3);
	   
	   ReusableMethods.endReport();
		  
	  return driver;
		
		
	}
	

}
