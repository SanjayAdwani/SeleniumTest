package TestCase;

import org.testng.annotations.Test;

import Page.GoogleSearchPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class GoogleSearchTest {
	WebDriver driver;
	String projectpath;
	GoogleSearchPage page=null;
	
	@BeforeTest
	  public void beforeTest() {
		 projectpath= System.getProperty("user.dir");
		  //System.out.println(projectpath);
		  System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe");
		  driver= new ChromeDriver();
		  page= new GoogleSearchPage(driver);
	  } 
	
  @Test
  public void Search() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  page.textbox("Amazon");
	  page.SearchButton();
	  Thread.sleep(2000);
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
