package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class H_InvocationCount_Feature {
	WebDriver driver;

	@Test
	public void method1() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Chandrika");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Hello@123");
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
		
	}
	
	@Test(invocationCount=5)
	public void method2() {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Yashaswini");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Hello@123");
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


}
