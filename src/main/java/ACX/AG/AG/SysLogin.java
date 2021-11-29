package ACX.AG.AG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.LoginPage;

public class SysLogin {
	
	public void login(WebDriver driver) {
		
			LoginPage login = new LoginPage(driver);
			//Enter UserName
			login.enterUsername("Farghali");
			//Enter Password
			login.enterPassword("P@ssw0rd@123");
			//CLick on Login Button
			login.clickLogin();
			
	}

}
