	package org.selenium;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LPage {
		
	public static WebDriver driver;

		@FindBy(id="username")
		private WebElement user;

		@FindBy(id="password")
		private WebElement pass;
		
		@FindBy(id="login")
		private WebElement log;
		
		
		public LPage(WebDriver ldriver) {
			this.driver=ldriver;
			PageFactory.initElements(driver, this);
			}

		public WebElement getUser() {
			return user;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getLog() {
			return log;
		}

}
