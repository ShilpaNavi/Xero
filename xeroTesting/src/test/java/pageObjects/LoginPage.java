package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
public static WebElement obj;
	

	public static WebElement txtbx_email(WebDriver driver,String email) throws Exception {
		obj = ReusableMethods.findElement((By.id("email")),"Email",driver);
		ReusableMethods.entertext(obj,"Email",email);
		return obj;

		
			}
	
public static WebElement txtbx_passwrd(WebDriver driver,String Password) throws Exception {
	obj = ReusableMethods.findElement((By.id("password")),"Password",driver);
	ReusableMethods.entertext(obj,"Password",Password);
	
		return obj;
	}

public static WebElement btn_Login(WebDriver driver) {
	
	obj = ReusableMethods.findElement((By.id("submitButton")),"Login",driver);
	ReusableMethods.buttonClick(obj, "Login");
	
	
	return obj;
}

public static WebDriver Homepage_validation(WebDriver driver) {
	
	String exp = "https://go.xero.com/Dashboard/";
	String act = driver.getCurrentUrl();
	System.out.println(act);
	 ReusableMethods.compareStrings(exp, act);
	
	
	return driver;
}

public static WebElement forgot_password(WebDriver driver) {
	
	obj = ReusableMethods.findElement((By.xpath("//a[@class='forgot-password-advert']")),"Forgot Password",driver);
	ReusableMethods.buttonClick(obj, "Forgot Password");
	
	return obj;
	
}

public static WebDriver forgotpasswrd_validation(WebDriver driver) {
	
	String exp = "https://login.xero.com/ForgottenPassword";
	String act = driver.getCurrentUrl();
	System.out.println(act);
	 ReusableMethods.compareStrings(exp, act);
	
	
	return driver;
}
public static WebElement txtbx_uname(WebDriver driver,String email) throws Exception {
	obj = ReusableMethods.findElement((By.id("UserName")),"Username",driver);
	ReusableMethods.entertext(obj,"Username",email);
	return obj;

	
		}

public static WebElement sendlink_btn(WebDriver driver) {
	
	obj = ReusableMethods.findElement((By.xpath("//a[@class='x-btn blue']")),"SendLink",driver);
	ReusableMethods.buttonClick(obj, "SendLink");
	
	
	return obj;
}

public static WebDriver un_pd_errormsg(WebDriver driver) throws InterruptedException {
	
	String exp = "Your email or password is incorrect";
	Thread.sleep(2000);
	String act = driver.findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]")).getText();
	System.out.println(act);
	 ReusableMethods.compareStrings(exp, act);
	
	
	return driver;
}


}
