package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartPage {
	WebDriver driver;
	
	
	private By OpenCart= By.id("nav-carts");
	
	public OpenCartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void OpenCart() {
		driver.findElement(OpenCart).click();
	}
}
