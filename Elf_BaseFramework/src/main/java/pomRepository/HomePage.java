package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author kartik
 *
 */

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[text()='Include Profile pic']/..//input[@type=\"checkbox\"]")
	private WebElement includeProfilePic;

	public WebElement getIncludeProfilePic() {
		return includeProfilePic;
	}

	@FindBy(xpath = "//button[text()='Download as']")
	private WebElement downladAs;

	@FindBy(xpath = "//button[text()='PDF']")
	private WebElement pdfButton;

	public WebElement getDownladAs() {
		return downladAs;
	}

	public WebElement getPdfButton() {
		return pdfButton;
	}

	public void createPdf(WebDriver driver) {

		includeProfilePic.click();

		Actions actions = new Actions(driver);
		actions.moveToElement(downladAs).perform();
		pdfButton.click();
	}
	
	
	@FindBy(xpath = "//button[text()='WORD']")
	private WebElement wordButton;
	
	public void createWord(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(downladAs).perform();
		wordButton.click();
	}

}
