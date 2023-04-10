package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("");
//		convert webdriver object into TakesScreenshoot
		TakesScreenshot ts =(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File l=new File("");
		FileUtils.copyFile(f, l);
	
	}
}
