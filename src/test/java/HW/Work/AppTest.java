package HW.Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
	public WebDriver chrome;
	public String website = "http://automationpractice.com/index.php";

	@BeforeClass
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kgrin\\Documents\\chromedriver.exe");
		chrome = new ChromeDriver();
		System.out.println("Your journey has begun");
	}
	
	@Test(groups = {"p1", "Register"})
	public void testRegister() throws InterruptedException {
		chrome.get(website);
		
		//Get to Sign In screen
		
		WebElement btnSignIn = chrome.findElement(By.className("header_user_info"));
		btnSignIn.click();
		
		
		//Enter email to begin the registration process
		WebElement txtRegister = chrome.findElement(By.id("email_create"));
		WebElement btnCreate = chrome.findElement(By.id("SubmitCreate"));
		txtRegister.sendKeys("madeupemail@gmail.com");
		btnCreate.click();
		
		Thread.sleep(5000);
		
		//Enter additional info for registration process		
		Select birthdate;
		Select state;
		
		WebElement btnGender = chrome.findElement(By.id("uniform-id_gender1"));
		WebElement txtFirst = chrome.findElement(By.name("customer_firstname"));
		WebElement txtLast = chrome.findElement(By.id("customer_lastname"));
		WebElement txtPassword = chrome.findElement(By.id("passwd"));
		WebElement menuDays = chrome.findElement(By.id("days"));
		WebElement menuMonths = chrome.findElement(By.id("months"));
		WebElement menuYears = chrome.findElement(By.id("years"));
		WebElement txtFirstTwo = chrome.findElement(By.id("firstname"));
		WebElement txtLastTwo = chrome.findElement(By.id("lastname"));
		WebElement txtAddress = chrome.findElement(By.id("address1"));
		WebElement txtCity = chrome.findElement(By.id("city"));
		WebElement menuState = chrome.findElement(By.id("id_state"));
		WebElement txtPostal = chrome.findElement(By.id("postcode"));
		WebElement txtCell = chrome.findElement(By.id("phone_mobile"));
		WebElement txtAlias = chrome.findElement(By.id("alias"));
		WebElement btnRegister = chrome.findElement(By.id("submitAccount"));
		
		btnGender.click();
		txtFirst.sendKeys("Kevin");
		txtLast.sendKeys("Rinaldi");
		txtPassword.sendKeys("Mei17");
		menuDays.click();
		birthdate = new Select(menuDays);
		birthdate.selectByIndex(1);
		menuMonths.click();
		birthdate = new Select(menuMonths);
		birthdate.selectByIndex(1);
		menuYears.click();
		birthdate = new Select(menuYears);
		birthdate.selectByIndex(20);
		txtAddress.sendKeys("123 Fake St");
		txtCity.sendKeys("Springfield");
		menuState.click();
		state = new Select(menuState);
		state.selectByVisibleText("California");
		txtPostal.sendKeys("12345");
		txtCell.sendKeys("(123)-456-7890");
		txtAlias.sendKeys("something@gmail.com");
		
		//Complete Registration
		//btnRegister.click();
	}
	
	
	@AfterClass
	public void After() {
		chrome.quit();
		System.out.println("You just saved the princess! Your journey has ended.");
	}
}
