package com.onlinebanking.banking.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
   @FindBy(xpath="//a[@href='staff_login.php']")
   private WebElement staffLoginLink;
   public WebElement getstaffLoginLink() {
	   return staffLoginLink;
   }
   
   @FindBy(xpath="//li[text()='Open Account']")
   private WebElement openAccountLink;
   public WebElement getopenAccountLink() {
	   return openAccountLink;
   }
   
   @FindBy(xpath="//li[text()='Apply Debit Card']")
   private WebElement applyDebitCardLink;
   public WebElement getapplyDebitCardLink() {
	   return applyDebitCardLink;
   }
   
   @FindBy(id="ebanking")
   private WebElement internetBankingLink;
   public WebElement getinternetBankingLink() {
	   return internetBankingLink;
   }
   
   @FindBy(xpath="//li[text()='Fund Transfer']")
   private WebElement fundTransferLink;
   public WebElement getFundTransferLink() {
	   return fundTransferLink;
   }
   
   @FindBy(xpath="//li[normalize-space()='Login']")
   private WebElement ebankingLoginLink;
   public WebElement getebankingLoginLink() {
	   return ebankingLoginLink;
   }
   @FindBy(xpath="//li[normalize-space()='Register']")
   private WebElement ebankingRegisterLink;
   public WebElement getebankingRegisterLink() {
	   return ebankingRegisterLink;
   }
}
