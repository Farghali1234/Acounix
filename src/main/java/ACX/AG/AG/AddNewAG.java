package ACX.AG.AG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LoginPage;
import Pages.ProjectWorkflowMainPage;
import utilities.ReadData;

public class AddNewAG {

	
	public void AddNewAGM(WebDriver driver) {
		
		ProjectWorkflowMainPage PWF = new ProjectWorkflowMainPage(driver);
		
		//Click on Project WorkFlow tap
		PWF.clickProjectWorkFlow();
		//Click on Add Button
		PWF.clicWFAddButton();
		
		//Write Basics Information:
	    //Enter name
		PWF.enterWFName(ReadData.PWFName);
		//Start day
		PWF.enterWFStartDay(1);
		//Start Time:
		PWF.enterWFStartTime(ReadData.PWFStartTime);
		//End day
		PWF.enterWFEndDay(1);
		//End Time:
		PWF.enterWFEndTime(ReadData.PWFEndTime);
		
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
		PWF.ClickSave();
	}

}

