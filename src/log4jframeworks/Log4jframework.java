package log4jframeworks;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jframework {
	public class TechlearnLogin {
		WebDriver driver;

		@Test
		public void login() throws InterruptedException {
			
			Logger log= Logger.getLogger("VerifyLoginpage");
			PropertyConfigurator.configure("Log4j.properties");
			
			driver = new ChromeDriver();	
			log.info("Chrome Browser Luanched");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			log.info("Browser window Maximized");
			
			driver.get("https://www.techlearn.in/admin");
			log.info("Navigate to the Techlearn login page");
			
			Thread.sleep(2000);
			log.info("Wait for 2 Seconds");
			
			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");
			log.info("admin user enter in username or email field");
		
		}
	}
}
