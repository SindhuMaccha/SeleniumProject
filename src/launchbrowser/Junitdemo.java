package launchbrowser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junitdemo {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
    
	@Test
	void test1() {
		driver.get("https://www.google.com");
		
	}
	@Ignore
	@Test
	void test2() {
		driver.get("https://www.facebook.com");
		driver.navigate().back();
	}
	
	@Test
	void test3() {
		driver.get("https://www.techlearn.in");
		driver.navigate().refresh();
		driver.navigate().to("https://www.techlearn.in/placements/");
	}
	@Test
	void test4() {
		driver.get("https://www.zomato.com");
	}
	@Test
	void test5() {
		driver.get("https://www.x.com");
	}
	@Disabled
	@Test
	void test() {
		driver.get("https://www.gmail.com");
	}
	
}
