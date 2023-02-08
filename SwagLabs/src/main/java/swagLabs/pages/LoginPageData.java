package swagLabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.base.TestBase;



public class LoginPageData extends TestBase {
	
	@FindBy(css="#user-name")
	WebElement username;
	
	@FindBy(css="#password")
	WebElement password;
	
	@FindBy(css=".login_logo")
	WebElement swagLogo;
	
	@FindBy(css="#login-button")
	WebElement loginBtn;
	
	@FindBy(css=".app_logo")
	WebElement accountLogoImage;
	
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//Initializing the Page Objects:
	public LoginPageData(){
		PageFactory.initElements(driver, this);
	}
	public AccountPage1 LoginCredentialsTest(String userName, String passWord) {
				
		username.sendKeys(userName);
		password.sendKeys(passWord);
		loginBtn.click();
		
				return new AccountPage1();
}
	public boolean validateAccountLogoImage(){
		return accountLogoImage.isDisplayed();
	}
	
}