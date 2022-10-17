package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {

		
	    WebDriver driver;
	    String username = "demo@techfios.com";
		String password = "abc123";
		String dashboardValidationText = "Dashboard";
		String fullName = "Selenium";
		String company = "Techfios";
		String email = "selenium@gmail.com";

		@Test
	    public void userShouldBeAbleToAddCustomer()
	    {
	    	driver = BrowserFactory.init();
	    	

			LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
			loginPage.inserUserName(username);
			loginPage.insertPassword(password);
			loginPage.signInButton(); 
			
			DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
			dashboardPage.validateDashboardPage(dashboardValidationText);
			dashboardPage.clickCustomersButton();
			dashboardPage.clickAddCustomer();
			
			AddContactPage addContact = PageFactory.initElements(driver, AddContactPage.class);
			addContact.insertFullName(fullName);
			addContact.selectCompany(company);
			addContact.insertEmail(email);
			
			//BrowserFactory.tearDown();
			
	    }
}
