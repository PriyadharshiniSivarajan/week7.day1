package testCases;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import pages.LoginPage;
@Test
public class CreateLead extends ProjectSpecificMethods {
	public void createLead() {
		LoginPage lp = new LoginPage();
		lp.enterUserName().
		enterPassword().
		clickLoginButton().
		clickCrmsfaLink().
		clickLeads().
		clickCreateLead().
		getCompnayName().
		getFirstName().
		getLastName().
		getPhoneNumber().
		clickSubmitButton().
		verifyViewLead();
		

	}
}
