package org.selenium;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RobotClass extends BaseClass{
	

			public static WebDriver driver;
		public static void main(String[] args) throws AWTException {
			driver=browserLaunch("chrome");
			getUrl("https://www.google.com/");
			inputTo(driver.findElement(By.name("q")), "cricbuzz");
			keyMoves();
			keyMoves();
			keyMoves();
			keyMoves();
			keyMoves();
			keyMoves();
			keyEnter();
			explictWait(driver.findElement(By.name("q")));
			closeApp();
		}


}
