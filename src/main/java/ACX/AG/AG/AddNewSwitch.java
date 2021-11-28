package ACX.AG.AG;

import org.openqa.selenium.WebDriver;

import Pages.ProjectWorkflowMainPage;
import Pages.networkSwitchConfigurations;

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
	NSC.enterName("nona Switch");
	//Write User Name
	NSC.enterUName("Switch nono nona");
	//Write Pass
	NSC.enterPass("password");
	//Write URl
	NSC.enterurl("http://192.168.1.173");
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
