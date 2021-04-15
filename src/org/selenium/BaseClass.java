package org.selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass {
	public static WebDriver driver;
		public static WebDriver wait;
	public static WebDriver browserLaunch(String browsername) {
	try {
		if (browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		} 
		else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+ "\\Driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
			}
		else {
			System.out.println("invalid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	} catch (Exception e) {
		e.printStackTrace();
	}
		return driver;
		};
		//Urlname
		public static void getUrl(String url) {
		driver.get(url);
	}
	//currenturl	
		public static void currentUrl() {
			driver.getCurrentUrl();
		}
		//title
		public static void title() {
			driver.getTitle();
		}
		//text
		public static void text(WebElement element) {
			element.getText();
		}
		//attribute
		public static void attribute(WebElement element,String option, String value) {
			if (option.equalsIgnoreCase("attributeName")) {
				element.getAttribute(value);}
			else if (option.equalsIgnoreCase("attributeValue")) {
					element.getAttribute(value);
				}
			}

		//click
		public static void clickTo(WebElement element) {
			try {
				element.click();
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			}	
		//sendkeys
		public static void inputTo(WebElement element, String value) {		
			try {
				element.sendKeys(value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	public static void isEnabled(WebElement element) {
	element.isEnabled();
	} 
	public static void isDisplayed(WebElement element){
	element.isDisplayed();
	}
	public static void isSelected(WebElement element){
	element.isSelected();
	}



	//Select 
	public static void dropdown(WebElement element, String value,String option) {
		Select s=new Select(element);
		if (option.equalsIgnoreCase("value")) {
	s.selectByValue(value);		
		}
		else if (option.equalsIgnoreCase("Index")) {
			s.selectByIndex(Integer.parseInt(value));
			
		}else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
			}
		
	}

	public static void multipleSelection(WebElement element) {
		Select s=new Select(element);
		s.isMultiple();
	}
	public static void allSelected(WebElement element) {
		Select s=new Select(element);
		System.out.println(s.getAllSelectedOptions());
	}
	public static void firstSelected(WebElement element) {
		Select s=new Select(element);
		System.out.println(s.getFirstSelectedOption());
	}
	public static void options(WebElement element) {
		Select s=new Select(element);
		System.out.println(s.getOptions());
	}

	//Alert
	public static void alert1(WebElement element) {
		Alert a=driver.switchTo().alert();
		a.accept();
		}
	public static void alert2(WebElement element) {
		Alert a=driver.switchTo().alert();
		a.dismiss();
		}
	public static void alert3(WebElement element, String value) {
		Alert a=driver.switchTo().alert();
		a.sendKeys(null);
		}



	//actions
	public static void contextClk(WebElement element) {
			Actions ac= new Actions(driver);
	ac.contextClick(element).build().perform();
	}
	public static void doubleClk(WebElement element) {
		Actions ac= new Actions(driver);
	ac.doubleClick(element).build().perform();
	}
	public static void moveTo(WebElement element) {
		Actions ac= new Actions(driver);
	ac.moveToElement(element).click().perform();
	}
	public static void dragDrop(WebElement element1,WebElement element2) {
		Actions ac= new Actions(driver);
	ac.dragAndDrop(element1,element2).click().perform();
	}


	//explicitwait
	public static void explictWait(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	//frame
	public static void singleFrame(WebElement element,String value) {
				driver.switchTo().frame(value);		
	}
	public static void parFrames(WebElement element, String value) {	
		driver.switchTo().parentFrame();		
	}
	public static void defaultContent(WebElement element) {	
		driver.switchTo().defaultContent();	
	}

	//Screenshot
	public static void GetScreenshot()  throws IOException{
	TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);	
		File destFile=new File ("C:\\Users\\Balaganesan\\Selenium10am\\Screenshot\\base1.png");
		FileUtils.copyFile(sourceFile, destFile);
	}



	//Robot
	public static void keyMoves() throws AWTException {
	try {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	} catch (AWTException e) {
		e.printStackTrace();
	}
	}
	public static void keyEnter() throws AWTException {
		try {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	}

	//scrollup_down
	public static void scrollUp_Down(WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public static void pixelscrollUp_Down(int a, int b) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
	}
	
	
	//NAVIGATION	
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void back() {
		driver.navigate().back();

	}
	public static void toNavigate(String url) {
		driver.navigate().to(url);

	}

	//Frames
	public static void Frame(String value,String option)  {

	try {
		if (option.equalsIgnoreCase("Index")) {
			driver.switchTo().frame(Integer.parseInt(value));
			
		}
		else if (option.equalsIgnoreCase("value")) {
			driver.switchTo().frame(value);
			
		}
		//else if (option.equalsIgnoreCase("Webelement")) {
		
			//driver.switchTo().frame(WebElement.(value));
			//}
	} catch (NumberFormatException e) {
e.printStackTrace();
	}
	}
	public static void parFrame() {
		
				driver.switchTo().parentFrame();
				}
	public static void content() {
		driver.switchTo().defaultContent();

	}










	//afterexecution
	public static void closeApp() {
		driver.close();

	}
	public static void quitApp() {
		driver.quit();

	}




	}






