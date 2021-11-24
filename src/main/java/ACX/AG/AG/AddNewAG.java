package ACX.AG.AG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Pages.LoginPage;
import Pages.ProjectWorkflowMainPage;

public class AddNewAG {

	
	public void AddNewAGM(WebDriver driver) {
		
		ProjectWorkflowMainPage PWF = new ProjectWorkflowMainPage(driver);
		
		//Click on Project WorkFlow tap
		PWF.clickProjectWorkFlow();
		//Click on Add Button
		PWF.clicWFAddButton();
		
		//Write Basics Information:
	    //Enter name
		WebElement WFName= driver.findElement(By.xpath("//input[@name=\"name\"]"));
		WFName.sendKeys("Farghali");
		//Start day
		WebElement WFStartDay= driver.findElement(By.xpath("//select[@name=\"startDay\"]"));
		Select select = new Select(WFStartDay);
		select.selectByIndex(1);
		//Start Time:
		WebElement WFStartTime= driver.findElement(By.xpath("//input[@name=\"startTiming\"]"));
		WFStartTime.sendKeys("10:10");;
		//End day
		WebElement WFEndDay= driver.findElement(By.xpath("//select[@name=\"endDay\"]"));
		Select select1 = new Select(WFEndDay);
		select1.selectByIndex(2);
		//End Time:
		WebElement WFEndTime= driver.findElement(By.xpath("//input[@name=\"endingTiming\"]"));
		WFEndTime.sendKeys("22:19");
		
		//Click on Airgap Open Connection Button
		AgOpenConnection AGOpenC=new AgOpenConnection();
		AGOpenC.AgOpenConnectionSteps(driver);
		
		//Click on Airgap Close Connection Button
		AgCloseConnection AGCloseC=new AgCloseConnection();
		AGCloseC.AgCloseConnectionSteps(driver);
	    
		//Click on Add Task Group Button
		AgTaskGroup AGTaskG=new AgTaskGroup();
		AGTaskG.AgTaskGroupConnectionSteps(driver);
		
		//Click Save Button
		WebElement SButton= driver.findElement(By.xpath("(//button[@class='btn btn-save ml-3'])[3]"));
	    //WebElement SButton= driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create-workflow/div[1]/div[2]/div/div/form/div/div[6]/button[2]"));
		SButton.click();
		
	}

}

