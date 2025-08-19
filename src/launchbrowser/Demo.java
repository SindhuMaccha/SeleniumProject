package launchbrowser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Demo {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void test() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Sindhu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Hellow@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
		
	}

}
