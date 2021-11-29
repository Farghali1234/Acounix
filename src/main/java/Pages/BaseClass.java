package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
//	WebDriver driver;	
//	BaseClass(WebDriver driver){
//		driver=driver;	
//	}
	
	public void WaitForNotification(WebDriver driver) {
		try {new WebDriverWait(driver, 1).until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='modal-backdrop fade']"))));	}
		catch (Exception e) {
		}
	}
	
	public void WaitForClick(WebDriver driver , By Sxpath ) {
		try {
			new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(Sxpath));	
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Sxpath));
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Sxpath));
		}
		catch (Exception e) {
		}
	}
	
	public void JSClick(WebDriver driver , WebElement element ) {
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
	}
}