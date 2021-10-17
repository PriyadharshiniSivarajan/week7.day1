package testCases;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import deleteLeadPages.LoginPage;
@Test
public class DeleteLead extends ProjectSpecificMethods {
	public void deleteLead() throws InterruptedException {
		LoginPage lp = new  LoginPage();
		lp.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.getPhoneNumber()
		.clickFindLeadButton()
		.getLeadId()
		.clickGetFirstLead()
		.deleteLead()
		.clickFindLeads()
	    .giveLeadId()
	    .clickFindLeadButton()
	    .checkRecord();

		
		
	}

}
