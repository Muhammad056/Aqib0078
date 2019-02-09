package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class facebook {

	public WebDriver driver; 
	
	By email =By.id("pass");
	By login = By.xpath("//input[@id='u_0_2']");
	By select = By.xpath("//select[@id='month']");
	
	
	public facebook(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	public WebElement getloginIn()
	{
		return driver.findElement(login);
	}
	public  WebElement Birthday()
	{
		return driver.findElement(select);
	}

	
	
	
}
