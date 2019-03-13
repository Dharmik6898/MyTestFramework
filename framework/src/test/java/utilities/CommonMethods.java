package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

	public void acceptAlert(WebDriver driver) {
		Alert alert =  driver.switchTo().alert();
		System.out.println("This is alert text : " + alert.getText());
		alert.accept();
	}
}
