package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		// Because its construcor concept
		this.driver = driver;
	}
	
	//both will not work for page object model , we can use @FindBy instead of using these two
	//Because POM require annotation so we are using @FindBy
//	WebElement userNameElement = driver.findElement(By.id("username"));
//	By userNameField = By.id("username");
	
	
	//List of Elements 
	@FindBy(how = How.XPATH, using = "//input[@id = 'username']" )WebElement userNameElement;
	@FindBy(how = How.XPATH, using = "//input[@id = 'password']" )WebElement passwordElement;
	@FindBy(how = How.XPATH, using = "//button[text() = 'Sign in']" )WebElement signinElement;
	
	//Corresponding methods 
	// 2 techniques - each have different method 
	//              - combine all
	
	//1st Method - in this work hard initially but maintenance is pretty easy in this method but for login method 2nd is fine 
	public void inserUserName(String userName)
	{
		userNameElement.sendKeys(userName);
	}
	
	public void insertPassword(String password)
	{
		passwordElement.sendKeys(password);
	}
	
	public void signInButton()
	{
		signinElement.click();
	}
	
	//2Nd Method - (looks good because less code ,looks simple but if you have multiple line inside method 
	//              its hard to identify which is not working fine or failing )
	public void loginTest(String username , String password)
	{
		userNameElement.sendKeys(username);
		passwordElement.sendKeys(password);
		signinElement.click();
	}
	
	
	
	

	
	
	
	
}
