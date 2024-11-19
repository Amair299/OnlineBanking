package com.onlinebanking.banking.baseclassutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.onlinebanking.banking.genricfileutility.PropertyFileUtility;

public class BaseClass {

	public PropertyFileUtility pf = new PropertyFileUtility();
	public WebDriver driver = null;

	@BeforeSuite
	public void configBS() {
		System.out.println("Before suite");
	}

	@BeforeClass
	public void configBC() throws Exception {
		System.out.println("Before class annotation");
		//String browser = pf.getDataFromPropertiesFile("browser");
		String browser = System.getProperty("browser");
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		//String url = pf.getDataFromPropertiesFile("url");
		String url=System.getProperty("url");
		driver.get(url);
		
	}

	@BeforeMethod
	public void configBM() {
		System.out.println("Before method");
	}

	@AfterMethod
	public void configAM() {
		System.out.println("After method");
	}

	@AfterClass
	public void configAC() {
		System.out.println("After class");
		driver.quit();
	}

	@AfterSuite
	public void configAS() {
		System.out.println("After suite");
	}
}
