package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	//Declare driver
	WebDriver driver;
	//These are some locators which is require in below methods
	By Add_Value_TxtBox= By.name("q");
	By Seacrh_Button=By.name("btnK");
	//Driver is passing in constructor
	public GoogleSearchPage(WebDriver driver) {
		this.driver=driver;
	}
	//This method is used for passing text in google search textbox 
	public void textbox(String value) {
		driver.findElement(Add_Value_TxtBox).sendKeys(value);
	}
	//This method is used for click the search button after adding text in textbox
	public void SearchButton() {
		driver.findElement(Add_Value_TxtBox).sendKeys(Keys.ENTER);
	}

}
