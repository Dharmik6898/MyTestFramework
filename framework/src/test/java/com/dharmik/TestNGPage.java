package com.dharmik;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.CommonMethods;
import utilities.DriverSetup;



public class TestNGPage {

	WebDriver driver = null;
	DriverSetup driverSetup = new DriverSetup();
	CommonMethods common = new CommonMethods();
	
	public void openPage(String url) {
		driver = driverSetup.getChromeDriver();
		driver.get(url);
	}


	public void getOrderList() {
		Actions action = new Actions(driver);	
		WebElement yourOrder = driver.findElement(By.id("nav-link-yourAccount"));
		action.moveToElement(yourOrder).build().perform();
		List<WebElement> orderList = driver.findElements(By.xpath("(//*[@class='nav-template nav-flyout-content nav-tpl-itemList'])[3]/a/span"));
		System.out.println(orderList.size());
	}


	public void closeBrowser() {
		driver.close();
		
	}


	public void alertAccept() {
		WebElement popUp = driver.findElement(By.xpath("//*[@id='content']/p[8]/button"));
		popUp.click();
		common.acceptAlert(driver);
	}

	
}
