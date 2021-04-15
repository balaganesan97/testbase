package org.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowseLaunch {

		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\91824\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.indiabix.com/");
		}

	}


