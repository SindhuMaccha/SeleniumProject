package pagescrolldownandup;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrollDownandUp {
	WebDriver driver;

	@Test
	public void pagescrolldown() throws InterruptedException {
		driver.get("https://www.selenium.dev/documentation/");
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,1700)");
		
		Thread.sleep(4000);	
		
		driver.findElement(By.xpath("//a[normalize-space()='About this documentation']")).click();
		Thread.sleep(2000);
	}
	
	

	@Test 
    public void IndentifyLoacatorElement() throws Exception {
		driver.get("https://www.selenium.dev/documentation/");
		Thread.sleep(1000);		
    {
        WebElement element = (WebElement) driver.findElement(By.xpath("//a[normalize-space()='About this documentation']"));
        Coordinates coordinate = ((Locatable)element).getCoordinates(); 
        coordinate.onPage(); 
        coordinate.inViewPort();
         }    
        driver.findElement(By.xpath("//a[normalize-space()='About this documentation']")).click();
      }

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
