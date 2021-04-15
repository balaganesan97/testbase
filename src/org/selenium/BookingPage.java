 
	package org.selenium;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class BookingPage {

		public static WebDriver driver;
		@FindBy(id="radiobutton_0")
		private WebElement rad_btn;
		
		
		@FindBy(id="continue")
		private WebElement  con_btn;
		
		
		public BookingPage(WebDriver bdriver) {
		this.driver=bdriver;
		PageFactory.initElements(driver, this);
		}

		public WebElement getRad_btn() {
			return rad_btn;
		}

		public WebElement getCon_btn() {
			return con_btn;
		}
		
		

		
		
		

	}


