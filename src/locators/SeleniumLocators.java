package locators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void facebook1() throws InterruptedException {
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("ram");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Hellow@123");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("identify_email")).sendKeys("Sindhu@123");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Cancel")).click();
		Thread.sleep(2000);
	    }
	    @Test
		void facebook2() throws InterruptedException {
		driver.findElement(By.partialLinkText("Sign up")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("తెలుగు")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("English (UK)")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		
		
	}

}
