package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	public static WebDriver driver;
	@FindBy(id="logout")
	private WebElement logout;

	public LogoutPage(WebDriver lodriver) {
		this.driver=lodriver;
		PageFactory.initElements(driver, this);
				
	}

	public WebElement getLogout() {
		return logout;
	}
	
	

}



