package HW.Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testSearch {
	public String website = "http://automationpractice.com/index.php";
	public WebDriver chrome;
	
	@BeforeClass
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kgrin\\Documents\\chromedriver.exe");
		chrome = new ChromeDriver();
		System.out.println("Your journey has begun");
	}
	
	@Test(groups = {"p1", "Add to Cart"})
	public void Search() {
		chrome.get(website);
		
		//Test the Search Engine
		WebElement txtSearch = chrome.findElement(By.id("search_query_top"));
		WebElement btnSearch = chrome.findElement(By.name("submit_search"));
		
		txtSearch.sendKeys("white blouse");
		btnSearch.click();
		
		txtSearch = chrome.findElement(By.id("search_query_top"));
		btnSearch = chrome.findElement(By.name("submit_search"));
		
		txtSearch.clear();
		txtSearch.sendKeys("orange shirt");
		btnSearch.click();
	}
	
	@AfterClass
	public void After() {
		chrome.quit();
		System.out.println("You just saved the princess! Your journey has ended.");
	}
}
