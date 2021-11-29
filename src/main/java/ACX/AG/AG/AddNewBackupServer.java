package ACX.AG.AG;

import org.openqa.selenium.WebDriver;

import Pages.backupSwitchConfigurations;
import Pages.networkSwitchConfigurations;
import utilities.ReadData;

public class AddNewBackupServer {

	public void AddBackupServerConfigurations(WebDriver driver) {
		
		backupSwitchConfigurations BSC = new backupSwitchConfigurations(driver);

		//Click on Assets tap
		BSC.clickAssets();
		//Click on Network switch Button
		BSC.BackupServerB();
		//Click on Switch Configurations Button
		BSC.clickServerConfigurations();
		//Click on Add Button
		BSC.clickADDButtonServerC();
		//Write name
		BSC.enterName(ReadData.BKSName);
		//Write User Name
		BSC.enterUName(ReadData.BKSUserName);
		//Write User Name
		BSC.enterDomainName(ReadData.BKDomainName);
		//Write User Name
		BSC.enterDomainType(ReadData.BKDomainType);
		//Write User Name
		BSC.enterSSHUName(ReadData.BKSSHUName);
		//Write User Name
		BSC.enterSSHPass(ReadData.BKSSHPass);
		
		//Write Pass
		BSC.enterPass(ReadData.BKSPass);
		//Write URl
		BSC.enterurl(ReadData.BKSUrl);
		//Select Type of server
		BSC.SelectServerVendor(1);
		//Select Select SiteName
		BSC.SelectServerType(1);
		//Select Type of Server Version
		BSC.SelectServerVersion(1);
		//Select Select SiteName
		BSC.SelectSiteName(1);
		
		BSC.ClickSave();

		}
	
}
