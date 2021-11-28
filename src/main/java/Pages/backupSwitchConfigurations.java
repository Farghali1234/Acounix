package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class backupSwitchConfigurations {

WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public backupSwitchConfigurations(WebDriver driver) {
          this.driver = driver;
	}
	
	//Click on Assets Tap
	By Assets = By.xpath("//ul[@id='headingTwo']");
	public void clickAssets() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='modal-backdrop fade']")));
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(Assets));
		driver.findElement(Assets).click();
	}
	
	//Click on Backup Server Button & Locator
	By backupServerB = By.xpath("/html/body/app-root/app-parent/div[1]/app-sidebar/div/div/ul/ul[4]/li[2]/span[2]");
	public void BackupServerB() {
		driver.findElement(backupServerB).click();
	}
	
	//Click on Server Configurations Button & Locator
	By ServerConfigurations = By.xpath("//button[@class='btn active-tab']");
	public void clickServerConfigurations() {
		driver.findElement(ServerConfigurations).click();
	}
		
	//Click on Server Configurations Button & Locator
	By ServerVersions = By.xpath("//button[@class='btn']");
	public void clickServerVersions() {
		driver.findElement(ServerVersions).click();
	}
	
	//Click on ADD Button in Switch Configurations & Locator
	By ADDButtonServerC = By.xpath("/html/body/app-root/app-parent/div[2]/div[1]/app-backup-server/app-server-configurations/div[1]/div[2]/div[2]/div[1]/div/button[1]");
	public void clickADDButtonServerC() {
		driver.findElement(ADDButtonServerC).click();	
	}
	
	//Locator for Master Server Name
	By MasterServerName = By.xpath("//input[@id='name']");
	public void enterName(String MSname) {
		driver.findElement(MasterServerName).clear();
		driver.findElement(MasterServerName).sendKeys(MSname);
	}
	//Locator for UserName field
	By UName = By.xpath("//input[@id='apiUsername']");
	public void enterUName(String Uname) {
		driver.findElement(UName).clear();
		driver.findElement(UName).sendKeys(Uname);
	}
	//Locator for Domain Name field
	By DomainName = By.xpath("//input[@id='apiDomainName']");
	public void enterDomainName(String Dname) {
		driver.findElement(DomainName).clear();
		driver.findElement(DomainName).sendKeys(Dname);
	}
	//Locator for Domain Type field
	By DomainType = By.xpath("//input[@id='apiDomainType']");
	public void enterDomainType(String DType) {
		driver.findElement(DomainType).clear();
		driver.findElement(DomainType).sendKeys(DType);
	}
	//Locator for Password field
	By Password = By.xpath("//input[@id='apiPassword']");
	public void enterPass(String pass) {
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(pass);
	}
	//Locator for SSH User Name field
	By sshUserName= By.xpath("//input[@id='userNameInput']");
	public void enterSSHUName(String sshUName) {
		driver.findElement(sshUserName).clear();
		driver.findElement(sshUserName).sendKeys(sshUName);
	}
	//Locator for SSH Password field
	By sshPassword = By.xpath("//input[@id='passwordInput']");
	public void enterSSHPass(String sshpass) {
		driver.findElement(sshPassword).clear();
		driver.findElement(sshPassword).sendKeys(sshpass);
	}
	//Locator for URl field
	By Url = By.xpath("//input[@id='apiUrl']");
	public void enterurl(String url) {
		driver.findElement(Url).clear();
		driver.findElement(Url).sendKeys(url);
	}
	//Locator for Save Button field
	By SaveButton = By.xpath("/html/body/app-root/app-parent/div[2]/div[1]/app-backup-server/app-server-configurations/div[2]/div/div/div[2]/div/div/form/div[9]/button[2]");
	public void ClickSave() {
		driver.findElement(SaveButton).click();
	}
	
	//Select Server Vendor
	By ServerVendor = By.xpath("//select[@id='serverVendor']");
	public void SelectServerVendor(int x) {
		Select select = new Select(driver.findElement(ServerVendor));
		select.selectByIndex(x);
	}
	//Select Site Name
	By SiteName = By.xpath("//select[@id='siteName']");
	public void SelectSiteName(int x) {
		Select select = new Select(driver.findElement(SiteName));
		select.selectByIndex(x);
	}
	//Select Type of server
	By ServerType = By.xpath("//select[@id='serverType']");
	public void SelectServerType(int x) {
		Select select = new Select(driver.findElement(ServerType));
		select.selectByIndex(x);	
	}
	//Select Type of server
	By ServerVersion = By.xpath("//select[@id='serverVersion']");
	public void SelectServerVersion(int x) {
		Select select = new Select(driver.findElement(ServerVersion));
		select.selectByIndex(x);
		
	}
	
	
}
