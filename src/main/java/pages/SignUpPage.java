package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage extends PageBase  {
	
	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	 
	
	@FindBy(css="input[name='firstname']")
	WebElement fnTxtBox; 
	
	@FindBy(css="input[name='lastname']")
	WebElement lnTxtBox ; 
	
	@FindBy(css="input[name='phone']")
	WebElement phoneTxtBox ; 
	
	@FindBy(css="input[name='email']")
	WebElement emailTxtBox ; 
	
	@FindBy(css="input[name='password']")
	WebElement passwordTxtBox ; 
	
	@FindBy(css="input[name='confirmpassword']")
	WebElement confirmPasswordTxtBox ; 
	
	@FindBy(css=".signupbtn.btn_full.btn.btn-success.btn-block.btn-lg")
	WebElement SignUpButton ; 
	
	@FindBy(css=".d-none.d-md-block.fl")
	WebElement MyNameMenu; 
	
	@FindBy(linkText="Logout")
     WebElement LogoutLink; 
	
	
	public void UserSignUp(String FirstName , String LastName ,String PhoneNumber , String Email , String Password) 
	{
		fnTxtBox.sendKeys(FirstName);
		lnTxtBox.sendKeys(LastName);
		phoneTxtBox.sendKeys(PhoneNumber);
		emailTxtBox.sendKeys(Email);
		passwordTxtBox.sendKeys(Password);
		confirmPasswordTxtBox.sendKeys(Password);;
		SignUpButton.submit();
	}
	
	
	public void UserLogout() throws InterruptedException
	{
		MyNameMenu.click();
		Thread.sleep(5000);
		LogoutLink.click();
		Thread.sleep(5000);
	}
	
	
}
