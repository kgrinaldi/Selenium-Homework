package HW.Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
public WebDriver chrome;
	
	public String website = "http://automationpractice.com/index.php";

	@BeforeClass
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kgrin\\Documents\\chromedriver.exe");
		chrome = new ChromeDriver();
		System.out.println("Your journey has begun");
	}
	
	@Test(groups = {"p1", "Gamasutra"})
	public void testLoad() {
		chrome.get(website);
	}
	
	
	@AfterClass
	public void After() {
		chrome.quit();
		System.out.println("You just saved the princess! Your journey has ended.");
	}
}
