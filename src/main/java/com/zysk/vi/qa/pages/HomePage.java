package com.zysk.vi.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zysk.vidyawin.base.BaseTest;

public class HomePage extends BaseTest {

	@FindBy(xpath = "(//h2)[1]")
	@CacheLookup            //create a small memory and store this variable it sppeds the execution, // i can use this in save button scrolling option
	WebElement userNameLabel;

	@FindBy(xpath = "//select[@id='infirmary']")
	WebElement infirmaryDropdown;
	
	@FindBy(xpath = "(//div[@class='text-sm']/a)[1]")
	WebElement complaintsViewAll;
	

	@FindBy(xpath = "(//div[.='View all'])[1]")
	WebElement suppliesViewAll;


	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	public void selectInfirmary() throws InterruptedException{
		Select select=new Select(infirmaryDropdown);
		select.selectByIndex(1);
		Thread.sleep(2000);
	}

}
