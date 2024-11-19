package com.onlinebanking.banking.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onlinebanking.banking.webdriverutility.WebDriverUtility;

public class StaffLoginPage {

	WebDriverUtility wt = new WebDriverUtility();
	public StaffLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	 @FindBy(xpath="//input[@name='staff_id']")
	 private WebElement staffUsername;
	 public WebElement getstaffUsername() {
		 return staffUsername;
	 }
	 
	 @FindBy(xpath="//input[@name='password']")
	 private WebElement staffPassword;
	 public WebElement getstaffPassword() {
		 return staffPassword;
	 }
	 
	 @FindBy(xpath="//input[@name='staff_login-btn']")
	 private WebElement loginBtn;
	 public WebElement getloginBtn() {
		 return loginBtn;
	 }
	 
	 public void staffLogin(String un,String pwd,WebDriver driver) {
		 getstaffUsername().sendKeys(un);
		 getstaffPassword().sendKeys(pwd);
		 wt.scroolTo(driver);
		 getloginBtn().click();
	 }
}
