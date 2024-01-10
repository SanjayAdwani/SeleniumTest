package TestCase;

import org.testng.annotations.Test;

import Page.OpenCartPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OpenCartTest {
	WebDriver driver;
	String projectpath;
	  OpenCartPage Cart=null;
	
	
	@BeforeTest
	  public void beforeTest() {
		 projectpath= System.getProperty("user.dir");
		  //System.out.println(projectpath);
		  System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe");
		  driver= new ChromeDriver();
		  Cart= new OpenCartPage(driver);
	  }
	
  @Test
  public void OpenCart() throws InterruptedException {
	  driver.get("https://www.amazon.in/");
	  Cart.OpenCart();
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
