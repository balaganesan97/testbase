
	package org.selenium;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ConfirmPage {
		public static WebDriver driver;
		
		

		@FindBy(id="first_name")
		private WebElement  fname;
		
		@FindBy(id="last_name")
		private WebElement  lname;
		
		@FindBy(id="address")
		private WebElement  addr;
		
		@FindBy(id="cc_num")
		private WebElement  ccnum;
		
		@FindBy(id="cc_type")
		private WebElement  cctype;
		
		@FindBy(id="cc_exp_month")
		private WebElement  ccmonth;
		
		@FindBy(id="cc_exp_year")
		private WebElement  ccyear;
		
		@FindBy(id="cc_cvv")
		private WebElement  cccvv;
		
		@FindBy(id="book_now")
		private WebElement  book;
		
		public ConfirmPage(WebDriver cdriver) {
			this.driver= cdriver;
			PageFactory.initElements(driver, this);
		}

		public WebElement getFname() {
			return fname;
		}

		public WebElement getLname() {
			return lname;
		}

		public WebElement getAddr() {
			return addr;
		}

		public WebElement getCcnum() {
			return ccnum;
		}

		public WebElement getCctype() {
			return cctype;
		}

		public WebElement getCcmonth() {
			return ccmonth;
		}

		public WebElement getCcyear() {
			return ccyear;
		}

		public WebElement getCccvv() {
			return cccvv;
		}

		public WebElement getBook() {
			return book;
		}
		
		
		
		

	}


	
