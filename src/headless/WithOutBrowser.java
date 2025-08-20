package headless;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class WithOutBrowser {
	WebDriver driver;
      @Test
	  public void withoutbrowser() {
		  
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("headless");
		  driver=new ChromeDriver(co);  
		  driver.get("https://www.seleniumlearn.com/");
		  
		  String exptab = "Home - Seleniumlearn.com";
		  
		  String acttab = driver.getTitle();
		  
		  Assert.assertEquals(acttab, exptab);
	  
	  }
   }
	
  

