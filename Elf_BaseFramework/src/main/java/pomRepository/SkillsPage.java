package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage {

	public SkillsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'Skills')]")
	private WebElement skillsButton;

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

	public WebElement getJava() {
		return java18;
	}

	public WebElement getSql() {
		return sql;
	}

	@FindBy(xpath = "//input[@placeholder='SDLC']")
	private WebElement sdlc;

	@FindBy(xpath = "//li[.='Waterfall model and agile Git']")
	private WebElement waterFall;

	@FindBy(xpath = "//input[@placeholder='Development Tools']")
	public WebElement developmentsTools;

	@FindBy(xpath = "//li[.='Maven']")
	private WebElement maven;

	public WebElement getSkillsButton() {
		return skillsButton;
	}

	public WebElement getFrontendTechnologies() {
		return frontendTechnologies;
	}

	public WebElement getBackendTechnologies() {
		return backendTechnologies;
	}

	public WebElement getSdlc() {
		return sdlc;
	}

	public WebElement getDevelopmentsTools() {
		return developmentsTools;
	}

	public WebElement getHtml() {
		return html;
	}

	public WebElement getJavaScript() {
		return javaScript;
	}

	public WebElement getJava18() {
		return java18;
	}

	public WebElement getWaterFall() {
		return waterFall;
	}

	public WebElement getMaven() {
		return maven;
	}

	// **************************AssertElements*****************************************************
	@FindBy(xpath = "//text[text()='HTML,JavaScript']")
	private WebElement FETValueCheck;

	public WebElement getFETValueCheck() {
		return FETValueCheck;
	}

	@FindBy(xpath = "//text[text()='Java 1.8,Sql']")
	private WebElement BETValueCheck;

	public WebElement getBETValueCheck() {
		return BETValueCheck;
	}

	// ************************************************************************
	public void createSkillsPage() {

		skillsButton.click();

		frontendTechnologies.click();
		html.click();
		javaScript.click();

		backendTechnologies.click();
		java18.click();
		sql.click();

		sdlc.click();
		waterFall.click();

		developmentsTools.click();
		maven.click();

	}
}
