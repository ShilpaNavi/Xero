package appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.LoginPage;

public class Login {
	
static WebElement element;
	
	public static void loginExecute(WebDriver driver,String email, String Password) throws Exception {
		
		
		
		
		 LoginPage.txtbx_email(driver,email);
		
		LoginPage.txtbx_passwrd(driver,Password);
		
		
		LoginPage.btn_Login(driver);
		
		Thread.sleep(2000);
		
		
		
	
		
		
		
		
		
		
	}
	
	public static void forgotpassword(WebDriver driver, String email) throws Exception {
		
		LoginPage.forgot_password(driver);
		LoginPage.forgotpasswrd_validation(driver);
		LoginPage.txtbx_uname(driver, email);
		LoginPage.sendlink_btn(driver);
	}
	
	public static void errormsg(WebDriver driver) throws InterruptedException {
		LoginPage.un_pd_errormsg(driver);
	}
	
	public static void Hopg_validation(WebDriver driver) {
		
		LoginPage.Homepage_validation(driver);
		
		
	}

}
