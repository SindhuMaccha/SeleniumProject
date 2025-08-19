package uploadfileusingselenuim;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class UploadFileUsingSelenium {
	WebDriver driver;
  @Test
  public void attachfile() throws InterruptedException {
	  driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"myFile\"]")).sendKeys("D:\\testing classes\\Development.jpeg");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
