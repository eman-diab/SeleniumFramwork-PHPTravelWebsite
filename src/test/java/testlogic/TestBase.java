package testlogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.Helper;

public class TestBase {
	
public static WebDriver driver ; 
	

	@BeforeSuite 
	public void OpenDriver() 
	{
		System.setProperty("webdriver.chrome.driver", "Source/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
	} 
	
	
	@AfterSuite
	public void CloseDriver() 
	{
		driver.quit();
	}
	

	// take screenshot for fail test case and add it in the Screenshot folder
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("Failed!");
			System.out.println("Taking Screenshot....");
			Helper.captureScreenshot(driver, result.getName());
		}
	}
}
