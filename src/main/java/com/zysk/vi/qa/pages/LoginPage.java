package com.zysk.vi.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zysk.vidyawin.base.BaseTest;

public class LoginPage extends BaseTest{
	
	//Page Factory - OR:
	@FindBy(name="phone_number")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[contains(@class,'h-12 w-auto')]")
	WebElement addressHealthLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateAddressHealthImage(){
		return addressHealthLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		    //	JavascriptExecutor js = (JavascriptExecutor)driver;
		    //	js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	}
	
}
