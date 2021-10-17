package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}
}
