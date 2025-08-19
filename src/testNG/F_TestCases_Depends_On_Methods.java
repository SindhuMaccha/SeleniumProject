package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class F_TestCases_Depends_On_Methods {
	WebDriver driver;
	@Test(dependsOnMethods="method2")
	  public void method1() throws InterruptedException {
		  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Sindhu");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Sindhu@123");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		  
		  
	  }
  @Test(description="verifying the techlearn URL")
  public void method2() {
	  driver.get("https://www.techlearn.in/admin");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
