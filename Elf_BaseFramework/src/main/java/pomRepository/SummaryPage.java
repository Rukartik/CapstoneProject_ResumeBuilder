package pomRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import genericLibrary.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryPage extends Base_Class {

	public SummaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'Summary')]")
	private WebElement summaryPage;

	public WebElement getSummaryPage() {
		return summaryPage;
	}

	@FindBy(xpath = "//div[@class=\"input-data\"]/input")
	private WebElement TypeHere;

	public WebElement getSummaryText() {
		return TypeHere;
	}

	// ***************************AssertElement************************************
	@FindBy(xpath = "//li[text()='Over 1 years of experience as a Java Full Stack Developer in IT industry.' and @style='padding: 2px 2px 2px 10px; font-family: \"helvetica normal\";']")
	private WebElement SummaryValueCheck;

	public WebElement getSummaryValueCheck() {
		return SummaryValueCheck;
	}
	// ***************************************************************************

	public WebElement getTypeHere() {
		return TypeHere;
	}

	public void CreateSummaryPage(String SummaryData) {

		summaryPage.click();

		TypeHere.clear();
		TypeHere.sendKeys(SummaryData, Keys.ENTER);

	}

}
