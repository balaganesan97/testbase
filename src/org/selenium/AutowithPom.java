package org.selenium;
import org.openqa.selenium.WebDriver;

public class AutowithPom extends BaseClass{

	public static WebDriver driver;
	public static void main(String[] args) {
		driver=browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/");
		
	LPage lp=new LPage(driver);
		inputTo(lp.getUser(), "Balaganesan");
		inputTo(lp.getPass(), "L4Y507");
		clickTo(lp.getLog());
		
		SearchPage sp=new SearchPage(driver);
		dropdown(sp.getCity(), "London", "value");
		dropdown(sp.getHotels(), "Hotel Sunshine", "value");
		dropdown(sp.getRoom(), "Standard", "value");
		inputTo(sp.getDatein(), "25/03/2021");
		inputTo(sp.getDateout(), "27/03/2021");
		dropdown(sp.getAdult(), "1", "value");
		dropdown(sp.getChild(), "0", "value");
		clickTo(sp.getOk());
		
		
		BookingPage bp= new BookingPage(driver);
		clickTo(bp.getRad_btn());
		clickTo(bp.getCon_btn());
		
		
		ConfirmPage cp=new ConfirmPage(driver);
		inputTo(cp.getFname(), "Bala");
		inputTo(cp.getLname(), "ganesan");
		inputTo(cp.getAddr(), "221,Bakers street, London");
		inputTo(cp.getCcnum(), "1234567890123456");
		dropdown(cp.getCctype(),"AMEX", "value");
		dropdown(cp.getCcmonth(), "1", "value");
		dropdown(cp.getCcyear(), "2022", "value");
		inputTo(cp.getCccvv(), "322");
		clickTo(cp.getBook());
		
		LogoutPage lop=new LogoutPage(driver);
		clickTo(lop.getLogout());
		
		closeApp();
		
		
		
	
		
		
		
		
		

	}
	

}



