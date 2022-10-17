package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	//Test Data
	String username = "demo@techfios.com";
	String password = "abc123";
	String dashboardValidationText = "Dashboard";
	
	@Test
	public void validUserShouldBeAbleToLogin()
	{
		
		driver = BrowserFactory.init();
		
		//LoginPage loginPage1 = new LoginPage();
		//webdriver is not concept of java so need PageFactory
		//the way to interact with driver so we need to use pageFactory
		
		LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
		loginPage.inserUserName(username);
		loginPage.insertPassword(password);
		loginPage.signInButton(); 
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(dashboardValidationText);
		
		BrowserFactory.tearDown();
		
	}
	
}
