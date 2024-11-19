package com.onlinebanking.banking.webdriverutility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	public void waitForPageLoad(WebDriver driver) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	
	public void scroolTo(WebDriver driver) {
		JavascriptExecutor  j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,2000)","");
	}
	
	public void selectFromDropDown(String value,WebElement element) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void mouseOverElement(WebDriver driver,WebElement date) {
		 Actions a1 = new Actions(driver);
		 a1.moveToElement(date).build().perform();;
	}
}
















