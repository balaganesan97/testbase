	package org.selenium;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Frames extends BaseClass{
	private static WebDriver driver; 
	public static void main(String[] args) {
	driver=browserLaunch("Chrome");
	getUrl("http://demo.automationtesting.in/Frames.html");
	singleFrame(driver.findElement(By.xpath("//iframe[@id='singleframe']")), "I'm Batman");
	closeApp();
	}	
	}


