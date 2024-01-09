package TestCase;

import org.testng.annotations.Test;

import Page.AmazonLoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AmazonLoginTest {
	WebDriver driver;
	String projectpath;
	
	 @BeforeTest
	  public void beforeTest() {
		  projectpath= System.getProperty("user.dir");
		  //System.out.println(projectpath);
		  System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe");
		  driver= new ChromeDriver();
	  }
	
  @Test
  public void CheckLogin() throws InterruptedException {
	  driver.get("https://www.amazon.in/");
	  AmazonLoginPage.OpenSignbutton(driver).click();
		AmazonLoginPage.AddID(driver).sendKeys("Sanjayadwani2105@gmail.com");
		AmazonLoginPage.Continue(driver).sendKeys(Keys.RETURN);
		AmazonLoginPage.AddPassword(driver).sendKeys("Sanjaya@12");
		AmazonLoginPage.SignIn(driver).sendKeys(Keys.RETURN);  
		Thread.sleep(2000);
  }
 

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
