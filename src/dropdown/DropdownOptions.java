package dropdown;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropdownOptions {
	WebDriver driver;
  @Test
  public void dropdownvalues() throws InterruptedException {
	  driver.get("https://www.redmine.org");
	  driver.findElement(By.xpath("//a[@class=\"register\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("Sindhumaccha@gmail.com");
	  Thread.sleep(2000);
	  Select l=new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	  //l.selectByVisibleText("Turkish (Türkçe)");
	  //l.selectByValue("ko");
	  //l.selectByIndex(8);
	  l.selectByContainsVisibleText("French");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
