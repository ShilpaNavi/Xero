package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FreeTrialPage {
	public static WebElement obj;
	public static WebElement txtbx_FirstName(WebDriver driver,String fname) throws Exception {
		obj = ReusableMethods.findElement((By.name("FirstName")),"FirstName",driver);
		ReusableMethods.entertext(obj,"FirstName",fname);
		return obj;

		
			}
	
 public static WebElement free_trl_btn(WebDriver driver) {
		 
		 obj = ReusableMethods.findElement((By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']")),"Free trial",driver);
		ReusableMethods.buttonClick(obj, "Free Trial");
			
			
			return obj;
	 
		 
		
	 }
 public static WebElement txtbx_LastName(WebDriver driver,String lname) throws Exception {
		obj = ReusableMethods.findElement((By.name("LastName")),"Lastname",driver);
		ReusableMethods.entertext(obj,"LastName",lname);
		return obj;

		
			}
 public static WebElement txtbx_emailadd(WebDriver driver,String emailadd) throws Exception {
		obj = ReusableMethods.findElement((By.name("EmailAddress")),"Email Address",driver);
		ReusableMethods.entertext(obj,"Email Address",emailadd);
		return obj;

		
			}
 public static WebElement txtbx_Phno(WebDriver driver,String phnno) throws Exception {
		obj = ReusableMethods.findElement((By.name("PhoneNumber")),"Phone number",driver);
		ReusableMethods.entertext(obj,"Phone number",phnno);
		return obj;

		
			}
 
 public static WebElement country_db(WebDriver driver,String value) throws Exception {
		obj = ReusableMethods.findElement((By.name("LocationCode")),"Country dd",driver);
		ReusableMethods.dropDowmMenu(obj, "Country dd", value);
		return obj;

		
			}
 
 public static WebElement agree_chkbx(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.name("TermsAccepted")),"Terms accepted",driver);
	ReusableMethods.selectCheckBox(obj, "Terms accepted");
		
		return obj;
 
	 
	
 }
 
 public static WebElement getstrtd_btn(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//span[@class='g-recaptcha-submit']")),"Get strated",driver);
	ReusableMethods.buttonClick(obj, "Get Strated");
		
		
		return obj;
 
	 
	
 }
 
 public static WebDriver FreeTrialPage_validation(WebDriver driver) {
		
		String exp = "https://www.xero.com/us/signup/";
		String act = driver.getCurrentUrl();
		System.out.println(act);
		 ReusableMethods.compareStrings(exp, act);
		
		
		return driver;
	}
 
 public static WebDriver GetStratedPage_validation(WebDriver driver) {
		
		String exp = "https://www.xero.com/us/signup/success/?xtid=x30fluidly";
		String act = driver.getCurrentUrl();
		System.out.println(act);
		 ReusableMethods.compareStrings(exp, act);
		
		
		return driver;
	}
 
public static WebElement TermsofUselink(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//a[contains(text(),'terms of use')]")),"Terms of use",driver);
	ReusableMethods.buttonClick(obj, "Terms of use");
	
	for(String winHandle:driver.getWindowHandles()) {
		driver.switchTo().window(winHandle);
	}
		
		
		return obj;
 
	 
	
 }
public static WebDriver TOFlink_validation(WebDriver driver) {
	
	
	String exp = "https://www.xero.com/us/about/terms/";
	
	String act = driver.getCurrentUrl();
	System.out.println(act);
	 ReusableMethods.compareStrings(exp, act);
	
	
	return driver;
}

public static WebElement PrivacyPolicylink(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//a[contains(text(),'privacy notice')]")),"Privacy notice",driver);
	ReusableMethods.buttonClick(obj, "Privacy Notice");
	
	for(String winHandle:driver.getWindowHandles()) {
		driver.switchTo().window(winHandle);
	}
		
		
		return obj;

	 
	
}
public static WebDriver PPlink_validation(WebDriver driver) {
	
	ReusableMethods.windowHandler(driver);
	String exp = "https://www.xero.com/us/about/privacy/";
	String act = driver.getCurrentUrl();
	System.out.println(act);
	 ReusableMethods.compareStrings(exp, act);
	
	
	return driver;
}

public static WebElement offerslink(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//a[contains(text(),'offer details')]")),"OffersLink",driver);
	ReusableMethods.buttonClick(obj, "Offers Link");
	
	for(String winHandle:driver.getWindowHandles()) {
		driver.switchTo().window(winHandle);
	}
		
		
		return obj;

	 
	
}
public static WebDriver offersink_validation(WebDriver driver) {
	ReusableMethods.windowHandler(driver);
	String exp = "https://www.xero.com/us/signup/offer-details/";
	String act = driver.getCurrentUrl();
	System.out.println(act);
	 ReusableMethods.compareStrings(exp, act);
	
	
	return driver;
}

public static WebElement acctorbklink(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//a[contains(text(),'accountant or bookkeeper')]")),"accountant or bookkeeper",driver);
	ReusableMethods.buttonClick(obj, "accountant or bookkeeper");
	
	for(String winHandle:driver.getWindowHandles()) {
		driver.switchTo().window(winHandle);
	}
		
		
		return obj;

	 
	
}
public static WebDriver actorbk_validation(WebDriver driver) {
	ReusableMethods.windowHandler(driver);
	String exp = "https://www.xero.com/us/partner-programs/partners/signup/";
	String act = driver.getCurrentUrl();
	System.out.println(act);
	 ReusableMethods.compareStrings(exp, act);
	
	
	return driver;
}

public static WebDriver Firstname_errormsg(WebDriver driver) throws InterruptedException {
	
	String exp = "First name can't be empty";
	Thread.sleep(2000);
	String act = driver.findElement(By.xpath("//span[contains(text(),\"First name can't be empty\")]")).getText();
	System.out.println(act);
	 ReusableMethods.compareStrings(exp, act);
	
	
	return driver;
}

public static WebDriver Email_errormsg(WebDriver driver) throws InterruptedException {
	
	String exp = "Email address is invalid";
	Thread.sleep(2000);
	String act = driver.findElement(By.xpath("//span[@id='signup-form-error-message-3']")).getText();
	System.out.println(act);
	 ReusableMethods.compareStrings(exp, act);
	
	
	return driver;
}



}
