package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D1 {
public static void main(String[] args) throws Exception {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.orangehrm.com/");
//	convert WebDriver objet to TakesScreenshot
	TakesScreenshot ts= (TakesScreenshot)driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	File l= new File("D:\\Auto\\Silanium\\Xpath.photo\\screen\\Vishalok1622.png");
	FileUtils.copyFile(f, l);
	System.out.println("Screen shot captured");
driver.close();
}
}
