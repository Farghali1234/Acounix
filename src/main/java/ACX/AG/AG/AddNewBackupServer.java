package ACX.AG.AG;

import org.openqa.selenium.WebDriver;

import Pages.backupSwitchConfigurations;
import Pages.networkSwitchConfigurations;

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
		BSC.enterName("nona BK Server");
		//Write User Name
		BSC.enterUName("nono nona Server");
		//Write User Name
		BSC.enterDomainName("dddddddddddddddddd");
		//Write User Name
		BSC.enterDomainType("dttdtdtdtdttdt");
		//Write User Name
		BSC.enterSSHUName("SSH name1");
		//Write User Name
		BSC.enterSSHPass("SSH Password1");
		
		//Write Pass
		BSC.enterPass("password");
		//Write URl
		BSC.enterurl("http://192.168.1.173");
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
