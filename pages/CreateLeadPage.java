package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage getCompnayName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}

	public CreateLeadPage getFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;
	}

	public CreateLeadPage getLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;

	}

	public CreateLeadPage getPhoneNumber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		return this;
	}

	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
}
