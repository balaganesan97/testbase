	package org.selenium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class Scrollupdown extends BaseClass{
		public static WebDriver driver; 
		public static void main(String[] args) {
		driver=browserLaunch("chrome");
		getUrl("http://demo.automationtesting.in/Frames.html");
		//scrollUp_Down((driver.findElement(By.xpath("(//a[@target='_blank'])[6]"))));
		pixelscrollUp_Down(0, 3000);
		}

}
