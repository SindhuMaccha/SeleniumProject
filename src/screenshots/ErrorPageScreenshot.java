package screenshots;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ErrorPageScreenshot {
WebDriver driver;

public void errorPageLineScreenshot() throws Exception {	
	
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("D:\\lib\\Screenshots\\ErrorPageScreenshot.png"));
}
		
	@Test
	public void techlearnlogin() throws Exception {
		driver.get("https://www.techlearn.in/admin");	
		
		try
		{
				
		driver.findElement(By.id("user_login")).sendKeys("Sindhu");
		Thread.sleep(1000);
	
		driver.findElement(By.name("pwd")).sendKeys("Hello@123");
		Thread.sleep(1000);
		
		driver.findElement(By.id("rememberme")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("wp-submit")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("wp-login-lost-password")).click();
		Thread.sleep(1000);
		}
		
		catch(Exception e)
		{
			System.out.println("Error due to : "+e);
			errorPageLineScreenshot();
		}
		
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}