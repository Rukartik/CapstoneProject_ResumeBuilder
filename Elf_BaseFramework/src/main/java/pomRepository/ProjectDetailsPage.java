package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author kartik
 *
 */

public class ProjectDetailsPage {

	public ProjectDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'ProjectDetails')]")
	private WebElement projectDetailsButton;

	public WebElement getProjectDetailsButton() {
		return projectDetailsButton;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	@FindBy(xpath = "//input[@type='text' and @maxlength='50']")
	private WebElement projectName;

	@FindBy(xpath = "//input[@placeholder='Frontend Technologies']")
	private WebElement frontendTechnologies;

	@FindBy(xpath = "//li[.='HTML']")
	private WebElement html;

	@FindBy(xpath = "//li[.='JavaScript']")
	private WebElement javaScript;

	@FindBy(xpath = "//input[@placeholder='Backend Technologies']")
	private WebElement backendTechnologies;

	@FindBy(xpath = "//li[.='Java 1.8']")
	private WebElement java18;

	@FindBy(xpath = "//li[.='Sql']")
	private WebElement sql;

	@FindBy(xpath = "//input[@placeholder='Development Tools']")
	private WebElement developmentsTools;

	public WebElement getFrontendTechnologies() {
		return frontendTechnologies;
	}

	public WebElement getHtml() {
		return html;
	}

	public WebElement getJavaScript() {
		return javaScript;
	}

	public WebElement getBackendTechnologies() {
		return backendTechnologies;
	}

	public WebElement getJava18() {
		return java18;
	}

	public WebElement getSql() {
		return sql;
	}

	public WebElement getDevelopmentsTools() {
		return developmentsTools;
	}

	// **************************AssertElements********************************
	@FindBy(xpath = "//text[text()='CapstoneProject_ResumeBuilder']")
	private WebElement projectNamevalueCheck;

	public WebElement getProjectNamevalueCheck() {
		return projectNamevalueCheck;
	}

	// **********************************************************************

	public void createProjectDetails(String projectNameValue) {

		projectDetailsButton.click();

		projectName.click();
		projectName.sendKeys(projectNameValue);

		frontendTechnologies.click();
		html.click();
		javaScript.click();

		backendTechnologies.click();
		java18.click();
		sql.click();

	}

}
