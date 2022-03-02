package summary;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericLibrary.Base_Class;
import pomRepository.EducationPage;
import pomRepository.HomePage;
import pomRepository.ProfilePage;
import pomRepository.ProjectDetailsPage;
import pomRepository.SkillsPage;
import pomRepository.SummaryPage;

public class RB_Summary_TC16Test extends Base_Class {

	@Test 
	public void resumeWord() {

		String FName = elib.readStringDataFromExcel("Sheet1", 0, 0);
		String LName = elib.readStringDataFromExcel("Sheet1", 0, 1);
		String SummaryData = elib.readStringDataFromExcel("Sheet1", 0, 2);
		double percentageValue = elib.readNumberDataFromExcel("Sheet1", 0, 3);
		double passOutYearValue = elib.readNumberDataFromExcel("Sheet1", 0, 4);
		String projectNameValue = elib.readStringDataFromExcel("Sheet1", 0, 5);

		ProfilePage profilePage = new ProfilePage(driver);
		profilePage.CreateProfilePage(FName, LName);
		String ActualFname = profilePage.getFnameCheck().getText();
		String ExpectedFname = elib.readStringDataFromExcel("Sheet1", 0, 6);
		Assert.assertEquals(ActualFname, ExpectedFname, "Profile details has not been added into profile category");
		Reporter.log("Profile details has been added into profile category", true);

		SummaryPage summaryPage = new SummaryPage(driver);
		summaryPage.CreateSummaryPage(SummaryData);
		String ActualSummaryValue = summaryPage.getSummaryValueCheck().getText();
		Assert.assertEquals(ActualSummaryValue, SummaryData, "Summary has not been added into summary category");
		Reporter.log("Summary has been added into summary category", true);

		SkillsPage skillsPage = new SkillsPage(driver);
		skillsPage.createSkillsPage();

		String ActualFETValue = skillsPage.getFETValueCheck().getText();
		String ExpectedFETValue = elib.readStringDataFromExcel("Sheet1", 0, 7);
		Assert.assertEquals(ActualFETValue, ExpectedFETValue,
				"Frontend Technologies has not been added into skills category");
		Reporter.log("Frontend Technologies has been added into skills category", true);

		String ActualBETValue = skillsPage.getBETValueCheck().getText();
		String ExpectedBETValue = elib.readStringDataFromExcel("Sheet1", 0, 8);
		Assert.assertEquals(ActualBETValue, ExpectedBETValue,
				"Backend Technologies has not been added into skills category");
		Reporter.log("Backend Technologies has been added into skills category", true);

		EducationPage educationPage = new EducationPage(driver);
		educationPage.createEducation(percentageValue, passOutYearValue);

		String ActualHighestEduValue = educationPage.getHighestEduValueCheck().getText();
		String ExpectedHighestEduValue = elib.readStringDataFromExcel("Sheet1", 0, 9);
		Assert.assertEquals(ActualHighestEduValue, ExpectedHighestEduValue,
				"Highest Education has not been added into the education category");
		Reporter.log("Highest Education has been added into education category", true);

		ProjectDetailsPage projectDetailsPage = new ProjectDetailsPage(driver);
		projectDetailsPage.createProjectDetails(projectNameValue);

		String ActualProjectDetailsValue = projectDetailsPage.getProjectNamevalueCheck().getText();
		Assert.assertEquals(ActualProjectDetailsValue, projectNameValue,
				"Project name has not been added into the project category");
		Reporter.log("Project name has been added into the project category", true);

		HomePage homePage = new HomePage(driver);
		homePage.createWord(driver);
		Reporter.log("Resume has been downloaded successfully in WORD format", true);

	}

}
