package HW.Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testCart {
	public String website = "http://automationpractice.com/index.php";
	public WebDriver chrome;
	
	@BeforeClass
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kgrin\\Documents\\chromedriver.exe");
		chrome = new ChromeDriver();
		System.out.println("Your journey has begun");
	}
	
	@Test(groups = {"p1", "Add to Cart"})
	public void Cart() {
		chrome.get(website);
		
		//Go to Product Page
		WebElement lnkProduct = chrome.findElement(By.linkText("Blouse"));
		
		lnkProduct.click();
		
		//Make Adjustments and Then Add to Cart
		//WebElement btnAdd = chrome.findElement(By.className("btn btn-default button-minus product_quantity_up"));
		WebElement btnWhite = chrome.findElement(By.id("color_8"));
		WebElement btnCart = chrome.findElement(By.name("Submit"));
		
		
		//btnAdd.click();
		btnWhite.click();
		btnCart.click();	
	}
	
	@AfterClass
	public void After() {
		chrome.quit();
		System.out.println("You just saved the princess! Your journey has ended.");
	}
}
