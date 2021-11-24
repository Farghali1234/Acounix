package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		driver.findElement(WF).click();
	}
	
	//Method to click on  WorkFlow ADD button
	public void clicWFAddButton() {
		driver.findElement(WFAddButton).click();
	}

}
