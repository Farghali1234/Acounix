package ACX.AG.AG;

import org.openqa.selenium.WebDriver;

import Pages.ProjectWorkflowMainPage;
import Pages.networkSwitchConfigurations;
import utilities.ReadData;

public class AddNewSwitch {
	
	public void AddSwitchConfigurations(WebDriver driver) {
	
	networkSwitchConfigurations NSC = new networkSwitchConfigurations(driver);

	//Click on Assets tap
	NSC.clickAssets();
	//Click on Network switch Button
	NSC.NetworkSwitchsB();
	//Click on Switch Configurations Button
	NSC.clickSwitchConfigurations();
	//Click on Add Button
	NSC.clickADDButtonSC();
	//Write name
	NSC.enterName(ReadData.SwitchName);
	//Write User Name
	NSC.enterUName(ReadData.SwitchUserName);
	//Write Pass
	NSC.enterPass(ReadData.SwitchPass);
	//Write URl
	NSC.enterurl(ReadData.SwitchUrl);
	//Select Type of server
	NSC.SelectType(1);
	//Select Type of Server Version
	NSC.SelectServerVersion(1);
	
	NSC.ClickSave();

	}
	
	public void AddSwitchModelsVersions(WebDriver driver) {
		
	networkSwitchConfigurations NSC = new networkSwitchConfigurations(driver);

	//Click on Switch ModelsVersions Button
	NSC.clickSwitchModelsVersions();

	}
	
}
