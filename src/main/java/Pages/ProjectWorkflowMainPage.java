package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ReadData;

public class ProjectWorkflowMainPage extends BaseClass  {
	
	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public ProjectWorkflowMainPage(WebDriver driver) {
          this.driver = driver;
	}
	
	//Click on Project WorkFlow tap
	private By WF = By.xpath("//ul[@id='headingThree']");
	private By WFAddButton = By.xpath("//button[@class='btn btn-add mr-2']");
	private By WFName = By.xpath("//input[@name=\"name\"]");
	private By WFStartTime = By.xpath("//input[@name=\"startTiming\"]");
	private By WFEndTime = By.xpath("//input[@name=\"endingTiming\"]");
	private By WFStartDay = By.xpath("//select[@name=\"startDay\"]");
	private By WFEndDay = By.xpath("//select[@name=\"endDay\"]");
	private By SButton = By.xpath("(//button[@class='btn btn-save ml-3'])[3]");
	
	//Method to click on clickProjectWorkFlow
	public void clickProjectWorkFlow() {   
		WaitForClick(driver ,WF);
		driver.findElement(WF).click();
	}
	
	//Method to click on AirGap WorkFlow ADD button
	public void clicWFAddButton() {
		WaitForClick(driver ,WFAddButton);
		driver.findElement(WFAddButton).click();
	}
	
	//Enter name
	public void enterWFName(String PWFname) {
		driver.findElement(WFName).clear();
		driver.findElement(WFName).sendKeys(PWFname);
	}
	
	//Enter Start Time:
	public void enterWFStartTime(String WFstartTime) {
		driver.findElement(WFStartTime).clear();
		driver.findElement(WFStartTime).sendKeys(WFstartTime);
	}
	
	//Enter End Time:
	public void enterWFEndTime(String WFendTime) {
		driver.findElement(WFEndTime).clear();
		driver.findElement(WFEndTime).sendKeys(WFendTime);
	}
	
	//Start day
	public void enterWFStartDay(int x) {
		Select select = new Select(driver.findElement(WFStartDay));
		select.selectByIndex(x);
	}
	
	//End day
	public void enterWFEndDay(int x) {
		Select select = new Select(driver.findElement(WFEndDay));
		select.selectByIndex(x);
	}
	
	//Locator for Save Button field
	public void ClickSave() {
		driver.findElement(SButton).click();
		//WaitForNotification(driver);
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

