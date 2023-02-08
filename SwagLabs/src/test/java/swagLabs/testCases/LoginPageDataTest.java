package swagLabs.testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SwagLabs.base.TestBase;
import com.SwagLabs.util.Log;
import com.SwagLabs.util.TestUtil;

import swagLabs.pages.LoginPageData;

public class LoginPageDataTest extends TestBase {
	
	
	
	LoginPageData loginPageData;
	//HomePage homePage;
	TestUtil testUtil;
	//ContactsPage contactsPage;
	
	String sheetName = "Sheet1";
	
	   
	public LoginPageDataTest(){
			super();
			
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		DOMConfigurator.configure("log4j.xml");
		
		Log.info("****************************** Starting test cases execution  *****************************************");
		
		initialization();
		testUtil = new TestUtil();
		loginPageData = new LoginPageData();

}
	@DataProvider
	public Object[][] getLoginData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1, dataProvider="getLoginData")
	public void validateLoginCredentials(String UserName, String PassWord) throws InterruptedException{
		
		Log.info("****************************** starting test case *****************************************");
		Log.info("****************************** loginDataTest *****************************************");
		
		//homePage.clickOnNewContactLink();
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		
		loginPageData.LoginCredentialsTest(UserName, PassWord);
		//(priority=1, dataProvider="getCRMTestData")
		//String title, String firstName, String lastName, String company
		//Thread.sleep(10);
		boolean flag = loginPageData.validateAccountLogoImage();
	Assert.assertTrue(flag);
	}
	

//@Test(priority=2)
//public void validateAccountLogoImageTest(){
//	Log.info("****************************** starting test case *****************************************");
//	Log.info("****************************** AccountLogoImageTest *****************************************");
//	boolean flag = loginPageData.validateAccountLogoImage();
//	Assert.assertTrue(flag);
//}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
