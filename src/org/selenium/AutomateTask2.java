package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomateTask2 extends BaseClass{
	public static WebElement element;

	public static void main(String[] args) {
		driver=browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/");
		inputTo(driver.findElement(By.id("username")), "Balaganesan");
	inputTo(driver.findElement(By.id("password")), "L4Y507");
	clickTo(driver.findElement(By.id("login")));

	
	
	options(driver.findElement(By.id("location")));
	dropdown(driver.findElement(By.id("location")), "London", "value");
	dropdown(driver.findElement(By.id("hotels")), "Hotel Sunshine", "value");
	dropdown(driver.findElement(By.id("room_type")), "Standard", "value");
	inputTo(driver.findElement(By.id("datepick_in")), "25/03/2021");
	inputTo(driver.findElement(By.id("datepick_out")), "27/03/2021");
	dropdown(driver.findElement(By.id("adult_room")), "1", "value");
	dropdown(driver.findElement(By.id("child_room")), "0", "value");
	clickTo(driver.findElement(By.id("Submit")));
	
	clickTo(driver.findElement(By.id("radiobutton_0")));
	clickTo(driver.findElement(By.id("continue")));
	
	inputTo(driver.findElement(By.id("first_name")), "Bala");
	inputTo(driver.findElement(By.id("last_name")), "ganesan");
	inputTo(driver.findElement(By.id("address")), "221B,bakers street, london");
	inputTo(driver.findElement(By.id("cc_num")), "55558888899992222");
	dropdown(driver.findElement(By.id("cc_type")), "AMEX", "value");
	dropdown(driver.findElement(By.id("cc_exp_month")), "1", "value");
	dropdown(driver.findElement(By.id("cc_exp_year")), "2022", "value");
	inputTo(driver.findElement(By.id("cc_cvv")), "321");
	clickTo(driver.findElement(By.id("book_now")));
	
	
	clickTo(driver.findElement(By.id("logout")));
	

	closeApp();
	
}
	

	
		
	}



