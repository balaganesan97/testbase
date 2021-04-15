package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomateTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91824\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement target_element = driver.findElement(By.xpath("//a[@class='login']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(target_element).click().build().perform();
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("Randommmail@gmail.com");
		WebElement create_btn = driver.findElement(By.id("SubmitCreate"));
		create_btn.click();
		
		Thread.sleep(3000);
		
		WebElement radio_btn = driver.findElement(By.id("id_gender1"));
		radio_btn.click();
		
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("David");
		
		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("Beckham");
		
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("soccer");
		
		Thread.sleep(3000);
		
		WebElement bday = driver.findElement(By.id("days"));
		Select s=new Select(bday);
		s.selectByValue("10");
		
		Thread.sleep(3000);
		
		WebElement bmonth = driver.findElement(By.id("months"));
		Select s1=new Select(bmonth);
		s1.selectByValue("7");
		
		WebElement byear = driver.findElement(By.id("years"));
		Select s2=new Select(byear);
		s2.selectByValue("1997");
		
		WebElement checkbox = driver.findElement(By.xpath("//label[contains(text(),'Receive special offers')]"));
		checkbox.click();
		
		
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("EPL");
		
		WebElement adr1 = driver.findElement(By.id("address1"));
		adr1.sendKeys("221");
		
		WebElement adr2 = driver.findElement(By.id("address2"));
		adr2.sendKeys("Baker's street");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Austin");
		
		Thread.sleep(3000);
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select s3=new Select(state);
		s3.selectByValue("43");
		
		WebElement postal = driver.findElement(By.id("postcode"));
		postal.sendKeys("12345");
		
		
		Thread.sleep(3000);
		
		WebElement extra = driver.findElement(By.id("other"));
		extra.sendKeys("We follow Social Distancing");
		
		WebElement phoneno = driver.findElement(By.id("phone"));
		phoneno.sendKeys("044-250626");
		
		WebElement mobileno = driver.findElement(By.id("phone_mobile"));
		mobileno.sendKeys("1234567890");
		
		WebElement registerbtn = driver.findElement(By.id("submitAccount"));
		registerbtn.click();
		
		}

}
