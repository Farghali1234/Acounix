package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class networkSwitchConfigurations {
	
	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public networkSwitchConfigurations(WebDriver driver) {
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
	
	//Click on Network switch Button & Locator
	By NetworkSwitchsB = By.xpath("/html/body/app-root/app-parent/div[1]/app-sidebar/div/div/ul/ul[4]/li[1]/span[2]");
	public void NetworkSwitchsB() {
		driver.findElement(NetworkSwitchsB).click();
	}
	
	//Click on Switch Configurations Button & Locator
	By SwitchConfigurations = By.xpath("//button[@class='btn active-tab']");
	public void clickSwitchConfigurations() {
		driver.findElement(SwitchConfigurations).click();
	}
		
	//Click on Switch ModelsVersions Button & Locator
	By SwitchModelsVersions = By.xpath("//button[@class='btn']");
	public void clickSwitchModelsVersions() {
		driver.findElement(SwitchModelsVersions).click();
	}
	
	//Click on ADD Button in Switch Configurations & Locator
	By ADDButtonSC = By.xpath("/html/body/app-root/app-parent/div[2]/div[1]/app-network-switch/app-switch-configurations/div[1]/div[2]/div[2]/div/div/button[1]");
	public void clickADDButtonSC() {
		driver.findElement(ADDButtonSC).click();
	}
	
	//Locator for NAme field
	By Name = By.xpath("//input[@id='name']");
	public void enterName(String name) {
		driver.findElement(Name).clear();
		driver.findElement(Name).sendKeys(name);
	}
	//Locator for UserName field
	By UName = By.xpath("//input[@id='apiName']");
	public void enterUName(String Uname) {
		driver.findElement(UName).clear();
		driver.findElement(UName).sendKeys(Uname);
	}
	//Locator for Password field
	By Password = By.xpath("//input[@id='apiPassword']");
	public void enterPass(String pass) {
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(pass);
	}
	//Locator for URl field
	By Url = By.xpath("//input[@id='apiUrl']");
	public void enterurl(String url) {
		driver.findElement(Url).clear();
		driver.findElement(Url).sendKeys(url);
	}
	//Locator for Save Button field
	By SaveButton = By.xpath("/html/body/app-root/app-parent/div[2]/div[1]/app-network-switch/app-switch-configurations/div[2]/div/div/div[2]/div/div/form/div[5]/button[2]");
	public void ClickSave() {
		driver.findElement(SaveButton).click();
	}
	
	//Select Type of server
	By ServerType = By.xpath("//select[@id='serverType']");
	public void SelectType(int x) {
		Select select = new Select(driver.findElement(ServerType));
		select.selectByIndex(x);
	}
	
	//Select Version of server
	By ServerVersion = By.xpath("//select[@id='switchVersionUrls']");
	public void SelectServerVersion(int x) {
		Select select = new Select(driver.findElement(ServerVersion));
		select.selectByIndex(x);
		
	}
	
}
