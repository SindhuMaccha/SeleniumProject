package screenshots;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeFormatScreenShot {
	WebDriver driver;
  @Test
  public void getScreenshot() throws InterruptedException, IOException {
	  SimpleDateFormat format=new SimpleDateFormat("yyyy_MMM_DD HH_MM_SS");
	  Date date=new Date();
	  String time=format.format(date);
	  
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("D:\\\\lib\\\\Screenshots\\\\screenshot.png"));
  }
  @Test
  public void techlearn() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Sindhu");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Hello@123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='rememberme']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
