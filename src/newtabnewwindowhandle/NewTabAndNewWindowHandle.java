package newtabnewwindowhandle;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTabAndNewWindowHandle {
	WebDriver driver;
  @Test
  public void teachLearn() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[normalize-space()='Downloads']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[normalize-space()='Download Eclipse']")).click();
	  Thread.sleep(2000);
	  ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  driver.findElement(By.xpath("//a[@href='https://www.eclipse.org/projects/']")).click();
	  driver.switchTo().window(tabs.get(0));
	  driver.findElement(By.xpath("//a[normalize-space()='Jobs']")).click();
  }
  @Test
  public void teachLearntoNewTab() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(2000);
	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.get("https://www.google.com");
	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.get("https://www.zomato.com");
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  driver.get("https://www.swiggy.com");
  }
  @Test
  public void teachLearntoWindow() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(2000);
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  Set<String> win=driver.getWindowHandles();
	  Object string[]=win.toArray();
	  driver.switchTo().window(string[0].toString());
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Placements')]")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
