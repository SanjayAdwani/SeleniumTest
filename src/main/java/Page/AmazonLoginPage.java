package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLoginPage {
	
	static WebElement element=null;
	//This method is used to open the sign in page
	public static WebElement OpenSignbutton(WebDriver driver) {
		element=driver.findElement(By.id("nav-link-accountList"));
		return element;
	}
	// This method is used to locate login id textbox
	public static WebElement AddID(WebDriver driver) {
		element=driver.findElement(By.name("email"));
		return element;
	}
	//This method is used to locate the continue button during login
	public static WebElement Continue(WebDriver driver) {
		element=driver.findElement(By.className("a-button-input"));
		return element;
	}

	//This method is used to locate password textbox
	public static WebElement AddPassword(WebDriver driver) {
		element=driver.findElement(By.id("ap_password"));
		return element;
	}
	//This method is used to locate the sign in button during login
	public static WebElement SignIn(WebDriver driver) {
		element=driver.findElement(By.id("signInSubmit"));
		return element;
	}

}
