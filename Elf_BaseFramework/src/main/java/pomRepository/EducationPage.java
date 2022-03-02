package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationPage {

	public EducationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'Education')]")
	private WebElement educationButton;

	@FindBy(xpath = "//option[.='BE/B.Tech']")
	private WebElement bTech;

	public WebElement getEducationButton() {
		return educationButton;
	}

	public WebElement getbTech() {
		return bTech;
	}

	@FindBy(xpath = "//select[@id='Highest Education']/..//option[.='BE/B.Tech']")
	private WebElement highestEducation;

	public WebElement getAbc() {
		return highestEducation;
	}

	@FindBy(xpath = "//label[.='Percentage (%)']/../..//input")
	private WebElement percentage;

	public WebElement getHighestEducation() {
		return highestEducation;
	}

	public WebElement getPercentage() {
		return percentage;
	}

	@FindBy(xpath = "//label[.='Pass out Year']/../..//input")
	private WebElement passYear;

	public WebElement getPassYear() {
		return passYear;
	}

	// *******************************AssertElement**************************************

	@FindBy(xpath = "//td[text()='BE/B.Tech']")
	private WebElement highestEduValueCheck;

	public WebElement getHighestEduValueCheck() {
		return highestEduValueCheck;
	}

	// ***********************************************************************************
	public void createEducation(double percentageValue, double passOutYearValue) {

		educationButton.click();

		highestEducation.click();

		percentage.click();
		percentage.clear();
		percentage.sendKeys("" + percentageValue);

		passYear.click();
		passYear.clear();
		passYear.sendKeys("" + passOutYearValue);

	}
}
