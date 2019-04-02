package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyxeroPage {
	
	public static WebElement obj;
	public static WebDriver myxero_validation(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(2000);
		//String exp = "https://my.xero.com/!xkcD/Dashboard";
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		 Thread.sleep(2000);
		/* String act=driver.getCurrentUrl();
		System.out.println(act);
		 ReusableMethods.compareStrings(exp, act);*/
		
		
		return driver;
	}
	
	public static WebElement Addanorg_btn(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(1000);
		 
		 obj = ReusableMethods.findElement((By.id("ext-gen1042")),"Add an organisation",driver);
			ReusableMethods.buttonClick(obj, "add an organization");
			
			
			return obj;
	}
	
public static WebDriver Addanorgpage_validation(WebDriver driver) throws InterruptedException {
		
	ReusableMethods.windowHandler(driver);
		String exp = "https://my.xero.com/!xkcD/Organisation/Setup";
		Thread.sleep(2000);
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		/*String act = driver.getCurrentUrl();
		System.out.println(act);
		 ReusableMethods.compareStrings(exp, act);*/
		
		
		return driver;
	}

public static WebElement Orgname(WebDriver driver,String OrgName) throws Exception {
	obj = ReusableMethods.findElement((By.id("text-1022-inputEl")),"Name of organization",driver);
	ReusableMethods.entertext(obj,"Name of Organization",OrgName);
	
		return obj;
	}

public static WebElement paytaxex_dd(WebDriver driver,String pvalue) throws Exception {
	obj = ReusableMethods.findElement((By.id("countryCmb-inputEl")),"Pay Taxes dd",driver);
	ReusableMethods.entertext(obj, "Pay Taxesdd", pvalue);
	return obj;

	
		}

public static WebElement Time_dd(WebDriver driver,String Tvalue) throws Exception {
	obj = ReusableMethods.findElement((By.id("cmbTimeZone-inputEl")),"Time dd",driver);
	ReusableMethods.entertext(obj, "Time dd", Tvalue);
	return obj;

	
		}
public static WebElement OrgDo(WebDriver driver,String OrgDo) throws Exception {
	obj = ReusableMethods.findElement((By.id("industrysearchcombofield-1025-inputEl")),"organization DO",driver);
	ReusableMethods.entertext(obj," Organization DO",OrgDo);
	
		return obj;
	}

public static WebElement Software_dd(WebDriver driver,String svalue) throws Exception {
	obj = ReusableMethods.findElement((By.id("combo-1029-inputEl")),"Software dd",driver);
	//ReusableMethods.entertext(obj, "Software dd", svalue);
	return obj;

	
		}
public static WebElement AddNewTrial_btn(WebDriver driver) throws InterruptedException {
	
	Thread.sleep(1000);
	 
	 obj = ReusableMethods.findElement((By.id("simplebutton-1035")),"Add New Trial",driver);
		ReusableMethods.buttonClick(obj, "Add New Trial");
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		
		return obj;
}

public static WebElement Purchase_btn(WebDriver driver) throws InterruptedException {
	
	Thread.sleep(1000);
	 
	 obj = ReusableMethods.findElement((By.xpath("//a[@id='simplebutton-1036']")),"Buy now button",driver);
		//ReusableMethods.buttonClick(obj, "Buy now Button");
		
		
		return obj;
}
	

}
