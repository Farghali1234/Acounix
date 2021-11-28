package ACX.AG.AG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AgOpenConnection {
	
	 private static List<WebElement> elements = null;
	
	public void AgOpenConnectionSteps(WebDriver driver) {
		
		WebElement WFAirgapOpenButton=returnOneElement(driver ,"//button[@class='btn add-workflow']" ,"Airgap Open Connection");
		WFAirgapOpenButton.click();
		
		//Node Type
		WebElement Node= driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create-workflow/div[1]/div[2]/div/div/form/div/div[3]/fieldset[2]/div/div/p-table/div/div/table/tbody/tr/td[3]/select"));
		Select select = new Select(Node);
		select.selectByIndex(1);
		
		//Node Name 
		WebElement Node1= driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create-workflow/div[1]/div[2]/div/div/form/div/div[3]/fieldset[2]/div/div/p-table/div/div/table/tbody/tr/td[4]/select"));
		Select select1 = new Select(Node1);
		select1.selectByIndex(1);
		
		//Task 
		WebElement Node2= driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create-workflow/div[1]/div[2]/div/div/form/div/div[3]/fieldset[2]/div/div/p-table/div/div/table/tbody/tr/td[5]/select"));
		Select select2 = new Select(Node2);
		select2.selectByIndex(1);
		
		//Response Parameter 
		WebElement Node3= driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create-workflow/div[1]/div[2]/div/div/form/div/div[3]/fieldset[2]/div/div/p-table/div/div/table/tbody/tr/td[6]/select"));
		Select select3 = new Select(Node3);
		select3.selectByIndex(1);
		
		//Response Value 
		WebElement Node4= driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create-workflow/div[1]/div[2]/div/div/form/div/div[3]/fieldset[2]/div/div/p-table/div/div/table/tbody/tr/td[7]/select"));
		Select select4 = new Select(Node4);
		select4.selectByIndex(0);

				
	}
	
	
	public static WebElement returnOneElement (WebDriver driver,String path,String text){
	    elements = driver.findElements(By.xpath(path));
	    for (WebElement element : elements){
	        String myText = element.getText();
	        if (myText.contains(text)) {
	            return element;
	        }
	    }
	    return null;
	}


}
