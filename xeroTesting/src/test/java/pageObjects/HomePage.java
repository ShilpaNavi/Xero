package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private static WebElement obj = null;
	 
	 public static WebElement lnk_MyAccount(WebDriver driver){
	 
			obj = ReusableMethods.findElement((By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-1']")),"Usermenu",driver);
			ReusableMethods.buttonClick(obj, "Usermenu");
			
			
			return obj;
	 
	    }
	 
	 public static WebElement lnk_LogOut(WebDriver driver) {
		 
		 obj = ReusableMethods.findElement((By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]")),"Logout",driver);
			ReusableMethods.buttonClick(obj, "Logout");
			
			
			return obj;
	 
		 
		
	 }
	 
public static WebElement Dashboard(WebDriver driver) {
		 
		 obj = ReusableMethods.findElement((By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']")),"Dashboard",driver);
			ReusableMethods.buttonClick(obj, "Dashboard");
			
			
			return obj;
	 
		 
		
	 }
public static WebElement Accounting(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//button[contains(text(),'Accounting')]")),"Accounting",driver);
		ReusableMethods.buttonClick(obj, "Accounting");
		
		
		return obj;

	 
	
}

public static WebElement Reports(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//a[contains(text(),'Reports')]")),"Reports",driver);
		ReusableMethods.buttonClick(obj, "Reports");
		
		
		return obj;

	 
	
}

public static WebElement Contacts(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//button[contains(text(),'Contacts')]")),"Contacts",driver);
		ReusableMethods.buttonClick(obj, "Contacts");
		
		
		return obj;

	 
	
}

public static WebElement App_button(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//div[@class='xrh-appbutton--body']")),"Application button",driver);
		ReusableMethods.buttonClick(obj, "Application button");
		
		
		return obj;

	 
	
}

public static WebElement Settings(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//a[contains(text(),'Settings')]")),"Settings button",driver);
		ReusableMethods.buttonClick(obj, "Settings button");
		
		
		return obj;

	 
	
}

public static WebElement Plus(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']")),"Plus button",driver);
		ReusableMethods.buttonClick(obj, "Plus button");
		
		
		return obj;

	 
	
}
public static WebElement Files(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//a[contains(text(),'Files')]")),"Files button",driver);
		ReusableMethods.buttonClick(obj, "Files button");
		
		
		return obj;

	 
	
}

public static WebElement Notifications(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//button[@title='Notifications']//div[@class='xrh-focusable--child xrh-iconwrapper']")),"notifications",driver);
		ReusableMethods.buttonClick(obj, "Notifications");
		
		
		return obj;

	 
	
}
public static WebElement Search(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//button[@title='Search']//div[@class='xrh-focusable--child xrh-iconwrapper']")),"Search",driver);
		ReusableMethods.buttonClick(obj, "Search");
		
		
		return obj;

	 
	
}
public static WebElement Help(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//button[@title='Help']//div[@class='xrh-focusable--child xrh-iconwrapper']")),"Help",driver);
		ReusableMethods.buttonClick(obj, "Help");
		
		
		return obj;

	 
	
}

public static WebElement myXero(WebDriver driver) {
	 
	 obj = ReusableMethods.findElement((By.xpath("//a[contains(text(),'My Xero')]")),"MyXero",driver);
		ReusableMethods.buttonClick(obj, "MyXero");
		
		
		return obj;

	 
	
}

}
