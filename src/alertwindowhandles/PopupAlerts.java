package alertwindowhandles;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PopupAlerts {
	WebDriver driver;
  @Test
  public void alertokbuttonpress() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
  }
  @Test
  public void alertcancelbuttonpress() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().dismiss();
  }
  @Test
  public void alerttextalertokcancelbuttonpress() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().sendKeys("Sindhu");
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
  }
  @Test
  public void alerttextalertokorcancelbuttonpress() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(2000);
	  Alert alert=driver.switchTo().alert();
	  alert.sendKeys("Sindhu Maccha");
	  alert.accept();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
