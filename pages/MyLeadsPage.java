package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
}
