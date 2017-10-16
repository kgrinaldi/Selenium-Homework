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

public class AppTestTwo {
	public String website = "http://automationpractice.com/index.php";
	public WebDriver chrome;
	
	@BeforeClass
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kgrin\\Documents\\chromedriver.exe");
		chrome = new ChromeDriver();
		System.out.println("Your journey has begun");
	}
	
	@Test(groups = {"p1", "Sign In"})
	public void testSignIn() {
		chrome.get(website);
		
		//Get to Sign In screen
		WebElement btnSignIn = chrome.findElement(By.className("header_user_info"));
		btnSignIn.click();
		
		//Sign In
		WebElement txtEmail = chrome.findElement(By.id("email"));
		WebElement txtPassword = chrome.findElement(By.id("passwd"));
		WebElement btnLogin = chrome.findElement(By.id("SubmitLogin"));
		
		txtEmail.sendKeys("kgrinaldi@gmail.com");
		txtPassword.sendKeys("Gdayfn-2008");
		btnLogin.click();
		
		//Sign Out
		WebElement btnLogout = chrome.findElement(By.className("logout"));
		btnLogout.click();
	}
	
	
	@AfterClass
	public void After() {
		chrome.quit();
		System.out.println("You just saved the princess! Your journey has ended.");
	}

}
