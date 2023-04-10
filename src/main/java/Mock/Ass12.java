package Mock;
/*
1) Open application
2) Enter ur first name
3) Capture screenshot
4) Click on facebook link 
5) add all details first name ,last name,username and password and DOB and take screenshot
6) come back to main window
7) click on google link
8) enter the pushpa the rise keyword
9) click on wikipedia link
10) capture the release date and month and take screenshot*/

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass12 {
	public static WebDriver driver;

public static void ScreenS(String s) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File f = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\Vishal\\eclipse-workspace\\VishalM\\ScreenShoot\\"+s+".png"));
	System.out.println("TC passed");
}

public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://prafpawar11.github.io/multiplewindows.html");
	driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("India");
	Ass12.ScreenS("main");
	String parent = driver.getWindowHandle();
	driver.findElement(By.linkText("Visit Facebook")).click();
	
	Set<String> w1 = driver.getWindowHandles();
	for(String a:w1) {
		if(!(a.equals(parent))) {
			driver.switchTo().window(a);
			driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("usa");
			driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("US");
			driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("USA@US");
			
//			
//		}
//		
//	}

	
}

}
