package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[1]")
	private WebElement FirstName;

	@FindBy(xpath = "(//input)[2]")
	private WebElement LastName;

	@FindBy(xpath = "//option[contains(text(),'Java Full Satck')]")
	private WebElement technology;

	@FindBy(xpath = "(//select[@id='Total Experience']/..//option[@value='1'])[1]")
	private WebElement totalExpYear;

	@FindBy(xpath = "(//select[@id='Total Experience'])[2]/..//option[@value='5']")
	private WebElement totalExpMonth;

	@FindBy(xpath = "(//select[@id='Relevant Experience']/..//option[@value='0'])[1]")
	private WebElement relevantExpYear;

	@FindBy(xpath = "(//select[@id='Relevant Experience'])[2]/..//option[@value='6']")
	private WebElement relevantExpMonth;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getTechnology() {
		return technology;
	}

	public WebElement getTotalExpYear() {
		return totalExpYear;
	}

	public WebElement getTotalExpMonth() {
		return totalExpMonth;
	}
	
	public WebElement getRelevantExpYear() {
		return relevantExpYear;
	}

	public WebElement getRelevantExpMonth() {
		return relevantExpMonth;
	}

	public void CreateProfilePage(String FName, String LName) {
		FirstName.clear();
		FirstName.sendKeys(FName);

		LastName.clear();
		LastName.sendKeys(LName);

		technology.click();

		totalExpYear.click();

		totalExpMonth.click();
		
		relevantExpYear.click();
		
		relevantExpMonth.click();

	}
	
	// ****************************************AssertElements********************************************//

		@FindBy(xpath = "//div[text()='Kartik']")
		private WebElement FnameCheck;
		
		public WebElement getFnameCheck() {
			return FnameCheck;
		}

		// ************************************************************************************//


}

