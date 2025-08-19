package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class E_TestCase_Description {
	WebDriver driver;

	@Test(description="Verify the Zomato URL")
	public void testcase1() {
		driver.get("https://www.zomato.com");
	}
	@Test(description="Verify the Swiggy URL")
	public void testcase2() {
		driver.get("www.swiggy.com");
	}
	@Test(description="Verify the Facebook URL")
	public void testcase3() {
		driver.get("https://www.facebook.com");
	}
	@Test(description="Verify the Google URL")
	public void testcase4() {
		driver.get("https://www.google.com");
	}
	@Test(description="Verify the SeleniumDev URL")
	public void testcase5() {
		driver.get("www.selenium.dev");
	}
	@Test(description="Verify the Twitter URL")
	public void testcase6() {
		driver.get("https://www.x.com");
	}
	@Test(description="Verify the Redmine URL")
	public void testcase7() {
		driver.get("https://www.redmine.org");
	}
	@Test(description="Verify the Techlearn URL")
	public void testcase8() {
		driver.get("www.techlearn.in");
	}
	@Test(description="Verify the Seleniumlearn URL")
	public void testcase9() {
		driver.get("www.seleniumlearn.com");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}