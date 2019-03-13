/**
 * 
 */
/**
 * @author dharm
 *
 */
package com.dharmik.page;

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


	public int getOrderList() {
		WebElement listHover = driver.findElement(By.xpath("//a[@id = 'nav-link-yourAccount' ]"));
		List<WebElement> listData = driver.findElements(By.xpath("(//*[@class='nav-template nav-flyout-content nav-tpl-itemList'])[3]/a/span"));
		return common.getHoverList(listHover, listData, driver);
	}


	public void closeBrowser() {
		driver.close();
		
	}


	public void alertAccept() {
		WebElement popUp = driver.findElement(By.xpath("//*[@id='content']/p[8]/button"));
		popUp.click();
		common.acceptAlert(driver);
	}


	public String getAppTitle() {
		// TODO Auto-generated method stub
		WebElement element = driver.findElement(By.xpath("//*[@class='gb_x gb_Vb']"));
		return element.getAttribute("title");
	}

	
}
