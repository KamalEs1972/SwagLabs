package swagLabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.base.TestBase;





public class LoginPage extends TestBase {
	
	
	
	@FindBy(css="#user-name")
	WebElement username;
	
	@FindBy(css="#password")
	WebElement password;
	
	@FindBy(css=".login_logo")
	WebElement swagLogo;
	
	@FindBy(css="#login-button")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateSwagLogoImage(){
		return swagLogo.isDisplayed();
	}
	
//	public void clickLoginLink() {
//		loginLink.click();
//		
//	}
//	 
	public AccountPage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
//		    	JavascriptExecutor js = (JavascriptExecutor)driver;
//		    	js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new AccountPage();
	}
	
}


