package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage extends BasePage
{

	WebDriver driver;
	
	public AddContactPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH , using =  "//input[@id = 'account']")WebElement fullnameElement;
	@FindBy(how = How.XPATH , using =  "//select[@id = 'cid']")WebElement companyElement;
	@FindBy(how = How.XPATH , using =  "//input[@id = 'email']")WebElement emailElement;
	
	public void insertFullName(String FullName)
	{
		fullnameElement.sendKeys(FullName + generateRandomNumber(999));
	}
	
	public void selectCompany(String company)
	{
		selectFromDropDown(companyElement , company);
	}
	
	public void insertEmail(String Email)
	{
		emailElement.sendKeys(generateRandomNumber(999) + Email);
	}

}
