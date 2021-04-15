	package org.selenium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Locators2 {
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91824\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.irctc.co.in");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			WebElement ok_btn= driver.findElement(By.xpath("//div[contains(@class,'text-center')]"));
			ok_btn.click();
			
			WebElement user= driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-8 ui-inputtext ui-widget ui-state')]"));
			user.sendKeys("Chennai");
			
			WebElement pass= driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-9 ui-inputtext ui-widget ui-state-default')]"));
			pass.sendKeys("Banglore");
			
			Thread.sleep(5000);
			driver.quit();
			
			
			
		}
		
		}



