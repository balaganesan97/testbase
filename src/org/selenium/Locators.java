	package org.selenium;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Wait;

	public class Locators {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91824\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.indiabix.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.navigate().to("https://www.cricbuzz.com/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.quit();
			
		}
		//public static void fluentwait(WebElement element) {
			//Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).pollingEvery(15, TimeUnit.SECONDS).ignoring(Exception.class);
			//}
	}


