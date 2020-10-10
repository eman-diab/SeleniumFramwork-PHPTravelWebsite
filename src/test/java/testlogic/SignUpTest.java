package testlogic;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import inputData.ExcelRead;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;


public class SignUpTest extends TestBase {
	
	HomePage homeObject ; 
	SignUpPage signupObject ; 
    LoginPage loginObject ;
    
    
    @DataProvider(name="ExcelData")
	public Object[][] userRegisterData() throws IOException
	{
		// Get data from Excel Reader class 
		ExcelRead ER = new ExcelRead();
		return ER.getExcelData();
	}
    
    
	@Test(priority=1, dataProvider="ExcelData")
	public void UserSignUpWithValidData(String firstname , String lastname , String phone, String email , String password) throws InterruptedException
	{
		//User open home page
		homeObject = new HomePage(driver); 
		homeObject.OpenSignUpPage();
		
		//User Sign up 
		signupObject = new SignUpPage(driver); 
		signupObject.UserSignUp(firstname, lastname, phone, email, password);
		Thread.sleep(5000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.phptravels.net/account/");
		signupObject.UserLogout();
	
		
		//verify that the user can login.
		loginObject = new LoginPage(driver);
		loginObject.UserLogin(email, password);
		Thread.sleep(5000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.phptravels.net/account/");
		signupObject.UserLogout();
		
	}
	

}
