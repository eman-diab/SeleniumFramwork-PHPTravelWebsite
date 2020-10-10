package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(css="input[name='username']")
	WebElement emailTxtBox; 
	
	@FindBy(css="input[name='password']")
	WebElement passwordTxtBox; 
	
	@FindBy(css=".btn.btn-primary.btn-lg.btn-block.loginbtn")
	WebElement loginButton ; 
	
	@FindBy(css=".d-none.d-md-block.fl")
	WebElement MyNameMenu; 
	
	@FindBy(linkText="Logout")
	WebElement LogoutLink;
	
	
	public void UserLogin(String UserName , String Password) 
	{
		emailTxtBox.sendKeys(UserName);
		passwordTxtBox.sendKeys(Password);
		loginButton.click();
	
	}
	
	public void UserLogout()
	{
		MyNameMenu.click();
		LogoutLink.click();
	}
	
}
