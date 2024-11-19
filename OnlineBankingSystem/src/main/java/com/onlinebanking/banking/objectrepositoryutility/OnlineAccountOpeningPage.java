package com.onlinebanking.banking.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onlinebanking.banking.webdriverutility.WebDriverUtility;

public class OnlineAccountOpeningPage {
	public OnlineAccountOpeningPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(name="gender")
	private WebElement gender;
	
	@FindBy(name="mobile")
	private WebElement mobile;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Date of Birth']")
	private WebElement dateofbirth;
	
	@FindBy(name="pan_no")
	private WebElement pan;
	
	@FindBy(name="citizenship")
	private WebElement citizenshipNum;
	
	@FindBy(name="country")
	private WebElement country;
	
	@FindBy(name="homeaddrs")
	private WebElement homeaddress;
	
	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(name="pin")
	private WebElement pinnum;
	
	@FindBy(name="arealoc")
	private WebElement areaLocality;

	@FindBy(name="acctype")
	private WebElement accountType;
	
	@FindBy(name="submit")
	private WebElement submitButton;
	
	@FindBy(name="cnfrm-submit")
	private WebElement confirmButton;
	public WebElement getconfirmButton() {
		return confirmButton;
	}
	
	public WebElement getsubmitButton() {
		return submitButton;
	}
	public WebElement getaccountType() {
		return accountType;
	}
	public WebElement getName() {
		return name;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getDateofbirth() {
		return dateofbirth;
	}

	public WebElement getPan() {
		return pan;
	}

	public WebElement getCitizenshipNum() {
		return citizenshipNum;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getHomeaddress() {
		return homeaddress;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPinnum() {
		return pinnum;
	}

	public WebElement getAreaLocality() {
		return areaLocality;
	}
	
	
	public void accountOpenForm(String name,String gender,String mobile,String email,
			String dob,String pan,String cn,
			String haddress,String state,String city,String pin,String laddress,String typeAccount) {
		getName().sendKeys(name);
		WebDriverUtility wt = new WebDriverUtility();
		wt.selectFromDropDown(gender,getGender());
		getMobile().sendKeys(mobile);
		getEmail().sendKeys(email);
		getDateofbirth().sendKeys(dob);;
		getPan().sendKeys(pan);
		getCitizenshipNum().sendKeys(cn);
		getHomeaddress().sendKeys(haddress);
		wt.selectFromDropDown(state,getState());
		wt.selectFromDropDown(city,getCity());
		getPinnum().sendKeys(pin);
		getAreaLocality().sendKeys(laddress);
		wt.selectFromDropDown(typeAccount,getaccountType());
		getsubmitButton().click();
	}
}
