package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;

public class Home {
	
	public static void HomeExecute(WebDriver driver) {
		HomePage.lnk_MyAccount(driver);
		System.out.println("My account found");
		HomePage.lnk_LogOut(driver);
	}


}
