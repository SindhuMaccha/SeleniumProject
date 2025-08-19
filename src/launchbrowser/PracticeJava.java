package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeJava {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 
		 driver=new ChromeDriver();
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.google.com");
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.facebook.com");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.zomato.com");
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.techlearn.in");
		 Thread.sleep(2000);
		 
		 driver.close();
		 

	}

}
