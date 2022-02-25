package genericLibrary;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/***
 * 
 * @author Yogita
 *
 */
public class UtilityMethods {
	
	/**
	 * This method is used to switch the driver control to a particular titled window
	 * @param title of the expected page
	 */
	public void switchToASpecificTitledWindow(WebDriver driver,String title) { 
		String parentWindowId = driver.getWindowHandle(); 
		Set<String> allWindowIds = driver.getWindowHandles(); 
		allWindowIds.remove(parentWindowId); 
		for(String windowId:allWindowIds){ 
			driver.switchTo().window(windowId);
			if(driver.getTitle().equalsIgnoreCase(title)){ 
				break; 
			} 
		} 
	} 
	
	/**
	 * This method is used to switch the driver control to a particular window where the given element is present
	 * @param element that is present on the required page
	 */
	public void switchToASpecificWindow(WebDriver driver,WebElement element) {
		String parent=driver.getWindowHandle(); 
		Set<String> allWid=driver.getWindowHandles(); 
		allWid.remove(parent); 
		for(String sessionID:allWid){ 
			driver.switchTo().window(sessionID);
			if(element.isDisplayed()){ 
				break; 
			} 
		} 
	}
}
