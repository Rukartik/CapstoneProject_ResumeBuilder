package skills;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;

public class SampleTestCase extends Base_Class{
	
	@Test
	public void sample() {
		homePage.getSkillsModuleLink().click();	
	}

}
