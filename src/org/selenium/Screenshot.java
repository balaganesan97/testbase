	package org.selenium;

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Screenshot extends BaseClass {
		public static WebDriver driver; 
		public static void main(String[] args) throws IOException, InterruptedException {
			 driver=browserLaunch("chrome");
			 getUrl("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
			 GetScreenshot();
		}

	}


