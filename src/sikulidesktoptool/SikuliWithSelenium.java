package sikulidesktoptool;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikuliWithSelenium {
	WebDriver driver;
	Screen s=new Screen();
  @Test
  public void techlearn() throws InterruptedException, FindFailed {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(2000);
	  s.click("D:\\lib\\sikulipictures\\A.PNG");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
