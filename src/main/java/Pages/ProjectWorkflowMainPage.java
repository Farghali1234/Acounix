package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectWorkflowMainPage {
	
	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public ProjectWorkflowMainPage(WebDriver driver) {
          this.driver = driver;
	}
	
	//Click on Project WorkFlow tap
	By WF = By.xpath("//ul[@id='headingThree']");
	By WFAddButton = By.xpath("//button[@class='btn btn-add mr-2']");
	
	//Method to click on clickProjectWorkFlow
	public void clickProjectWorkFlow() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='modal-backdrop fade']")));
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(WF));
		driver.findElement(WF).click();
	}
	
	//Method to click on  WorkFlow ADD button
	public void clicWFAddButton() {
		driver.findElement(WFAddButton).click();
	}
	
}

//-----JS:
//WebElement element = driver.findElement(By.id("Login"));
//JavascriptExecutor executor = (JavascriptExecutor)driver;
//executor.executeScript("arguments[0].click();", element);
//----Actions:
//WebElement element = driver.findElement(By.id("Login"));
//Actions actions = new Actions(driver);
//actions.moveToElement(element).click().build().perform();

