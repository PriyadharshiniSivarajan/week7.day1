package testCases;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import editLeadPages.LoginPage;

@Test
public class EditLead extends ProjectSpecificMethods{
	public void editLeadPoject() throws InterruptedException {
		LoginPage lp = new LoginPage();
		lp.enterUserName().
		enterPassword().
		clickLoginButton().
		clickCrmsfaLink().clickLeads().clickFindLeads().clickPhone().getPhoneNumber().clickFindLeadsButton().clickFirstLeadId().clickEditButton().editCompanyName().clickUpdateButton();


	}
	
}
