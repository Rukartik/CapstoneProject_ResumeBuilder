package skills;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;

public class SampleTestCaseTest extends Base_Class{
	
	@Test
	public void sample() {
		homePage.getSkillsModuleLink().click();	
	}

}
