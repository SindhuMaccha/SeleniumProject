package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class D_TestCases_Skip_Disabled_Ignore {
	
		WebDriver driver;

		@Test(priority=3, enabled=false)
		public void zomato() {
			driver.get("https://www.zomato.com");
		}
		@Test(priority=2)
		public void swiggy() {
			driver.get("https://www.swiggy.com");
		}
		@Test(enabled=false, priority=5)
		public void facebook() {
			driver.get("https://www.facebook.com");
		}
		@Ignore
		@Test(priority=1)
		public void google() {
			driver.get("https://www.google.com");
		}
		@Test(priority=4)
		public void selenium() {
			driver.get("https://www.selenium.dev");
		}
		@Test(priority=0, enabled=true)
		public void twitter() {
			driver.get("https://www.x.com");
		}

		@BeforeTest
		public void beforeTest() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

	}
