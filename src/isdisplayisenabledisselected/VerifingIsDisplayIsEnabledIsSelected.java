package isdisplayisenabledisselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifingIsDisplayIsEnabledIsSelected {
	WebDriver driver;
  @Test
  public void isDisplay() {
	  driver.get("https://www.techlearn.in/admin");
	  boolean lyp=driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).isDisplayed();
	  if(lyp==true)
	  {
		  System.out.println("Lost your password text is visible or presented in the login page");
		  driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
	  }
	  else
	  {
		  System.out.println("Lost your password text is Not visible or presented in the login page");
	  }
  }
  @Test
  public void isEnabled() {
	  driver.get("https://www.techlearn.in/admin");
	  boolean username=driver.findElement(By.xpath("//input[@id='user_login']")).isEnabled();
	  if(username==true)
	  {
		  System.out.println("Username or Email text field is enabled to the enter username");
		  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Sindhu");
	  }
	  else
	  {
		  System.out.println("Username or Email text field is disabled to the enter username");
	  }
  }
  @Test
  public void isSelected() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	  boolean checkbox=driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
	  if(checkbox==true)
	  {
		  System.out.println("Remember me check box is Selected");
	  }
	  else
	  {
		  System.out.println("Remember me check box is Not Selected");
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
