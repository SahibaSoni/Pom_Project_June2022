package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how =How.XPATH , using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")WebElement dashBoardHeaderElement;
	@FindBy(how = How.XPATH , using = "//span[text() = 'Customers']")WebElement customerElement;
	@FindBy(how = How.XPATH , using = "//a[text() = 'Add Customer']")WebElement addCustomerElement;
	
	public void  validateDashboardPage(String expectedText)
	{
		Assert.assertEquals(dashBoardHeaderElement.getText() ,expectedText  , "Page not found");
	}
	
	public void clickCustomersButton()
	{
		customerElement.click();
	}
	
	public void clickAddCustomer()
	{
		addCustomerElement.click();
	}

	
	
	

}
