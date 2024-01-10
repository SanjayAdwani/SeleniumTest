package TestCase;

import Page.HambugOptionPage;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class HambugOptionTest {
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
  public void HambugOption() throws InterruptedException {
	  driver.get("https://www.amazon.in/");
	  HambugOptionPage.OpenHambug(driver).click();
	  HambugOptionPage.OpenBestSeller(driver).click();
      Thread.sleep(2000);
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
