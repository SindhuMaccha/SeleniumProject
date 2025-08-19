package actionsclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Actionsclassmethods {
	WebDriver driver;
  @Test
  public void rightClick() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(2000);
	  
	  Actions act=new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"))).build().perform();
	  
  }
  @Test
  public void doubleClick() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/double-tap/");
	  Thread.sleep(2000);
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//button[@ondblclick='handleDoubleTap()']"))).doubleClick().build().perform();
	  //act.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='handleDoubleTap()']"))).build().perform();
  }
  @Test
  public void draganddrop() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/drag-and-drop/");
	  Thread.sleep(2000);
	  Actions act=new Actions(driver);
	  WebElement source=driver.findElement(By.xpath("//img[@id='drag1']"));
	  WebElement target=driver.findElement(By.xpath("//div[@id='div1']"));
	  act.dragAndDrop(source, target).build().perform();
  }
  @Test
  public void mouseOver() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(2000);
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Tutorials']"))).build().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[normalize-space()='Sikuli']")).click();
	 
  }
  @Test(invocationCount=5)
  public void keyboardFunctions() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  
	  Actions act=new Actions(driver);
	  act.sendKeys(Keys.TAB).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.TAB).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.TAB).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.TAB).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.TAB).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.TAB).build().perform();
	 
  }
	  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
