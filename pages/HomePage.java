package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

	public LoginPage clickLogOut() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
	}

}
