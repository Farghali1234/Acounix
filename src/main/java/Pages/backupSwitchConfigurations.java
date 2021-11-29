package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class backupSwitchConfigurations extends BaseClass {

	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public backupSwitchConfigurations(WebDriver driver) {
		this.driver = driver;
	}
	
	//Click on Assets Tap
	private By Assets = By.xpath("//ul[@id='headingTwo']");
	public void clickAssets() {     
//		WebElement element = driver.findElement(Assets);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().build().perform();
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", element);
		WaitForClick(driver,Assets);
		driver.findElement(Assets).click();
	}
	
	//Click on Backup Server Button & Locator
	private By backupServerB = By.xpath("/html/body/app-root/app-parent/div[1]/app-sidebar/div/div/ul/ul[4]/li[2]/span[2]");
	public void BackupServerB() {
//		WebElement element = driver.findElement(backupServerB);
		driver.findElement(backupServerB).click();
	}
	
	//Click on Server Configurations Button & Locator
	private By ServerConfigurations = By.xpath("//button[@class='btn active-tab']");
	public void clickServerConfigurations() {
		driver.findElement(ServerConfigurations).click();
	}
		
	//Click on Server Configurations Button & Locator
	private By ServerVersions = By.xpath("//button[@class='btn']");
	public void clickServerVersions() {
		driver.findElement(ServerVersions).click();
	}
	
	//Click on ADD Button in Switch Configurations & Locator
	private By ADDButtonServerC = By.xpath("/html/body/app-root/app-parent/div[2]/div[1]/app-backup-server/app-server-configurations/div[1]/div[2]/div[2]/div[1]/div/button[1]");
	public void clickADDButtonServerC() {
		driver.findElement(ADDButtonServerC).click();	
	}
	
	//Locator for Master Server Name
	private By MasterServerName = By.xpath("//input[@id='name']");
	public void enterName(String MSname) {
		driver.findElement(MasterServerName).clear();
		driver.findElement(MasterServerName).sendKeys(MSname);
	}
	//Locator for UserName field
	private By UName = By.xpath("//input[@id='apiUsername']");
	public void enterUName(String Uname) {
		driver.findElement(UName).clear();
		driver.findElement(UName).sendKeys(Uname);
	}
	//Locator for Domain Name field
	private By DomainName = By.xpath("//input[@id='apiDomainName']");
	public void enterDomainName(String Dname) {
		driver.findElement(DomainName).clear();
		driver.findElement(DomainName).sendKeys(Dname);
	}
	//Locator for Domain Type field
	private By DomainType = By.xpath("//input[@id='apiDomainType']");
	public void enterDomainType(String DType) {
		driver.findElement(DomainType).clear();
		driver.findElement(DomainType).sendKeys(DType);
	}
	//Locator for Password field
	private By Password = By.xpath("//input[@id='apiPassword']");
	public void enterPass(String pass) {
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(pass);
	}
	//Locator for SSH User Name field
	private By sshUserName= By.xpath("//input[@id='userNameInput']");
	public void enterSSHUName(String sshUName) {
		driver.findElement(sshUserName).clear();
		driver.findElement(sshUserName).sendKeys(sshUName);
	}
	//Locator for SSH Password field
	private By sshPassword = By.xpath("//input[@id='passwordInput']");
	public void enterSSHPass(String sshpass) {
		driver.findElement(sshPassword).clear();
		driver.findElement(sshPassword).sendKeys(sshpass);
	}
	//Locator for URl field
	private By Url = By.xpath("//input[@id='apiUrl']");
	public void enterurl(String url) {
		driver.findElement(Url).clear();
		driver.findElement(Url).sendKeys(url);
	}
	//Locator for Save Button field
	private By SaveButton = By.xpath("/html/body/app-root/app-parent/div[2]/div[1]/app-backup-server/app-server-configurations/div[2]/div/div/div[2]/div/div/form/div[9]/button[2]");
	public void ClickSave() {
		driver.findElement(SaveButton).click();
		WaitForNotification(driver);
	}
	
	//Select Server Vendor
	private By ServerVendor = By.xpath("//select[@id='serverVendor']");
	public void SelectServerVendor(int x) {
		Select select = new Select(driver.findElement(ServerVendor));
		select.selectByIndex(x);
	}
	//Select Site Name
	private By SiteName = By.xpath("//select[@id='siteName']");
	public void SelectSiteName(int x) {
		Select select = new Select(driver.findElement(SiteName));
		select.selectByIndex(x);
	}
	//Select Type of server
	private By ServerType = By.xpath("//select[@id='serverType']");
	public void SelectServerType(int x) {
		Select select = new Select(driver.findElement(ServerType));
		select.selectByIndex(x);	
	}
	//Select Type of server
	private By ServerVersion = By.xpath("//select[@id='serverVersion']");
	public void SelectServerVersion(int x) {
		Select select = new Select(driver.findElement(ServerVersion));
		select.selectByIndex(x);
	}
	
}
