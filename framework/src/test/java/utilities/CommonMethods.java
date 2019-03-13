package utilities;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods {

	public void acceptAlert(WebDriver driver) {
		Alert alert =  driver.switchTo().alert();
		System.out.println("This is alert text : " + alert.getText());
		alert.accept();
	}
	
	public int getHoverList(WebElement listHover, List<WebElement> listData, WebDriver driver) {
			
		Actions action = new Actions(driver);	
		action.moveToElement(listHover).build().perform();
		System.out.println("The size of Hover List id : " + listData.size());
		for(int i = 0; i < listData.size(); i++) {
			System.out.println("Element " + i + " " +  listData.get(i).getText());
		}
		return listData.size();
	}

}
