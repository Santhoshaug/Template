package com.zysk.vi.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zysk.vi.qa.pages.HomePage;
import com.zysk.vi.qa.pages.LoginPage;
import com.zysk.vidyawin.base.BaseTest;

public class HomePageTest extends BaseTest {
	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Address Health | Healthy children Happy children");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest(){
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	@Test(priority = 3)
	public void selectInfirmary() throws InterruptedException
	{
		homePage.selectInfirmary();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
