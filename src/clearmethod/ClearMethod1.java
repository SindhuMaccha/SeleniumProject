package clearmethod;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ClearMethod1 {
	WebDriver driver;
	
  @Test
  public void clearMethod() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("sindhu");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("maccha");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Latha");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
