package pages;

import org.testng.Assert;

import baseClass.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
public void verifyViewLead() {
	String title = driver.getTitle();
	Assert.assertEquals(title, "View Lead | opentaps CRM");

}
}
