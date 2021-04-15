package org.selenium;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 extends BaseClass{
	public static void main(String[] args){
		driver=browserLaunch("chrome");
		getUrl("http://demo.automationtesting.in/Alerts.html");
		alert1(driver.findElement(By.xpath("//button[text()='OK']")));
		
		
	}

}



