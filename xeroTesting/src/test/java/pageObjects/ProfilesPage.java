package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilesPage {
	
public static WebElement obj;
	
	public static WebElement profile_btn(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		obj = ReusableMethods.findElement((By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ol[2]/li[5]/div[1]/div[2]/div[1]/ol[1]/li[1]/a[1]")),"Profile button",driver);
		ReusableMethods.buttonClick(obj, "Profile button");
		Thread.sleep(2000);
		
		
		return obj;
	}
	
	public static WebDriver Profilepage_validation(WebDriver driver) {
		
		String exp = "https://my.xero.com/!xkcD/Settings/User";
		String act = driver.getCurrentUrl();
		System.out.println(act);
		 ReusableMethods.compareStrings(exp, act);
		
		
		return driver;
	}
	
public static WebElement upload_btn(WebDriver driver) throws InterruptedException {
		
		obj = ReusableMethods.findElement((By.xpath("//div[@id='button-1041']")),"Upload button",driver);
		ReusableMethods.buttonClick(obj, "Upload button");
		Thread.sleep(1000);
		
		
		return obj;
	}
public static WebElement Browse_btn(WebDriver driver) throws InterruptedException {
	
	
	obj = ReusableMethods.findElement((By.xpath("//div[@id='filefield-1174-button']")),"Browse button",driver);
	Thread.sleep(2000);
	ReusableMethods.buttonClick(obj, "Browse button");
	Thread.sleep(2000);
	
	obj.sendKeys("/Users/Naveen/Desktop/panda.jpeg");
	
	return obj;
}

public static WebElement Upload2_btn(WebDriver driver) throws InterruptedException {
	
	
	obj = ReusableMethods.findElement((By.xpath("//div[@id='button-1192']")),"Upload2 button",driver);
	ReusableMethods.buttonClick(obj, "Upload2 button");
	
	return obj;
}

}
