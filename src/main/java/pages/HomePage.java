package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css=".bx.bx-user")
	WebElement MyaccountMenu ; 
	
	@FindBy(linkText="Sign Up")
	WebElement SignUpLink ; 
	
	
	public void OpenSignUpPage() 
	{
		MyaccountMenu.click();
		SignUpLink.click();
	}
	
	
}
