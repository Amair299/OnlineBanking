package com.onlinebanking.practise.test;
import org.testng.annotations.Test;

import com.onlinebanking.banking.baseclassutility.BaseClass;
import com.onlinebanking.banking.genricfileutility.ExcelFileUtility;
import com.onlinebanking.banking.objectrepositoryutility.HomePage;
import com.onlinebanking.banking.objectrepositoryutility.OnlineAccountOpeningPage;
import com.onlinebanking.banking.objectrepositoryutility.StaffLoginPage;
import com.onlinebanking.banking.webdriverutility.WebDriverUtility;

public class LoginToBankTest extends BaseClass {

	@Test
	public void loginAsStaffTest() throws Exception {
		HomePage hp = new HomePage(driver);
		WebDriverUtility wt = new WebDriverUtility();
		wt.waitForPageLoad(driver);
		hp.getstaffLoginLink().click();
		StaffLoginPage sp = new StaffLoginPage(driver);
		sp.staffLogin(pf.getDataFromPropertiesFile("username"), pf.getDataFromPropertiesFile("password"),driver);
	}
	@Test
	public void createOpenAccountTest() throws Exception {
		System.out.println("Create new account test");
		WebDriverUtility wt = new WebDriverUtility();
		wt.scroolTo(driver);
		ExcelFileUtility exe = new ExcelFileUtility();
		HomePage hp = new HomePage(driver);
		hp.getopenAccountLink().click();
		OnlineAccountOpeningPage acPage = new OnlineAccountOpeningPage(driver);
		String name = exe.getDataFromExcel("CustData", 1, 1);
		String gender = exe.getDataFromExcel("CustData", 1, 2);
		
		//wt.selectFromDropDown(gender,acPage.getGender());
		String mobile = exe.getDataFromExcel("CustData", 1, 3);
		String email = exe.getDataFromExcel("CustData", 1, 4);
		String dob=exe.getDataFromExcel("CustData", 1, 5);
		String pan = exe.getDataFromExcel("CustData", 1, 6);
		String cn = exe.getDataFromExcel("CustData", 1, 7);
		String haddress = exe.getDataFromExcel("CustData", 1, 8);
		String state = exe.getDataFromExcel("CustData", 1, 9);
		//wt.selectFromDropDown(state,acPage.getState());
		String city = exe.getDataFromExcel("CustData", 1, 10);
		//wt.selectFromDropDown(city,acPage.getCity());
		String pin = exe.getDataFromExcel("CustData", 1, 11);
		String area = exe.getDataFromExcel("CustData", 1, 12);
		String acctype = exe.getDataFromExcel("CustData", 1, 13);
		//wt.selectFromDropDown(acctype,acPage.getaccountType());
		acPage.accountOpenForm(name, gender, mobile, email, dob, pan, cn, haddress, state, city, pin, area, acctype);
		wt.scroolTo(driver);
		acPage.getsubmitButton();
		wt.scroolTo(driver);
		acPage.getconfirmButton();
		wt.acceptAlert(driver);
	}
}  




























