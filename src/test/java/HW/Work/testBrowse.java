package HW.Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testBrowse {
	public String website = "http://automationpractice.com/index.php";
	public WebDriver chrome;
	
	
	@BeforeClass
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kgrin\\Documents\\chromedriver.exe");
		chrome = new ChromeDriver();
		System.out.println("Your journey has begun");
	}

	@Test(groups = {"p1", "Sign In"})
	public void Browse() {
		chrome.get(website);

		//Click Link to View a Product
		WebElement btnProduct = chrome.findElement(By.linkText("Faded Short Sleeve T-shirts"));
		btnProduct.click();
	
	}
	
	@AfterClass
	public void After() {
		chrome.quit();
		System.out.println("You just saved the princess! Your journey has ended.");
	}
	
}
