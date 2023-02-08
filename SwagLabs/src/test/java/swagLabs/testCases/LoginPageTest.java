package swagLabs.testCases;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SwagLabs.base.TestBase;
import com.SwagLabs.util.Log;

import swagLabs.pages.AccountPage;
import swagLabs.pages.LoginPage;


public class LoginPageTest extends TestBase{
	
	
	
	LoginPage loginPage;
	AccountPage accountPage;
	//Logger log = (Logger) LogManager.getLogger(LoginPageTest.class);
	
	
	
	public LoginPageTest(){
		super();
		
	}
	
	

@BeforeMethod
public void setUp(){
	DOMConfigurator.configure("log4j.xml");
//	log.info("****************************** Starting test cases execution  *****************************************");
	
	
	initialization();
	
	loginPage = new LoginPage();
	Log.startTestCase("LoginPageTest");
	Log.
	
	Log.info("entering application URL");
//	log.warn("Hey this just a warning message");
//	log.fatal("hey this is just fatal error message");
//	log.debug("this is debug message");
}

@Test(priority=1)
public void loginPageTitleTest(){
	
	Log.info("****************************** starting test case *****************************************");
	Log.info("****************************** loginPageTitleTest *****************************************");
	
	String title = loginPage.validateLoginPageTitle();
	Assert.assertEquals(title,"Swag Labs");
}

@Test(priority=2)
public void swagLogoImageTest(){
	Log.info("****************************** starting test case *****************************************");
	Log.info("****************************** swagLogoImageTest *****************************************");
	boolean flag = loginPage.validateSwagLogoImage();
	Assert.assertTrue(flag);
}

//@Test(priority=3)
//public void ClickLoginLinkTest(){
//	 loginPage.clickLoginLink();
//}
@Test(priority=3)
public void loginTest(){
	
	Log.info("****************************** starting test case *****************************************");
	Log.info("****************************** loginTest *****************************************");
	
	//loginPage.clickLoginLink();
	accountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
}



@AfterMethod
public void tearDown(){
	driver.quit();
	Log.info("****************************** Browser is closed *****************************************");

}





}


