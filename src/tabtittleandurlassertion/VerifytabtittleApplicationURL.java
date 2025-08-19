package tabtittleandurlassertion;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifytabtittleApplicationURL {
	WebDriver driver;
  @Test
  public void verifyTabText() {
	  driver.get("https://www.google.com");
	  String expectedot="Google";
	  String actualot=driver.getTitle();
	  Assert.assertEquals(actualot, expectedot);
  }
  @Test
  public void verifyTabURL() {
	  driver.get("https://www.google.com");
	  String expectedot="https://www.google.com/";
	  String actualot=driver.getCurrentUrl();
	  Assert.assertEquals(actualot, expectedot);
  }
  @Test
  public void verifypageText() {
	  driver.get("https://www.google.com");
	  String expectedot="Gmail";
	  String actualot=driver.findElement(By.xpath("//a[text()=\"Gmail\"]")).getText();
	  Assert.assertEquals(actualot, expectedot);
  }
  @Test
  public void verifypageText1() {
	  driver.get("https://www.google.com");
	  String expectedot="Images";
	  String actualot=driver.findElement(By.xpath("//*[text()=\"Images\"]")).getText();
	  Assert.assertEquals(actualot, expectedot);
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
