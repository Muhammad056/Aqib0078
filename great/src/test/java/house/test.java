package house;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.facebook;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqib\\Desktop\\Selenium Lib\\chromedriver.exe");
WebDriver driver = new ChromeDriver();	
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
driver.navigate().refresh();
WebDriverWait wait = new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("aqib");
facebook ri = new facebook(driver);
ri.Email().sendKeys("sjadkljsadkljsa");


Select ml = new Select(ri.Birthday());
ml.selectByVisibleText("Mar");



driver.get("https://www.amazon.com/");
Thread.sleep(2000);
Actions action = new Actions(driver);
action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build();

driver.findElement(By.xpath("//span[contains(text(),'Your Orders')]")).click();


driver.close();
	}

}
