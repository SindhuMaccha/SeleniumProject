package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class J_TestNG_TCs_Run_Groups {
	WebDriver driver;
	@Test(groups="bugtool")
	public void mantisbt() {
		driver.get("https://www.mantisbt.org");
	}
	@Test(groups="food")
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test(groups={"bugtool","projecttool"})
	public void jira() {
		driver.get("https://www.jira.com");
	}
	@Test(groups="social")
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test(groups="institute")
	public void techlearn() {
		driver.get("https://www.techlearn.in");
	}
	@Test(groups="search")
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test(groups="food")
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	@Test(groups="bugtool")
	public void bugzilla() {
		driver.get("https://www.bugzilla.org");
	}
	@Test(groups="testtool")
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Test(groups="social")
	public void twitter() {
		driver.get("https://www.x.com");
	}
	@Test(groups="news")
	public void ndtv() {
		driver.get("https://www.ndtv.com");
	}
	@Test(groups={"bugtool","projecttool"})
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	@Test(groups={"search","news"})
	public void yahoo() {
		driver.get("https://www.yahoo.com");
	}
	
	@Test(groups="testtool")
	public void seleniumlearn() {
		driver.get("https://www.seleniumlearn.com");
	}

	@BeforeTest(groups={"social","bugtool"})
	public void beforeTest() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}

	

}
