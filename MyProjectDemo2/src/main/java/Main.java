

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main {
	
	
WebDriver driver;
	
	By logout=By.linkText("Log Out");
	public Main(WebDriver driver) 
	{
		
		this.driver=driver;
	}

	public void clickOnLogout()
	{
		driver.findElement(logout).click();
	}

}
