package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HambugOptionPage {
	static WebElement element=null;
	
	//This method is used to open the sign in page
		public static WebElement OpenHambug(WebDriver driver) {
			element=driver.findElement(By.id("nav-hamburger-menu"));
			return element;
		}
		
		public static WebElement OpenBestSeller(WebDriver driver) {
			element=driver.findElement(By.linkText("Best Sellers"));
			return element;
		}

}
