package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class ReusableMethods {
	static WebDriver driver;
	public static  ExtentTest logger;
	public static ExtentReports report;
	static String path;
	public static WebElement obj;
	
		
	
	
	public static WebDriver InitializeDriver() throws WebDriverException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Naveen/Documents/chromedriver"); //To stop uninstall each time
		driver = new ChromeDriver();
		return driver;
	}
	

	public static void Launch(String url,String path,String testName) {
		driver.get(url);
		report = new ExtentReports(path);
	logger	= report.startTest(testName);
		
		
	}
	
  public static void selectCheckBox(WebElement obj,String objName ) {
		
		if(obj.isDisplayed()) {
			if(!obj.isSelected()) {
				obj.click();
				System.out.println("Pass: checkbox selected in "+objName+" field");
				logger.log(LogStatus.PASS, ""+ objName +"Checkbox selected");
			}
		else {
			System.out.println("Fail: "+objName+" could not be found");
			logger.log(LogStatus.FAIL, ""+ objName +"Checkbox not selected");
		}
		}
    }
  	    public static WebElement findElement(By location,String objName, WebDriver driver) {
		
		try {
			obj = driver.findElement(location);
			System.out.println("pass: "+objName+" Found on the page");
			logger.log(LogStatus.PASS, ""+ objName +" Found on the page");
		}
		catch(NoSuchElementException errMessage) {
			System.out.println("Fail: "+objName+" not found on the page");
			logger.log(LogStatus.FAIL, ""+ objName +" not Found on the page");
		
		}
		return obj;
	}
   	    public static void entertext(WebElement obj,String objName ,String textValue) {
		if(obj.isDisplayed()) {
			obj.clear();
			obj.sendKeys(textValue);
			System.out.println("Pass: "+textValue+" entered in "+objName+" field");
			logger.log(LogStatus.PASS, ""+ textValue +" entered on the page");
		}
		else {
			System.out.println("Fail: "+objName+" could not be found");
			logger.log(LogStatus.FAIL,"Fail: "+objName+" could not be found" );
		}
	}
   	   public static void dropDowmMenu(WebElement obj,String objName,String SelectValue) throws InterruptedException {
		if(obj.isDisplayed()) {
			obj.click();
			System.out.println("menu is clicked");
			Select select = new Select(obj);
			select.selectByVisibleText(SelectValue);
			logger.log(LogStatus.PASS, ""+SelectValue+" is selected in "+objName+" tab");
			//System.out.println("Pass: Dropdown menu selected in "+objName+" field and mysettings optinon is selected");
		}
		else {
			System.out.println("Fail: "+objName+" could not be found");
			logger.log(LogStatus.FAIL, ""+SelectValue+" is not selected in "+objName+" tab ");
		}
		
		
	}
  
     public static void buttonClick(WebElement obj,String objName) {
    	if(obj.isDisplayed()) {
			obj.click();
			System.out.println(objName+ "is clicked");
			logger.log(LogStatus.PASS,objName+ " is clicked" );
		}
		else {
			System.out.println("Fail: "+objName+" could not be found");
			logger.log(LogStatus.FAIL,objName+ " is not clicked" );
		}
		
    }
    
 	
 
   public static void compareStrings(String S1, String S2) {
	 
	   try {
		   if(S1.equals(S2)) {
		logger.log(LogStatus.PASS, S2+"Messege displayed on the window");
		   }
	  }
      catch(AssertionError a) {
    	  logger.log(LogStatus.FAIL, S2+" Messege is not displayed on the window");
      }
	   

	   
    }
   
	
    public static void windowHandler(WebDriver driver2) {
    	Set<String> getAllWindows = driver2.getWindowHandles();
		String[] allWindows = getAllWindows.toArray(new String[getAllWindows.size()]);
		driver2.switchTo().window(allWindows[0]);
		System.out.println(driver2.getCurrentUrl());
		
		driver2.manage().window().maximize();
    }
   
	
    
  



public static void teardown()
{
   /* if(result.getStatus()==ITestResult.FAILURE)
    {
        logger.log(LogStatus.FAIL, result.getThrowable());

    }*/
    driver.quit();
   
	System.out.println("End");
	
    
}

public static String[][]  readExcelData() throws IOException{
	String dt_path = "/Users/Naveen/Documents/Salesforce.xls";
	File xlfile = new File(dt_path);
	FileInputStream xlDoc = new FileInputStream(xlfile);
	HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
	HSSFSheet sheet = wb.getSheet("sheet1");
	int iRowCount = sheet.getLastRowNum();
	int iColCount = sheet.getRow(0).getLastCellNum();
	String[][] xlData = new String[iRowCount][iColCount];
	for(int i =0;i<iRowCount;i++) {
		for(int j=0;j<iColCount;j++) {
			xlData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return xlData;
}


public static void endReport() {
 report.endTest(logger);
    report.flush();
}


}
