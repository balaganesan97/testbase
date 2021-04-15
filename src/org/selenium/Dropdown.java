	package org.selenium;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Dropdown extends BaseClass {
		public static void main(String[] args) {
			driver=browserLaunch("chrome");
			getUrl("https://adactinhotelapp.com/");
			inputTo(driver.findElement(By.id("username")), "Balaganesan");
		inputTo(driver.findElement(By.id("password")), "L4Y507");
		clickTo(driver.findElement(By.id("login")));
		allSelected(driver.findElement(By.id("location")));

	}

}
