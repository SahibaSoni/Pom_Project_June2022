package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	
	public int generateRandomNumber(int boundaryNum)
	{
		Random r = new Random();
		int generateNum = r.nextInt(boundaryNum);
		return generateNum;
		
	}
	
	public void selectFromDropDown(WebElement element , String visibleText)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}

}
