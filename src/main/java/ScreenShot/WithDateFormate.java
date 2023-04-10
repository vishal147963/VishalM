package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithDateFormate {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat d= new SimpleDateFormat("ddMyy");
		String date=d.format(new Date());
		File l= new File("D:\\Auto\\Silanium\\Xpath.photo\\screen\\"+date+".png");
		FileUtils.copyFile(f, l);
driver.manage().window().minimize();
		System.out.println("ScreenShot Captured");
		driver.quit();
		
		
		//		
//SimpleDateFormat d =new SimpleDateFormat("ddMMyyyy_HHmmss");
//		
//		String date= d.format(new Date());
//		
//		String dist ="C:\\Users\\praf0\\Desktop\\March Automation Batch\\"+date+".png";
//		
//		FileUtils.copyFile(f, new File(dist));
//		
	}
}
